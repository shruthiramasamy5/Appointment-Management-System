package com.appointment.model;

public class Appointment {

    private int appointmentId;
    private String clientName;
    private String service;
    private String date;
    private String time;

    public Appointment() {}

    public Appointment(String clientName, String service, String date, String time) {
        this.clientName = clientName;
        this.service = service;
        this.date = date;
        this.time = time;
    }

    public Appointment(int appointmentId, String clientName, String service, String date, String time) {
        this.appointmentId = appointmentId;
        this.clientName = clientName;
        this.service = service;
        this.date = date;
        this.time = time;
    }

    public int getAppointmentId() { return appointmentId; }
    public void setAppointmentId(int appointmentId) { this.appointmentId = appointmentId; }

    public String getClientName() { return clientName; }
    public void setClientName(String clientName) { this.clientName = clientName; }

    public String getService() { return service; }
    public void setService(String service) { this.service = service; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
}