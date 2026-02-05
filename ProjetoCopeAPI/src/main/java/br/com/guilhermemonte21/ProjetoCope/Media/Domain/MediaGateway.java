package br.com.guilhermemonte21.ProjetoCope.Media.Domain;

import java.util.Optional;
import java.util.UUID;

public interface MediaGateway {

    String generateUploadUrl(String key, String contentType);

    String generateDownloadUrl(String key);
}