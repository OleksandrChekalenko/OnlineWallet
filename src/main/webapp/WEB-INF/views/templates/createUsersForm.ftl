<form action="/newUser" method="post" name="user" class="form-group" >


    <p>Name</p>
    <input title="Name" type="text" name="name"/>
    <p>First name</p>
    <input title="First name" type="text" name="firstName"/>
    <p>Email</p>
    <input title="Email" type="text" name="email"/>
    <p>Password</p>
    <input title="Password" type="text" name="password">
    <p>Phone number</p>
    <input title="Phone number" type="text" name="phoneNumber">
    <input type="submit" value="OK"/>
</form>
<form   action="/newUser" method="post" name="user" class="form-group" id = "form"">


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
