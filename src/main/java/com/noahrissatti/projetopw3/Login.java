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

@WebServlet("/loginservlet")
public class Login extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        ServletContext context = getServletContext();
        Map<String, User> users;

        User reqUser = new User();

        reqUser.setUsuario(req.getParameter("usuario"));
        reqUser.setPassword(req.getParameter("senha"));

        if (context.getAttribute("users") == null) {
            users = new HashMap<String, User>();
            context.setAttribute("users", users);
        } else {
            users = (Map<String, User>) context.getAttribute("users");
        }

        if (users.get(reqUser.getUsuario()) != null
                && users.get(reqUser.getUsuario()).getPassword().equals(reqUser.getPassword())) {

            session.setAttribute("auth", reqUser.getUsuario());
            session.setAttribute("message", "Logado com sucesso!");
            
            User respUser = users.get(reqUser.getUsuario());

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

            resp.sendRedirect("/projetopw3/menu.jsp");

        } else {
            session.setAttribute("message", "Não foi possível fazer login");
            resp.sendRedirect("/projetopw3/login.jsp");
        }
    }
}
