<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WalletData</title>
</head>
<body class="container">
<#include "templates/header.ftl">
<div class="table-responsive" style="background-color: aqua">
    <caption>Wallets list</caption>
    <table class="table table-striped">
        <tr>
            <#--<th>Id</th>-->
            <th>Number</th>
            <th>Type</th>
            <th>Buttons</th>
        </tr>
    <#list wallets as wallet>
        <tr>
            <#--<td><a href="/wallet/${wallet.id}">${wallet.id}</a></td>-->
            <td>${wallet.number}</td>
            <td>${wallet.type}</td>
            <td><a href="wallets/delete/${wallet.number}">Delete</a>
                <#--<a href="/edit/${wallet.number}">Edit</a>-->
            </td>
        </tr>
    </#list>
    </table>
</div>
<#include "templates/createWalletForm.ftl"/>
</body>
</html>