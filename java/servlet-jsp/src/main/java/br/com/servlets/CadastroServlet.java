package br.com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/Register")
public class CadastroServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //pegando os parametros
        String nome = req.getParameter("nome");
        String idade = req.getParameter("idade");

        //saida dos dados
        resp.setContentType("text/html");
        resp.getWriter().println("<html>");
        resp.getWriter().println("<body>");
        resp.getWriter().println("<p>Nome: " + nome + "</p>");
        resp.getWriter().println("<p>Idade: " + idade + "</p>");
        resp.getWriter().println("</html>");
        resp.getWriter().println("</body>");
    }
}
