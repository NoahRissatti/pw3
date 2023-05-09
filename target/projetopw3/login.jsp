<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PW3</title>
    <link rel="stylesheet" href="css/login.css">
</head>

<body>
    <form action="loginservlet" method="post">
        <h2>Entre com seu usuário e senha:</h2>
        <label for="usuario">Usuário:</label>
        <input type="text" id="usuario" name="usuario"><br><br>
        <label for="senha">Senha:</label>
        <input type="password" id="senha" name="senha"><br><br>
        <div class="botoes">
            <input type="submit" value="Enviar" class="botao--enviar">
            <a class="botao--cadastro" href="http://localhost:8080/projetopw3/cadastro.jsp">Criar cadastro</a>
        </div>
    </form>
</body>