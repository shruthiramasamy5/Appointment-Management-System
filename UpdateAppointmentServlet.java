package com.appointment.servlet;

import java.io.IOException;
import java.util.List;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import com.appointment.dao.*;
import com.appointment.model.Appointment;

@WebServlet("/updateAppointment")
public class UpdateAppointmentServlet extends HttpServlet {

    AppointmentDAO dao = new AppointmentDAOImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        List<Appointment> list = dao.getAllAppointments();

        for (Appointment a : list) {
            if (a.getAppointmentId() == id) {
                request.setAttribute("appointment", a);
                break;
            }
        }

        request.getRequestDispatcher("/view/update_appointment.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String clientName = request.getParameter("clientname");
        String service = request.getParameter("service");
        String date = request.getParameter("date");
        String time = request.getParameter("time");

        Appointment appointment = new Appointment(id, clientName, service, date, time);
        dao.updateAppointment(appointment);

        response.sendRedirect("viewAppointments");
    }
}