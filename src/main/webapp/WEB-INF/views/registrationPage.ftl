/*^([a-z0-9_-]+\.)*[a-z0-9_-]+@[a-z0-9_-]+(\.[a-z0-9_-]+)*\.[a-z]{2,6}$*/

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title(index.ftl)</title>

    <script type="text/javascript">

        function valid(form) {
            var fail = false;
            var name = form.name.value;
            var firstName = form.firstName.value;
            var email = form.email.value;
            var password = form.password.value;
            var rePassword = form.rePassword.value;
            var mailValid =  /^(([^<>()\[\]\.,;:\s@\"]+(\.[^<>()\[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;

            if (name === "" || name === " ")
                fail = "You did not enter your name.";
            else if (firstName === "" || firstName === " ")
                fail = "You did not enter your fist name.";
            else if ( email === "")
                fail = "You did not enter your email.";
            else if (mailValid.test(email) === false)
                        fail = "Wrong mail";
            else if ( password === "")
                fail = "You did not enter your password.";
            else if ( password !== rePassword)
                fail = "You did not enter the same password.";


            if (fail){
                alert(fail);
                return false;
            } else {return true}

        }


    </script>
</head>
<body class="container" background="images/walletHomePage.png">
<#include "templates/header3.ftl">
<br><br><br>
<h1> REGISTRATION PAGE</h1>
<br>
<div id="margin">
    <form  id = "form" action="/newUser" method="post" name="user" class="form-group" onsubmit="valid(this)">


        <p>Name</p>
        <input title="Name" type="text" name="name" placeholder="Enter your name" id = "name"/>
        <p>First name</p>
        <input title="First name" type="text" name="firstName" placeholder="Enter your first name"/>
        <p>Email</p>
        <input title="Email" type="text" name="email" placeholder="Enter your email"/>
        <p>Phone number</p>
        <input title="Phone number" type="text" name="phoneNumber" placeholder="Enter your phone nymber">
        <p>Password</p>
        <input title="Password" type="password" name="password" placeholder="Enter your password">
        <p>rePassword</p>
        <input title="Password" type="password" name="rePassword" placeholder="Repeat password">
        <input type="submit" name="submit" value="Registration"/>
    </form>
</div>
</body>
</html>