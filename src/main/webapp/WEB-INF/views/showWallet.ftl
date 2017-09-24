<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WalletData</title>
</head>
<body class="container">
<#include "templates/header.ftl">
<div class="table-responsive">
    <caption>Wallet info</caption>
    <table class="table table-striped">
        <tr>
            <td>Id</td>
            <td>${wallet.id}</a></td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${wallet.name}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${wallet.email}</td>
        </tr>
        <td>Age</td>
        <td>${wallet.age}</td>
        </tr>
    </table>
</div>

<div class="table-responsive">
    <caption>Wallet goods</caption>
    <table class="table table-striped">
        <tr>
            <td>Id</td>
            <td>Name</a></td>
            <td>Price</a></td>
        </tr>
    <#list wallet.goodsList as goods>
        <tr>
            <td>${goods.id}</td>
            <td>${goods.name}</td>
            <td>${goods.price}</td>
        </tr>
    <#else>
        <h1>Empty goods</h1>
    </#list>

    </table>
</div>
<a type="button" href="/wallets" class="button">Back</a>
</body>
</html>