<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "templates/header3.ftl">
<br><br><br>

<form action="/user/update" method="post" name="user" class="form-group">
   Id
    <input title="Id" type="number" name="id" value="${users.id}" />
    Name
    <input title="Name" type="text" name="name" value="${users.name}"/>
    First name
    <input title="First name" type="text" name="firstName" value="${users.firstName}"/>
    Email
    <input title="Email" type="text" name="email" value="${users.email}"/>
    Password
    <input title="Password" type="text" name="password" value="${users.password}"/>
    Phone Number
    <input title="Number" type="number" name="phoneNumber" value="${users.phoneNumber}"/>
    <input type="submit" value="Update"/>
</form>
<a type="button" href="/" class="button">Back</a>
</body>
</html>
<#--
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">
<#include "templates/header.ftl">

<form action="/editUser" method="post" name="user" class="form-group">
    <input title="Id" type="number" name="name" value="${user.id}"/>
    <input title="Name" type="text" name="name" value="${user.name}"/>
    <input title="Email" type="text" name="email" value="${user.email}"/>
    <input title="Age" type="number" name="age" value="${user.age}"/>
    <input type="submit" title="OK" value="Edit!"/>
</form>
<a type="button" href="/users" class="button">Back</a>
</body>
</html>
-->