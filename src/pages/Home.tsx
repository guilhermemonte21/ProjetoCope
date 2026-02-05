import { Link } from "react-router-dom";

export default function Home() {
  return (
    <div className="bg-gray-50 min-h-screen">
      
  {/* Seção Hero - Primeira impressão do usuario */}
      <section className="bg-gradient-to-r from-blue-600 to-blue-800 text-white py-20">
        <div className="max-w-7xl mx-auto px-4 text-center">
          
     <h1 className="text-5xl font-bold mb-4">
          Aprenda sem limites
          </h1>
          
     <p className="text-xl mb-8 text-blue-100">
       Milhares de cursos online para você dominar novas habilidades
        </p>
         
        <Link 
         to="/cursos" 
            className="bg-white text-blue-600 px-8 py-3 rounded-lg font-semibold hover:bg-gray-100 transition inline-block"
          >
            Explorar Cursos
          </Link>
          
        </div>
      </section>

      {/* Seção de benefícios */}
      <section className="py-16">
        <div className="max-w-7xl mx-auto px-4">
          
          <h2 className="text-3xl font-bold text-center mb-12 text-gray-800">
            Por que escolher a ProjetoCope?
          </h2>

          {/* Grid de cards */}
          <div className="grid grid-cols-1 md:grid-cols-3 gap-8">
            
            {/* Card 1 */}
            <div className="bg-white p-6 rounded-lg shadow-md hover:shadow-xl transition">
              <div className="text-4xl mb-4">🎓</div>
              <h3 className="text-xl font-bold mb-2 text-gray-800">
                Instrutores Qualificados
              </h3>
              <p className="text-gray-600">
                Aprenda com os melhores profissionais do mercado
              </p>
            </div>

            {/* Card 2 */}
            <div className="bg-white p-6 rounded-lg shadow-md hover:shadow-xl transition">
              <div className="text-4xl mb-4">⏰</div>
              <h3 className="text-xl font-bold mb-2 text-gray-800">
                Aprenda no seu ritmo
              </h3>
              <p className="text-gray-600">
                Assista quando e onde quiser, no seu tempo
              </p>
            </div>

            {/* Card 3 */}
            <div className="bg-white p-6 rounded-lg shadow-md hover:shadow-xl transition">
                <div className="text-4xl mb-4">🏆</div>
                <h3 className="text-xl font-bold mb-2 text-gray-800">
                Certificados Reconhecidos
                </h3>
              <p className="text-gray-600">
                Ganhe certificados ao completar os cursos
                </p>
                </div>

          </div>
          </div>
          </section>

         </div>
  );
}