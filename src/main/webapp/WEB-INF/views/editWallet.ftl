
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WalletData</title>
</head>
<body class="container">
<#include "templates/header3.ftl">

<form action="/editWallet" method="post" number="wallet" class="form-group">
    <#--<input title="Id" type="number" number="id" value="${wallet.id}"/>-->
    <input title="Number" type="number" number="number" value="${wallet.number}"/>
    <input title="Type" type="text" number="type" value="${wallet.type}"/>
    <input type="submit" title="OK" value="Edit!"/>
</form>
<#--<a type="button" href="/wallets" class="button">Back</a>-->
</body>
</html>

