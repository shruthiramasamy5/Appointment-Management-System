package com.appointment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.appointment.model.Appointment;
import com.appointment.util.DBConnection;

public class AppointmentDAOImpl implements AppointmentDAO {

    @Override
    public void addAppointment(Appointment appointment) {
        try (Connection con = DBConnection.getConnection()) {

            String sql = "INSERT INTO appointment(clientname,service,date,time) VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, appointment.getClientName());
            ps.setString(2, appointment.getService());
            ps.setDate(3, java.sql.Date.valueOf(appointment.getDate()));
            ps.setTime(4, java.sql.Time.valueOf(appointment.getTime() + ":00"));

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Appointment> getAllAppointments() {

        List<Appointment> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection()) {

            String sql = "SELECT * FROM appointment";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Appointment a = new Appointment();
                a.setAppointmentId(rs.getInt("appointmentid"));
                a.setClientName(rs.getString("clientname"));
                a.setService(rs.getString("service"));
                a.setDate(rs.getString("date"));
                a.setTime(rs.getString("time"));

                list.add(a);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public void updateAppointment(Appointment appointment) {

        try (Connection con = DBConnection.getConnection()) {

            String sql = "UPDATE appointment SET clientname=?, service=?, date=?, time=? WHERE appointmentid=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, appointment.getClientName());
            ps.setString(2, appointment.getService());
            ps.setDate(3, java.sql.Date.valueOf(appointment.getDate()));
            ps.setTime(4, java.sql.Time.valueOf(appointment.getTime() + ":00"));
            ps.setInt(5, appointment.getAppointmentId());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAppointment(int id) {

        try (Connection con = DBConnection.getConnection()) {

            String sql = "DELETE FROM appointment WHERE appointmentid=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}