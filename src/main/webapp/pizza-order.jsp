<%--
  Created by IntelliJ IDEA.
  User: jamesw
  Date: 2/4/22
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Order Pizza!</title>
</head>
<body>
<fieldset>
    <legend>How do you want your pizza?</legend>
<%--    select and delivery address (text input).--%>
    <form method="post" action="pizza-order">
        <label for="crust">Crust type:</label>
        <select name="crust" id="crust">
            <option value="thin">Thin</option>
            <option value="thick">Hand-tossed</option>
            <option value="glutenfree">Gluten-free</option>
            <option value="pan">Deep dish pan</option>
        </select>
        <label for="sauce">Sauce type:</label>
        <select name="sauce" id="sauce">
            <option value="tomato">Classic tomato</option>
            <option value="marinara">Marinara</option>
            <option value="alfredo">Garlic alfredo</option>
            <option value="applejam">Cinnamon and apple jam</option> <!-- for the freaks -->
        </select>

        <label for="size">Size:</label>
        <select name="size" id="size">
            <option value="small">Small (8")</option>
            <option value="medium">Medium (10")</option>
            <option value="large">Large (12")</option>
            <option value="xlarge">XL (14")</option>
        </select>

        <fieldset>
            <legend>Topping selection</legend>
            <fieldset>
                <legend>Meat</legend>
                <input type="checkbox" name="toppings" value="pepperoni" id="pepperoni">
                <label for="pepperoni">Pepperoni</label>
                <input type="checkbox" name="toppings" value="sausage" id="sausage">
                <label for="sausage">Sausage</label>
                <input type="checkbox" name="toppings" value="ham" id="ham">
                <label for="ham">Ham</label>
                <input type="checkbox" name="toppings" value="anchovies" id="anchovies">
                <label for="anchovies">Anchovies</label>
            </fieldset>
            <fieldset>
                <legend>Veggies</legend>
                <input type="checkbox" name="toppings" id="gpeppers" value="gpeppers">
                <label for="gpeppers">Green pepper</label>
                <input type="checkbox" name="toppings" id="pineapple" value="pineapple">
                <label for="pineapple">Pineapple</label>
                <input type="checkbox" name="toppings" id="onions" value="onions">
                <label for="onions">Red onions</label>
                <input type="checkbox" name="toppings" id="mushrooms" value="mushrooms">
                <label for="mushrooms">Mushrooms</label>
            </fieldset>
            <fieldset>
                <legend>Extra cheese!</legend>
                <input type="checkbox" name="toppings" id="parmesan" value="parmesan">
                <label for="parmesan">Crumbled parmesan</label>
                <input type="checkbox" name="toppings" id="asiago" value="asiago">
                <label for="asiago">Shredded asiago</label>
                <input type="checkbox" name="toppings" id="cheddar" value="cheddar">
                <label for="cheddar">Shredded sharp cheddar</label>
            </fieldset>
        </fieldset>
        <label for="address">Delivery address</label>
        <input type="text" name="address" id="address">
        <hr>
        <button type="submit" value="place-order">Place order!</button>
        <button type="reset" value="reset-order">Start over</button>
    </form>
</fieldset>
</body>
</html>
