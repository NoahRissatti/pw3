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

        users = ((Map<String, User>) context.getAttribute("users"));

        users.put(reqUser.getUsuario(), reqUser);

        String usuario = reqUser.getUsuario();
        session.setAttribute("usuario", usuario);

        String cpf = reqUser.getCpf();
        session.setAttribute("cpf", cpf);
        
        String nome = reqUser.getNomeCompleto();
        session.setAttribute("nome", nome);

        resp.sendRedirect("/projetopw3/menu.jsp");

    }
}
