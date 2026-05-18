package com.appointment.servlet;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import com.appointment.dao.*;

@WebServlet("/deleteAppointment")
public class DeleteAppointmentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        AppointmentDAO dao = new AppointmentDAOImpl();
        dao.deleteAppointment(id);

        response.sendRedirect("viewAppointments");
    }
}