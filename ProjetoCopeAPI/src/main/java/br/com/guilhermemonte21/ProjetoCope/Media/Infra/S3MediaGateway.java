package br.com.guilhermemonte21.ProjetoCope.Media.Infra;

import br.com.guilhermemonte21.ProjetoCope.Media.Domain.MediaGateway;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.presigner.S3Presigner;
import software.amazon.awssdk.services.s3.presigner.model.GetObjectPresignRequest;
import software.amazon.awssdk.services.s3.presigner.model.PutObjectPresignRequest;

import java.time.Duration;
import java.util.Optional;
import java.util.UUID;

@Component
public class S3MediaGateway implements MediaGateway {

    private final S3Presigner presigner;
    private final String bucket;

    public S3MediaGateway(S3Presigner presigner, String bucket) {
        this.presigner = presigner;
        this.bucket = bucket;
    }

    @Override
    public String generateUploadUrl(String key, String contentType) {

        PutObjectRequest request = PutObjectRequest.builder()
                .bucket(bucket)
                .key(key)
                .contentType(contentType)
                .build();

        PutObjectPresignRequest presignRequest =
                PutObjectPresignRequest.builder()
                        .putObjectRequest(request)
                        .signatureDuration(Duration.ofMinutes(15))
                        .build();

        return presigner.presignPutObject(presignRequest)
                .url()
                .toString();
    }

    @Override
    public String generateDownloadUrl(String key) {

        GetObjectRequest request = GetObjectRequest.builder()
                .bucket(bucket)
                .key(key)
                .build();

        GetObjectPresignRequest presignRequest =
                GetObjectPresignRequest.builder()
                        .getObjectRequest(request)
                        .signatureDuration(Duration.ofMinutes(10))
                        .build();

        return presigner.presignGetObject(presignRequest)
                .url()
                .toString();
    }
}