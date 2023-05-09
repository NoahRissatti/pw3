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
    <form action="cadastroservlet" method="post" class="form--cadastro">
        <h2>Crie sua conta: </h2>
        <label for="usuario">Usuário:</label>
        <input type="text" id="usuario" name="usuario"><br><br>
        <label for="senha">Senha:</label>
        <input type="password" id="senha" name="senha"><br><br>
        <label for="nome">Nome completo:</label>
        <input type="text" id="nome" name="nome" minlength="4"><br><br>
        <label for="cpf">CPF:</label>
        <input type="text" id="cpf" name="cpf" maxlength="14"><br><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" minlength="4"><br><br>
        <input type="submit" value="Enviar" class="botao--enviar">
    </form>
</body>

</html>
