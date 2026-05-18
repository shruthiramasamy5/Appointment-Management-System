<%@ page import="com.appointment.model.Appointment" %>

<%
Appointment a = (Appointment) request.getAttribute("appointment");
%>

<h2>Update Appointment</h2>

<form action="<%=request.getContextPath()%>/updateAppointment" method="post">

<input type="hidden" name="id" value="<%=a.getAppointmentId()%>">

Client Name:
<input type="text" name="clientname" value="<%=a.getClientName()%>" required>
<br><br>

Service:
<input type="text" name="service" value="<%=a.getService()%>" required>
<br><br>

Date:
<input type="date" name="date" value="<%=a.getDate()%>" required>
<br><br>

Time:
<input type="time" name="time" value="<%=a.getTime()%>" required>
<br><br>

<input type="submit" value="Update">

</form>

<br>
<a href="<%=request.getContextPath()%>/viewAppointments">Back</a>