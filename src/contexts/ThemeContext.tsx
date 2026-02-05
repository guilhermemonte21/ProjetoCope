import { createContext, useContext, useState,  } from 'react';
import type { ReactNode } from 'react';
//todas as anotações vai ta no notas.md


// Tipos do tema
type Theme = 'light' | 'dark'; //so pode ser escuro ou claro 

// Tipo do contexto
type ThemeContextType = {
  theme: Theme;
  toggleTheme: () => void;
};

// Cria o contexto ("container q vai guarda os dados")
const ThemeContext = createContext<ThemeContextType | undefined>(undefined);

export function ThemeProvider({ children }: { children: ReactNode }) {
  // Já inicia com o tema salvo (se tiver)
  const [theme, setTheme] = useState<Theme>(() => {
    const savedTheme = localStorage.getItem('theme') as Theme;
    return savedTheme || 'light';
  });

  // Não precisa mais do useEffect pra carregar!
  
  const toggleTheme = () => {
    const newTheme = theme === 'light' ? 'dark' : 'light';
    setTheme(newTheme);
    localStorage.setItem('theme', newTheme);
  };

  return (
    <ThemeContext.Provider value={{ theme, toggleTheme }}>
      {children}
    </ThemeContext.Provider>
  );
}

// Hook customizado pra usar o tema
// eslint-disable-next-line react-refresh/only-export-components
export function useTheme() {
  const context = useContext(ThemeContext);
  if (!context) {
    throw new Error('useTheme deve ser usado dentro de ThemeProvider');
  }
  return context;
}