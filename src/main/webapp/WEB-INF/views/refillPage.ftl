<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title(index.ftl)</title>
</head>
<body class="container">
<#include "templates/header3.ftl">
<br><br><br>
<h1> REFILL PAGE</h1>

<form action="/payments/refill/addFunds" method="post" name="wallet" class="form-group">
    Sum of refill
    <input title="Sum of refill" type="number" name="funds" value="${wallet.funds}" />
    <input type="submit" value="Refill"/>
</form>
</body>
</html>