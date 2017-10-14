<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WalletData</title>
</head>
<body class="container">
<#include "templates/header2.ftl">
<div class="table-responsive">
    <caption>Wallets list</caption>
    <table class="table table-striped">
        <tr>
            <#--<th>Id</th>-->
            <th>Number</th>
            <th>Type</th>
            <th>Currency</th>
            <th>Buttons</th>
        </tr>
    <#list wallets as wallet>
        <tr>
            <#--<td><a href="/wallet/${wallet.id}">${wallet.id}</a></td>-->
            <td>${wallet.number}</td>
            <td>${wallet.type}</td>
                <td>${wallet.walletCurrency}</td>
            <td><a href="wallets/delete/${wallet.number?c}">Delete</a>
                <#--<a href="/edit/${wallet.number}">Edit</a>-->
            </td>
        </tr>
    </#list>
    </table>
</div>
<#include "templates/createWalletForm.ftl"/>
</body>
</html>