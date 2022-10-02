<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 02-Oct-22
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Det lykkedes!</title>
</head>
<body>

<h1>Så ramte du din først JSP siden, efter at havde været forbi din Servlet</h1>

fra din Servlet fik du følgende besked ${requestScope.besked}


<form action="minServlet">
    <label for="fname">First name:</label><br>
    <input type="text" id="fname" name="fname" value="John"><br>
    <label for="lname">Last name:</label><br>
    <input type="text" id="lname" name="lname" value="Doe"><br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
