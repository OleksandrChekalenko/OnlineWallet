
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WalletData</title>
</head>
<body class="container">
<#include "templates/header.ftl">

<form action="/editWallet" method="post" name="wallet" class="form-group">
    <input title="Id" type="number" name="id" value="${wallet.id}"/>
    <input title="Name" type="text" name="name" value="${wallet.name}"/>
    <input title="Email" type="text" name="email" value="${wallet.email}"/>
    <input title="Age" type="number" name="age" value="${wallet.age}"/>
    <input type="submit" title="OK" value="Edit!"/>
</form>
<a type="button" href="/wallets" class="button">Back</a>
</body>
</html>

