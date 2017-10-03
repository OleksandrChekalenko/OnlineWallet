<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WalletData</title>
</head>
<body class="container">
<#include "templates/header.ftl">
<div class="table-responsive">
    <caption>Users list</caption>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>First name</th>
            <th>Phone number</th>
        </tr>
    <#list usersList as users>
        <tr>
            <td>${users.id}</td>
            <td>${users.name}</td>
            <td>${users.firstName}</td>
            <td>${users.phoneNumber}</td>
        </tr>
    </#list>
    </table>
</div>
</body>
</html>