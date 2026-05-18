<%@ page import="java.util.List,com.appointment.model.Appointment" %>

<h2>All Appointments</h2>

<table border="1" cellpadding="5">
<tr>
    <th>Client Name</th>
    <th>Service</th>
    <th>Date</th>
    <th>Time</th>
    <th>Action</th>
</tr>

<%
List<Appointment> list = (List<Appointment>) request.getAttribute("appointments");

if(list != null && list.size() > 0){
    for(Appointment a : list){
%>

<tr>
    <td><%=a.getClientName()%></td>
    <td><%=a.getService()%></td>
    <td><%=a.getDate()%></td>
    <td><%=a.getTime()%></td>
    <td>
        <a href="<%=request.getContextPath()%>/updateAppointment?id=<%=a.getAppointmentId()%>">Edit</a>
        |
        <a href="<%=request.getContextPath()%>/deleteAppointment?id=<%=a.getAppointmentId()%>"
           onclick="return confirm('Are you sure?')">Delete</a>
    </td>
</tr>

<%
    }
}else{
%>

<tr>
    <td colspan="5">No appointments found</td>
</tr>

<%
}
%>

</table>

<br>
<a href="<%=request.getContextPath()%>/addAppointment">Add New Appointment</a>