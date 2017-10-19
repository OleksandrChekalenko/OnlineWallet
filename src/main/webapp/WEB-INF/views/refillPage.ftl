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
   <#-- Id-->
    <input title="Id" type="number" name="id" value="${wallet.id}" hidden />
    <#--Number-->
       <p>${wallet.number?c}</p>
    <input title="Number" type="number" size="10" name="number" value="${wallet.number?c}" hidden />
    <#--Type-->
    <input title="Type" type="text" name="type" value="${wallet.type}" hidden/>
    Sum of refill
    <input title="Sum of refill" type="number" step="0.01" name="funds" value="${wallet.funds}" />
    <#--Currency-->
    <input title="Wallet currency" type="text" name="walletCurrency" value="${wallet.walletCurrency}" hidden/>
    <input type="submit" value="Refill"/>
</form>
</body>
</html>
