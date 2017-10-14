<!DOCTYPE html>
<html>
<head>
    <title>OW</title>
    <meta charset="utf-8">
    <style>
        body{
            background:  url(images/background.jpg) no-repeat center top;
            font: 13px 'trebuchet MS', Arial, Helvetica;
            -webkit-background-size: 100%;
            background-size: 100%;
        }

        /*h2, p {
            text-align: center;
            color: #eb0d02;
            text-shadow: 0 1px 0 #eb0d02;
        }*/

        a {
            color: #2A679F;
        }

        /* Выше приведёные стили предназначены для демонстрации ----------- */

        #menu, #menu ul {
            margin: 0;
            padding: 0;
            list-style: none;
        }

        #menu {
            width: 960px;
            margin: 60px auto;
            border: 1px solid #222;
            background-color: #444;
            background-image: -moz-linear-gradient(rgba(214, 214, 214, 0.01), #888);
            background-image: -webkit-gradient(linear, left top, left bottom, from(rgba(214, 214, 214, 0.01)), to(#888));
            background-image: -webkit-linear-gradient(rgba(214, 214, 214, 0.01), #888);
            background-image: -o-linear-gradient(rgba(214, 214, 214, 0.01), #888);
            background-image: -ms-linear-gradient(rgba(214, 214, 214, 0.01), #888);
            background-image: linear-gradient(rgba(214, 214, 214, 0.01), #888);
            -moz-border-radius: 6px;
            -webkit-border-radius: 6px;
            border-radius: 6px;
            -moz-box-shadow: 0 1px 1px #777, 0 1px 0 #666 inset;
            -webkit-box-shadow: 0 1px 1px #777, 0 1px 0 #666 inset;
            box-shadow: 0 1px 1px #3c3f41, 0 1px 0 #666 inset;
        }

        #menu:before,
        #menu:after {
            content: "";
            display: table;
        }

        #menu:after {
            clear: both;
        }

        #menu {
            zoom:1;
        }

        #menu li {
            float: left;
            border-right: 1px solid #222;
            -moz-box-shadow: 1px 0 0 #444;
            -webkit-box-shadow: 1px 0 0 #444;
            box-shadow: 1px 0 0 #444;
            position: relative;
        }

        #menu a {
            float: left;
            padding: 12px 30px;
            color: #bcbcbc;
            text-transform: uppercase;
            font: bold 12px Arial, Helvetica;
            text-decoration: none;
            text-shadow: 0 1px 0 #000;
        }

        #menu li:hover > a {
            color: #fafafa;
        }

        *html #menu li a:hover { /* Только для IE6 */
            color: #fafafa;
        }

        #menu ul {
            margin: 20px 0 0 0;
            _margin: 0; /*Только для IE6*/
            opacity: 0;
            visibility: hidden;
            position: absolute;
            top: 38px;
            left: 0;
            z-index: 9999;
            background: #444;
            background: -moz-linear-gradient(#444, #111);
            background-image: -webkit-gradient(linear, left top, left bottom, from(#444), to(#111));
            background: -webkit-linear-gradient(#444, #111);
            background: -o-linear-gradient(#444, #111);
            background: -ms-linear-gradient(#444, #111);
            background: linear-gradient(#444, #000000);
            -moz-box-shadow: 0 -1px rgba(255,255,255,.3);
            -webkit-box-shadow: 0 -1px 0 rgba(255,255,255,.3);
            box-shadow: 0 -1px 0 rgba(255,255,255,.3);
            -moz-border-radius: 3px;
            -webkit-border-radius: 3px;
            border-radius: 3px;
            -webkit-transition: all .2s ease-in-out;
            -moz-transition: all .2s ease-in-out;
            -ms-transition: all .2s ease-in-out;
            -o-transition: all .2s ease-in-out;
            transition: all .2s ease-in-out;
        }

        #menu li:hover > ul {
            opacity: 1;
            visibility: visible;
            margin: 0;
        }

        #menu ul ul {
            top: 0;
            left: 150px;
            margin: 0 0 0 20px;
            _margin: 0; /*Только для IE6*/
            -moz-box-shadow: -1px 0 0 rgba(255,255,255,.3);
            -webkit-box-shadow: -1px 0 0 rgba(255,255,255,.3);
            box-shadow: -1px 0 0 rgba(255,255,255,.3);
        }

        #menu ul li {
            float: none;
            display: block;
            border: 0;
            _line-height: 0; /*Только для IE6*/
            -moz-box-shadow: 0 1px 0 #111, 0 2px 0 #666;
            -webkit-box-shadow: 0 1px 0 #111, 0 2px 0 #666;
            box-shadow: 0 1px 0 #111, 0 2px 0 #666;
        }

        #menu ul li:last-child {
            -moz-box-shadow: none;
            -webkit-box-shadow: none;
            box-shadow: none;
        }

        #menu ul a {
            padding: 10px;
            width: 130px;
            _height: 10px; /*Только для IE6*/
            display: block;
            white-space: nowrap;
            float: none;
            text-transform: none;
        }

        #menu ul a:hover {
            background-color: #0186ba;
            background-image: -moz-linear-gradient(#bebebe, #3c3f41);
            background-image: -webkit-gradient(linear, left top, left bottom, from(#bebebe), to(#3c3f41));
            background-image: -webkit-linear-gradient(#bebebe, #3c3f41);
            background-image: -o-linear-gradient(#bebebe, #3c3f41);
            background-image: -ms-linear-gradient(#bebebe, #3c3f41);
            background-image: linear-gradient(#bebebe, #3c3f41);
        }

        #menu ul li:first-child > a {
            -moz-border-radius: 3px 3px 0 0;
            -webkit-border-radius: 3px 3px 0 0;
            border-radius: 3px 3px 0 0;
        }

        #menu ul li:first-child > a:after {
            content: '';
            position: absolute;
            left: 40px;
            top: -6px;
            border-left: 6px solid transparent;
            border-right: 6px solid transparent;
            border-bottom: 6px solid #444;
        }

        #menu ul ul li:first-child a:after {
            left: -6px;
            top: 50%;
            margin-top: -6px;
            border-left: 0;
            border-bottom: 6px solid transparent;
            border-top: 6px solid transparent;
            border-right: 6px solid #3b3b3b;
        }

        #menu ul li:first-child a:hover:after {
            border-bottom-color: #3c3f41;
        }

        #menu ul ul li:first-child a:hover:after {
            border-right-color: #3c3f41;
            border-bottom-color: transparent;
        }

        #menu ul li:last-child > a {
            -moz-border-radius: 0 0 3px 3px;
            -webkit-border-radius: 0 0 3px 3px;
            border-radius: 0 0 3px 3px;
        }
    </style>

</head>
<body>
<br><br><br><br><br><br><br>
<ul id="menu">
    <li><a href="/">
        &nbsp;ow</a></li>
    <li>
        <a href="/wallets">WALLET</a>

    </li>
    <li>
        <a href="">PAYMENTS</a>
        <ul>
            <li>
                <a href="">Transfer</a>
            </li>
            <li>
                <a href="">Exchange</a>
        </ul>
    <li>
        <a href="/">ABOUT</a>
    </li>
    <li>
        <a href="/">CONTACTS</a>
    </li>
    <li>
        <a href="user/users">USERS</a>

    </li>
    <li>
        <a href="/logout">LOGOUT</a>
    </li>
</ul>
                </body>
</html>