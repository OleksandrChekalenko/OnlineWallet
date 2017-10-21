<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>WalletData</title>
</head>
<body class="container">
<#include "templates/header3.ftl">
<br><br><br>

<div  <#--class="table-responsive"--> id="margin">

    <form action="/wallet/wallets/sortByNumber" method="get" name="wallets" class="form-group">
        <button id="button" type="submit">Sort by number</button>
    </form>
    <br>
    <br>
    <br>
<#--<caption>Wallets list</caption>-->
    <table class="table table-striped">
        <tr>
        <#--<th>Id</th>-->
            <th><form action="/wallet/wallets/sortByNumber" method="get" name="wallets" class="form-group">
                <button type="submit">Number</button>
            </form>
            </th>
            <th><form action="/wallet/wallets/sortByType" method="get" name="wallets" class="form-group">
                <button type="submit">Type</button>
            </form>
            </th>
            <th><form action="/wallet/wallets/sortByFunds" method="get" name="wallets" class="form-group">
                <button type="submit">Funds</button>
            </form>
            </th>
            <th><form action="/wallet/wallets/sortByCurrency" method="get" name="wallets" class="form-group">
                <button  type="submit">Currency</button>
            </form>
            </th>
            <th>Button</th>
            <th>Button</th>
        </tr>
    <#list wallets as wallet>
        <tr>
        <#--<td><a href="/wallet/${wallet.id}">${wallet.id}</a></td>-->
            <td>${wallet.number}</td>
            <td>${wallet.type}</td>
            <td>${wallet.funds}</td>
            <td>${wallet.walletCurrency}</td>
            <td><a href="wallets/delete/${wallet.number?c}">Delete</a>
            <td><a href="/payments/refill/${wallet.number?c}">Refill</a>
            <#--<a href="/edit/${wallet.number}">Edit</a>-->
            </td>
        </tr>
    </#list>
    </table>
</div>
<br>
<div id="margin">
    <form action="wallets/addWallet" method="get" name="wallet" class="form-group">
        <button id="button" type="submit">New wallet</button>
    </form>
<#--<#include "templates/createWalletForm.ftl"/>-->
</div>
</body>
</html>