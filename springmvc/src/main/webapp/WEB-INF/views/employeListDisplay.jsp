<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>MVC demo</title>
</head>
<body>
    <h2>All Employees in System</h2>
    <table border="1">
        <tr>
            <th>Employee Id</th>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
        <c:forEach items="${employes}" var="employe">
            <tr>
                <td><c:out value="${employe.id}" /></td>
                <td><c:out value="${employe.firstName}" /></td>
                <td><c:out value="${employe.lastName}" /></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>