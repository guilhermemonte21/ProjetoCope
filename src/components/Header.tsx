import { Link } from "react-router-dom"
import { useTheme } from "../contexts/ThemeContext"; 

export default function Header() {
  //pega o tema e a funçao alterar

  const {theme, toggleTheme} = useTheme()


  return (
    <header className={`shadow-md sticky top-0 z-50 transition-colors ${
      theme === 'dark' 
        ? 'bg-gray-900 text-white' 
        : 'bg-white text-gray-900'
    }`}>

    <div className="max-w-7xl mx-auto px-4 py-4 flex items-center justify-between">
    
            {/* Logo/Nome do site */}
        <div className="text-2xl font-bold">
          <Link 
            to="/" 
            className={theme === 'dark' ? 'text-blue-400' : 'text-blue-600'}
          >
          ProjetoCope
         </Link>
        </div>

        {/* Links de navegação */}
        <nav className="flex gap-8 items-center">
          <Link 
          to="/"
          className={`transition ${
            theme === 'dark'
         ?  'text-gray-300 hover:text-blue-400' 
                : 'text-gray-700 hover:text-blue-600'
            }`}
          >
            Home
          </Link>
          <Link 
          to="/cursos"
          className={`transition ${
          theme === 'dark'
            ? 'text-gray-300 hover:text-blue-400' 
                : 'text-gray-700 hover:text-blue-600'
        
        }`}
          >

          Cursos
          </Link>

    {/* Botão de alternar tema */}
    <button
    onClick={toggleTheme}
    className={`p-2 rounded-lg transition ${
              theme === 'dark'
              ? 'bg-gray-800 hover:bg-gray-700 text-yellow-400'
             : 'bg-gray-100 hover:bg-gray-200 text-gray-700'
          }`}
          title={theme === 'dark' ? 'Modo claro' : 'Modo escuro'}
        >
            {theme === 'dark' ? '☀️' : '🌙'}
          </button>
        </nav>


         {/* Botão de Login */}
       <div>
         <Link 
           to="/login" 
           className={`px-6 py-2 rounded-lg transition ${
             theme === 'dark'
         ? 'bg-blue-600 hover:bg-blue-700 text-white'
            : 'bg-blue-600 hover:bg-blue-700 text-white'
            }`}
          >
          Login
          </Link>
    </div>

      </div>
    </header>
  );
}