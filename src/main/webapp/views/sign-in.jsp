<%--
  Created by IntelliJ IDEA.
  User: terenin
  Date: 25.09.2022
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="colors.css"/>
</head>
<body>
<header class="u-clearfix u-grey-80 u-header u-header" id="sec-5081"><div class="u-clearfix u-sheet u-valign-middle u-sheet-1">
    <h2 class="u-text u-text-custom-color-1 u-text-default u-text-1">Simple Test-O-Bench<br>
    </h2>
</div></header>

<main>

    <div class="container">
        <%--@declare id="email"--%><%--@declare id="psw"--%><%--@declare id="psw-repeat"--%><h1>Register</h1>
        <p>Please fill in this form to create an account.</p>
        <hr>

        <label for="email"><b>Email</b></label>
        <input type="text" placeholder="Enter Email" name="email" required>

        <label for="psw"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw" required>

        <label for="psw-repeat"><b>Repeat Password</b></label>
        <input type="password" placeholder="Repeat Password" name="psw-repeat" required>
        <hr>

        <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
        <button type="submit" class="registerbtn">Register</button>
    </div>

    <div class="container signin">
        <p>Already have an account? <a href="#">Sign in</a>.</p>
    </div>

</main>

</body>
</html>
