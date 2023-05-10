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

@WebServlet("/excluirservlet")
public class Excluir extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        ServletContext context = getServletContext();
        Map<String, User> users;

        User reqUser = new User();

        users = (Map<String, User>) context.getAttribute("users");

        users.remove(session.getAttribute("usuario"));

        resp.sendRedirect("/projetopw3/login.jsp");
    }
}
