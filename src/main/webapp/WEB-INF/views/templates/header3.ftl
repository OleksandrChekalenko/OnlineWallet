<!DOCTYPE html>
<html>
<title>Online Wallet</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>

    #margin {

        margin: 20px 20px 100px;

    }
    #button {
        background-color: #000000;
        color: white;
        padding: 14px 20px;
        margin: 8px 0 5px 10px;
        border: none;
        cursor: pointer;
        width: 20%;
    }
    table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}</style>
<body>

<!-- Navbar -->
<div class="w3-top">
    <div class="w3-bar w3-black w3-card-2">
        <a class="w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right" href="javascript:void(0)" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
        <a href="/" class="w3-bar-item w3-button w3-padding-large">HOME</a>
        <a href="/wallet/wallets" class="w3-bar-item w3-button w3-padding-large w3-hide-small">WALLET</a>
        <div class="w3-dropdown-hover w3-hide-small">
            <button class="w3-padding-large w3-button" title="More">PAYMENTS <i class="fa fa-caret-down"></i></button>
            <div class="w3-dropdown-content w3-bar-block w3-card-4">
                <#--<a href="/payments/refill" class="w3-bar-item w3-button">Refill</a>-->
                <a href="/payments/transfer" class="w3-bar-item w3-button">Transfer</a>
                <a href="/payments/exchange" class="w3-bar-item w3-button">Exchange</a>
                <#--<a href="/payments/archive" class="w3-bar-item w3-button">Archive</a>-->

            </div>
        </div>
        <a href="/contact" class="w3-bar-item w3-button w3-padding-large w3-hide-small">CONTACT</a>
        <a href="/logout" class="w3-padding-large w3-hover-red w3-hide-small w3-right">LOGOUT</a>
    </div>
</div>

</body>
</html>
