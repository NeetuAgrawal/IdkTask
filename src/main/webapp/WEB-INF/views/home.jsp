<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %> --%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<style>
	#appForm{
	border: 2px solid brown;
	padding: 20px;
	margin:20px;
	width: 40%;
	
	}
	</style>
</head>
<body>

<div id="appForm">
<h1>
	Fix Your Appointment
</h1>

<form action="appointment" method="get">

<table>

<tr>
<td> UserName  </td>
<td> <input type="text" name="userName"/></td>
</tr>

<tr><!-- onchange="this.form.submit()" -->
<td>Choose Date (yyyy-mm-dd)</td>
<td><input type="date" pattern="[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|1[0-9]|2[0-9]|3[01])"  name="appDate"/></td>
</tr>

<tr>
<td>Choose Time</td>
<td>
<select name="appTime">
<c:forEach var="record"  items="${timeslots}" >
<option value="${record.key}">${record.value}</option>
</c:forEach>

</select>
</td>
</tr>

<tr>
<td></td><td><input type="submit" /></td>
</tr>

</table>

</form>

</div>
</body>
</html>
