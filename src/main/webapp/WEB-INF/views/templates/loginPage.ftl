<!DOCTYPE html>
<html>
<style>
    form {
        border: 3px solid #f1f1f1;
    }

    input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }

    button {
        background-color: #000000;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
    }

    button:hover {
        opacity: 0.8;
    }

    #margin2 {
        margin: 100px 100 100 100px;
    }


    .cancelbtn {
        width: auto;
        padding: 10px 18px;
        background-color: #f44336;
    }

    .imgcontainer {
        text-align: center;
        margin: 24px 0 12px 0;
    }

    img.avatar {
        width: 40%;
        border-radius: 50%;
    }

    .container {
        padding: 16px;
    }

    span.psw {
        float: right;
        padding-top: 16px;
    }

    /* Change styles for span and cancel button on extra small screens */
    @media screen and (max-width: 300px) {
        span.psw {
            display: block;
            float: none;
        }
        .cancelbtn {
            width: 100%;
        }
    }
</style>
<head>

    <script type="text/javascript">

        function valid(form) {
            var fail = false;
            var name = form.name.value;
            var password = form.password.value;

            if (name === "" || name === " ")
                fail = "You did not enter your name.";
            else if ( password === "")
                fail = "You did not enter your password.";

            if (fail){
                alert(fail);
                return false;
            } else {return true}

        }

</script>
        </head>
<body>

<#include "header3.ftl">
<br><br><br>

<div id = "margin2">
<form id="form" action="/loginPage" method="post"  class="form-group" onsubmit="valid(this)">

    <div class="container">
        <label><b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="name" id="name">

        <label><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" id="password">

        <button type="submit">Login</button>
        <#--<input type="checkbox" checked="checked"> Remember me-->
    </div>
</form>
</div>
</body>
</html>