/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Appointment;

import java.util.ArrayList;
import java.util.List;

public class AppointmentController {

    private List<Appointment> appointments;

    public AppointmentController() {
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void cancelAppointment(String appointmentId) {
        for (Appointment a : appointments) {
            if (a != null && appointmentId.equals(a.getClass().getDeclaredFields())) {
                a.cancel();
                break;
            }
        }
    }

    public void rescheduleAppointment(String appointmentId,
                                      String newDate,
                                      String newTime) {
        for (Appointment a : appointments) {
            if (a != null && appointmentId.equals(a.getClass().getDeclaredFields())) {
                a.reschedule(newDate, newTime);
                break;
            }
        }
    }

    public List<Appointment> getAllAppointments() {
        return appointments;
    }
}
