<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WalletData</title>
</head>
<body class="container">
<#include "templates/header3.ftl">
<BR><BR><BR>
<div <#--class="table-responsive"-->id="margin">
    <caption>User info</caption>
    <table class="table table-striped">
        <tr>
            <td>Id</td>
            <td>${user.id}</a></td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${user.number}</td>
        </tr>
        <tr>
            <td>First name</td>
            <td>${user.firstName}</td>
        </tr>
        <td>Phone number</td>
        <td>${user.phoneNumber}</td>
        </tr>
    </table>
</div>

<div <#--class="table-responsive"-->id="margin">
    <caption>Users</caption>
    <table class="table table-striped">
        <tr>
            <td>Id</td>
            <td>Name</a></td>
            <td>First name</a></td>
            <td>Phone number</a></td>
        </tr>
    <#list user.usersList as users>
        <tr>
            <td>${users.id}</td>
            <td>${users.name}</td>
            <td>${users.firstName}</td>
            <td>${users.phoneNumber}</td>
        </tr>
    <#else>
        <h1>Empty users</h1>
    </#list>

    </table>
</div>
<a type="button" href="/users" class="button">Back</a>
</body>
</html>