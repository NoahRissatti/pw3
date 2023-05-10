package com.noahrissatti.projetopw3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cadastroservlet")
public class Cadastro extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        ServletContext context = getServletContext();
        Map<String, User> users;
        User reqUser = new User();

        reqUser.setUsuario(req.getParameter("usuario"));
        reqUser.setCpf(req.getParameter("cpf"));
        reqUser.setNomeCompleto(req.getParameter("nome"));
        reqUser.setEmail(req.getParameter("email"));
        reqUser.setPassword(req.getParameter("senha"));

        if (context.getAttribute("users") == null) {
            users = new HashMap<String, User>();
            context.setAttribute("users", users);
        } else {
            users = ((Map<String, User>) context.getAttribute("users"));
        }

        if (users.get(reqUser.getUsuario()) == null) {
            users.put(reqUser.getUsuario(), reqUser);
            session.setAttribute("message", "Cadastro feito com sucesso!");
            resp.sendRedirect("/projetopw3/login.jsp");
        } else {
            resp.sendRedirect("/projetopw3/cadastro.jsp");
        }
    }
}
