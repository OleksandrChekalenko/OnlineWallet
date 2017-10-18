<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title(index.ftl)</title>
    <style>

        #ow {
            margin: 20px 100px 20px 100px;
        }
        #button {
            background-color: #000000;
            color: white;
            padding: 14px 20px;
            margin: 8px 0 5px 10px;
            border: none;
            cursor: pointer;
            width: 20%;
        }
        .fig {
            text-align: center; /* Выравнивание по центру */
        }
    </style>
</head>
<body class="container">
<br>
<#include "WEB-INF/views/templates/header3.ftl">
<br><br>

<form action="/registration" method="get" name="registration" class="form-group">
    <button id="button" type="submit">Registration</button>
</form>

<form action="/loginPage" method="get" name="login" class="form-group">
    <button id="button" type="submit">LOGIN</button>

</form>

<br><br><br>

<p id="ow">OW (OnlineWallet) - electronic instant messaging system, environment and technology for doing
    business and e-commerce.</p>



<p class="fig"><img src="WEB-INF/resources/images/walletHomePage.png" alt="" ></p>
</body>
</html>