<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title(index.ftl)</title>
</head>
<body class="container">
<#include "templates/header3.ftl">
<br><br><br>
<h1> TRANSFER PAGE</h1>

<div  id="margin">
    <table class="table table-striped">
        <tr>
            <th>Number</th>
            <th>Type</th>
            <th>Funds</th>
            <th>Currency</th>
            <th>Button</th>
            <th>Button</th>
        </tr>
    <#list wallets as wallet>
        <tr>
            <td>${wallet.number}</td>
            <td>${wallet.type}</td>
            <td>${wallet.funds}</td>
            <td>${wallet.walletCurrency}</td>
            <td><a href="/payments/transfer/${wallet.number?c}">Transfer</a></td>
            <td><a href="/payments/exchange/${wallet.number?c}">Exchange</a></td>
        </tr>
    </#list>
    </table>
</div>
</body>
</html>