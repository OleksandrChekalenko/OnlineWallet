<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title(index.ftl)</title>
</head>
<body class="container">
<#include "templates/header3.ftl">
<br><br><br>
<h1> TRANSFER PAGE NUMBER</h1>

<form action="/payments/transfer/moneyTransfer" method="post"  class="form-group">
    <#--<input title="Id" type="number" name="wallet.id" value="${wallet.id}" hidden />-->
       <p>${wallet.number?c}</p>
    <input title="Number" type="number" size="10" name="fromNumber" value="${wallet.number?c}" hidden />
    <#--<input title="Type" type="text" name="wallet.type" value="${wallet.type}" hidden/>-->
    <#--<input title="Wallet currency" type="text" name="wallet.walletCurrency" value="${wallet.walletCurrency}" hidden/>-->
    <#--<input title="Founds" type="number" step="0.01" name="wallet.funds" value="${wallet.funds}" hidden/>-->
    Number to transfer
    <input title="Number to transfer" type="number"  size="10" name="numberTo">
    Sum of transfer
    <input title="SumOfTransfer" type="number" step="0.01" name="money"/>
    <input type="submit" value="Transfer"/>
</form>
</body>
</html>
