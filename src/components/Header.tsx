export default function Header() {
  return (
    <header style={{ padding: "16px", borderBottom: "1px solid #ccc" }}>
      <nav style={{ display: "flex", gap: "16px" }}>
        <a href="/">Home</a>
        <a href="/cursos">Cursos</a>
        <a href="/login">Login</a>
      </nav>
    </header>
  );
}


//o <link> apomnta pra cada rota minha