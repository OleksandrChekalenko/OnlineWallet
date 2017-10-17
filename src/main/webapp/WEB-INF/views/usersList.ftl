<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container" >

<#include "templates/header3.ftl">
<div class="table-responsive">
    <caption>Users list</caption>
    <BR><BR><BR>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>First name</th>
            <th>Password</th>
            <th>Phone number</th>
            <th>Buttons</th>

        </tr>
    <#list usersList as users>
        <tr>
            <td>${users.id}</td>
            <td>${users.name}</td>
            <td>${users.firstName}</td>
            <td>${users.password}</td>
            <td>${users.phoneNumber}</td>
            <td><a href="users/delete/${users.id}">Delete</a> </td>
            <td><a href="users/delete/${users.id}">Delete</a> </td>
        </tr>
    </#list>
    </table>
</div>
<#include "templates/createUsersForm.ftl"/>
</body>
</html>
<#--



<#list wallets as wallet>
<tr>

    <td>${wallet.number}</td>
    <td>${wallet.type}</td>
    <td><a href="/delete/${wallet.number}">Delete</a>

    </td>
</tr>
</#list>
</table>
</div>
<#include "templates/createWalletForm.ftl"/>
</body>
</html>-->