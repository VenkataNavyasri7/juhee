<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Add New Employee</h1>
<form:form method="post" action="save">
<table>
<tr>
<td>Employ No:</td>
<td><form:input path="empno"/></td>
</tr>
<td>Employ Name:</td>
<td><form:input path="name"/></td>
</tr>
<td>Employ dept:</td>
<td><form:input path="dept"/></td>
</tr>
<td>Employ desig:</td>
<td><form:input path="desig"/></td>
</tr>
<td>Employ salary:</td>
<td><form:input path="basic"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="save" /></td>
</tr>
</table>
</form:form>