package com.noahrissatti.projetopw3;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/editarservlet")
public class Editar extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        ServletContext context = getServletContext();

        Map<String, User> users = (Map<String, User>) context.getAttribute("users");
        User respUser = users.get((String)context.getAttribute("usuarioAutenticado"));

        String usuario = respUser.getUsuario();
        session.setAttribute("usuario", usuario);

        String cpf = respUser.getCpf();
        session.setAttribute("cpf", cpf);
        
        String nome = respUser.getNomeCompleto();
        session.setAttribute("nome", nome);

        String email = respUser.getEmail();
        session.setAttribute("email", email);

        String senha = respUser.getPassword();
        session.setAttribute("senha", senha);
    }
}
