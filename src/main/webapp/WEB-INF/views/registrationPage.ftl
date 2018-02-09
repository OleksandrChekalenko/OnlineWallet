<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title(index.ftl)</title>

    <script type="text/javascript">

        function valid(form) {
            var fail = false;
            var name = form.name.value;

            if (name == "" || name == " "){
                fail = "You did not enter your name."
            }
            if (fail)
                alert(fail);
             }


    </script>
</head>
<body class="container">
<#include "templates/header3.ftl">
<br><br><br>
<h1> REGISTRATION PAGE</h1>
<br>
<div id="margin">
    <form  id = "form" action="/newUser" method="post" name="user" class="form-group" <#--onsubmit="valid(this)-->">


        <p>Name</p>
        <input title="Name" type="text" name="name" placeholder="Name" id = "name"/>
        <p>First name</p>
        <input title="First name" type="text" name="firstName"/>
        <p>Email</p>
        <input title="Email" type="text" name="email"/>
        <p>Password</p>
        <input title="Password" type="text" name="password">
        <p>Phone number</p>
        <input title="Phone number" type="text" name="phoneNumber">
        <input type="button" name="submit" onclick="valid(document.getElementById('form'))" value="OK"/>
    </form>
</div>
</body>
</html>