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
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Age</th>
            <th>Buttons</th>
        </tr>
    <#list wallets as wallet>
        <tr>
            <td><a href="/wallet/${wallet.id}">${wallet.id}</a></td>
            <td>${wallet.name}</td>
            <td>${wallet.email}</td>
            <td>${wallet.age}</td>
            <td><a href="/delete/${wallet.id}">Delete</a>
                <a href="/edit/${wallet.id}">Edit</a>
            </td>
        </tr>
    </#list>
    </table>
</div>
<#include "templates/createWalletForm.ftl"/>
</body>
</html>