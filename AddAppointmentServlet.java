package com.appointment.servlet;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import com.appointment.dao.*;
import com.appointment.model.Appointment;

@WebServlet("/addAppointment")
public class AddAppointmentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/view/add_appointment.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String clientName = request.getParameter("clientname");
        String service = request.getParameter("service");
        String date = request.getParameter("date");
        String time = request.getParameter("time");

        Appointment appointment = new Appointment(clientName, service, date, time);
        AppointmentDAO dao = new AppointmentDAOImpl();
        dao.addAppointment(appointment);

        response.sendRedirect("viewAppointments");
    }
}