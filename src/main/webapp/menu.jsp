<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PW3</title>
    <link rel="stylesheet" href="css/home.css">
</head>
<body>

    <%
    String usuario = (String)session.getAttribute("usuario"); 
    String senha = (String)session.getAttribute("senha");
    String email = (String)session.getAttribute("email");
    String cpf = (String)session.getAttribute("cpf");
    String nome = (String)session.getAttribute("nome");        
    %>

    <header>
        <nav>
            <ul>
                <li>
                    <a>
                        Minha conta
                    </a>
                </li>
                <li>
                    <a href="http://localhost:8080/projetopw3/editar.jsp">
                        Editar
                    </a>
                </li>
                <li>
                    <a href="http://localhost:8080/projetopw3/login.jsp">
                        Sair
                    </a>
                </li>
            </ul>
        </nav>
    </header>
    <div class="minha--conta">
        <h2>Minha conta</h2>
        <h3>Nome Completo</h3>
        <p><%=nome%></p>
        <h3>Usuário</h3>
        <p><%=usuario%></p>
        <h3>CPF</h3>
        <p><%=cpf%></p>
    </div>
</body>
</html>