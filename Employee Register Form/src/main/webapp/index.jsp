<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Registration Form</title>
        <link rel="stylesheet" href="css/main.css">
    </head>

    <body>
<div class="nav_bar">
        <h1>Employee Register Form</h1>
        <div class="plus_btn">
            +
        </div>
    </div>
    <div class="main" onclick="func(event)">
        <form action="register" method="post">
            <div class="container">
                <div class="input_field">
                    <label for="firstName">First Name</label>
                    <input type="text" id="firstName" name="first_name" placeholder="Enter your name here">
                </div>
                <div class="input_field">
                    <label for="lastName">Last Name</label>
                    <input type="text" id="lastName" name="last_name" placeholder="Enter your last name here">
                </div>
                <div class="input_field">
                    <label for="userName">User Name</label>
                    <input type="text" id="userName" name="user_name" placeholder="Enter your user name here">
                </div>
                <div class="input_field">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" placeholder="Enter your password here">
                </div>
                <div class="input_field">
                    <label for="address">Address</label>
                    <input type="text" id="address" name="address" placeholder="Enter your address here">
                </div>
                <div class="input_field">
                    <label for="contact">Contact</label>
                    <input type="text" id="contact" name="contact" placeholder="Enter your contact number">
                </div>
                <div class="btn">
                    <button class="submit_btn">Save</button>
                </div>
            </div>
        </form>
    </div>
    <script src="js/main.js"></script>
    </body>

    </html>