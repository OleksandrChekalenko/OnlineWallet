<#--<html>
<head></head>
<body>
<h1>Login</h1>
<form name='f' action="login" method='POST'>
    <table>
        <tr>
            <td>User:</td>
            <td><input type='text' name='name' value=''></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type='password' name='password' /></td>
        </tr>
        <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
        </tr>
    </table>
</form>

<p>in templates</p>
</body>
</html>-->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>
<body class="container">

<form action="/loginPage" method="post" class="form-group">
    Name
    <input title="Name" type="text" name="name" "/>
    Password
    <input title="Password" type="text" name="password" "/>
    <input type="submit" value="Login"/>
</form>
<h1>I'm login page</h1>

</body>
</html>