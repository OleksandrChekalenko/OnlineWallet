<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title(index.ftl)</title>
    <style>
        .fig {
            text-align: center; /* Выравнивание по центру */
        }
    </style>
</head>
<body class="container">
<#include "WEB-INF/views/templates/header3.ftl">
<br><br><br>

<form action="/registration" method="get" name="registration" class="form-group">
    <input type="submit" value="Registration"/>
</form>
<br><br><br>

<form action="/loginPage" method="get" name="login" class="form-group">
    <input type="submit" value="LOGIN"/>
</form>
<br><br><br>

<p>OW (OnlineWallet) - electronic instant messaging system, environment and technology for doing
    business and e-commerce.</p>



<p class="fig"><img src="/resources/images/walletHomePage.png" alt="Bad internet!" ></p>
</body>
</html>