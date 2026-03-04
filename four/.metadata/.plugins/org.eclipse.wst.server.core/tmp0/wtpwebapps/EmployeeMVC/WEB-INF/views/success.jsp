<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

<h2>${msg}</h2>

<hr>

<h3>Updated Employee List</h3>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Phone</th>
    <th>Email</th>
</tr>

<c:forEach var="e" items="${list}">
<tr>
    <td>${e.id}</td>
    <td>${e.name}</td>
    <td>${e.phone}</td>
    <td>${e.email}</td>
</tr>
</c:forEach>

</table>

<br>
<a href="home">Back To Home</a>

</body>
</html>