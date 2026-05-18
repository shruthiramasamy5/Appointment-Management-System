package com.appointment.dao;

import java.util.List;
import com.appointment.model.Appointment;

public interface AppointmentDAO {
    void addAppointment(Appointment appointment);
    List<Appointment> getAllAppointments();
    void updateAppointment(Appointment appointment);
    void deleteAppointment(int id);
}