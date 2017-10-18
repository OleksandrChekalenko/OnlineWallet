<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WalletData</title>
</head>
<body class="container">
<#include "templates/header3.ftl">
<div <#--class="table-responsive"-->id="margin">
    <caption>Wallet info</caption>
    <table class="table table-striped">
        <tr>
            <td>Id</td>
            <td>${wallet.id}</a></td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${wallet.number}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${wallet.type}</td>
        </tr>
        <td>Age</td>
        <td>${wallet.age}</td>
        </tr>
    </table>
</div>

<div <#--class="table-responsive"-->id="margin">
    <caption>Wallet users</caption>
    <table class="table table-striped">
        <tr>
            <td>Id</td>
            <td>Name</a></td>
            <td>Price</a></td>
        </tr>
    <#list wallet.walletList as wallets>
        <tr>
            <td>${wallets.id}</td>
            <td>${wallets.number}</td>
            <td>${wallets.price}</td>
        </tr>
    <#else>
        <h1>Empty wallets</h1>
    </#list>

    </table>
</div>
<#--<a type="button" href="/wallets" class="button">Back</a>-->
</body>
</html>