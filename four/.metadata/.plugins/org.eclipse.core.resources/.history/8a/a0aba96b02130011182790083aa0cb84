<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html>
<body>

<h2>Employee Management</h2>

<a href="${pageContext.request.contextPath}/employee/savePage">
    Add Employee
</a>

<hr>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Phone</th>
    <th>Email</th>
    <th>Action</th>
</tr>

<c:forEach var="e" items="${list}">
<tr>
    <td>${e.id}</td>
    <td>${e.name}</td>
    <td>${e.phone}</td>
    <td>${e.email}</td>
    <td>
        <a href="${pageContext.request.contextPath}/employee/edit?id=${e.id}">
            Update
        </a>
        |
        <a href="${pageContext.request.contextPath}/employee/delete?id=${e.id}">
            Delete
        </a>
    </td>
</tr>
</c:forEach>

</table>

</body>
</html>