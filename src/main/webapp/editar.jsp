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
                    <a href="http://localhost:8080/projetopw3/menu.jsp">
                        Minha conta
                    </a>
                </li>
                <li>
                    <a>
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
    <div>
        <form action="editarservlet" method="post" class="form--cadastro">
            <h2>Edite seus dados: </h2>
            <label for="usuario">Usuário:</label>
            <input type="text" id="usuario" name="usuario" value="<%=usuario%>"><br><br>
            <label for="senha">Senha:</label>
            <input type="password" id="senha" name="senha" value="<%=senha%>"><br><br>
            <label for="nome">Nome completo:</label>
            <input type="text" id="nome" name="nome" minlength="4" value="<%=nome%>"><br><br>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" minlength="4" value="<%=email%>"><br><br>
            <input type="submit" value="Enviar" class="botao--enviar">
        </form>
        <form action="excluirservlet" method="post">
            <input type="submit" value="Excluir conta" class="botao--excluir">
        </form>
    </div>
</body>
</html>