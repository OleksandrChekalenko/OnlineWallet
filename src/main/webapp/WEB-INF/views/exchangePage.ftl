<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title(index.ftl)</title>
</head>
<body class="container">
<#include "templates/header3.ftl">
<br><br><br>
<h1> EXCHANGE PAGE</h1>

<div  id="margin">
    <table class="table table-striped">
        <tr>
            <th>Number</th>
            <th>Type</th>
            <th>Funds</th>
            <th>Currency</th>
            <th>Button</th>
        </tr>
    <#list wallets as wallet>
        <tr>
            <td>${wallet.number}</td>
            <td>${wallet.type}</td>
            <td>${wallet.funds}</td>
            <td>${wallet.walletCurrency}</td>
            <#--<td><a href="/payments/transfer/${wallet.number?c}">Transfer</a></td>-->
            <td><a href="/payments/exchange/${wallet.number?c}">Exchange</a></td>
        </tr>
    </#list>
    </table>
</div>
</body>
</html>


<#--
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title(index.ftl)</title>
</head>
<body class="container">
<#include "templates/header3.ftl">
<br><br><br>
<h1> EXCHANGE PAGE </h1>

<form action="/payments/exchange/moneyExchange" method="post"  class="form-group">
&lt;#&ndash;<input title="Id" type="number" name="wallet.id" value="${wallet.id}" hidden />&ndash;&gt;
    <p>${wallet.number?c}</p>
    <input title="Number" type="number" size="10" name="fromNumber" value="${wallet.number?c}" hidden />
&lt;#&ndash;<input title="Type" type="text" name="wallet.type" value="${wallet.type}" hidden/>&ndash;&gt;
&lt;#&ndash;<input title="Wallet currency" type="text" name="wallet.walletCurrency" value="${wallet.walletCurrency}" hidden/>&ndash;&gt;
&lt;#&ndash;<input title="Founds" type="number" step="0.01" name="wallet.funds" value="${wallet.funds}" hidden/>&ndash;&gt;
    Number to transfer
    <input title="Number to transfer" type="number"  size="10" name="numberTo">
    Sum of transfer
    <input title="SumOfTransfer" type="number" step="0.01" name="money"/>
    <input type="submit" value="Transfer"/>
</form>
</body>
</html>-->
