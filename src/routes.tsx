import { BrowserRouter, Routes, Route } from "react-router-dom";

import DefaultLayout from "./layouts/DefaultLayout";

import Home from "./pages/Home";
import Cursos from "./pages/Cursos";
import Login from "./pages/Login";

export default function AppRoutes() {
  return (
    <BrowserRouter>
      <Routes>

        {/* Rotas com layout (Header) */}
        <Route element={<DefaultLayout />}>
          <Route path="/" element={<Home />} />
          <Route path="/cursos" element={<Cursos />} />
        </Route>

        {/* Rota sem layout */}
        <Route path="/login" element={<Login />} />

      </Routes>
    </BrowserRouter>
  );
}
