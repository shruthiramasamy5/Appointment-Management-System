<h2>Add Appointment</h2>

<form action="<%=request.getContextPath()%>/addAppointment" method="post">

Client Name:
<input type="text" name="clientname" required>
<br><br>

Service:
<input type="text" name="service" required>
<br><br>

Date:
<input type="date" name="date" required>
<br><br>

Time:
<input type="time" name="time" required>
<br><br>

<input type="submit" value="Add Appointment">

</form>

<br>
<a href="<%=request.getContextPath()%>/viewAppointments">Back</a>