package com.appointment.servlet;

import java.io.IOException;
import java.util.List;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import com.appointment.dao.*;
import com.appointment.model.Appointment;

@WebServlet("/viewAppointments")
public class ViewAppointmentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        AppointmentDAO dao = new AppointmentDAOImpl();
        List<Appointment> list = dao.getAllAppointments();

        request.setAttribute("appointments", list);
        request.getRequestDispatcher("/view/view_appointments.jsp").forward(request, response);
    }
}