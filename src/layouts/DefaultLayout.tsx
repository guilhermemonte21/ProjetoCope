import { Outlet } from "react-router-dom";
import Header from "../components/Header";

export default function DefaultLayout() {
  return (
    <div className="min-h-screen flex flex-col">
      <Header />
      {/* main agora ocupa todo o espaço restante */}
      <main className="flex-1">
        <Outlet />
      </main>
    </div>
  );
}
