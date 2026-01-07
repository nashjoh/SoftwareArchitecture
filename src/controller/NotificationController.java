/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Notification;

import java.util.ArrayList;
import java.util.List;

public class NotificationController {

    private List<Notification> notifications;

    public NotificationController() {
        notifications = new ArrayList<>();
    }

    public void sendNotification(Notification notification) {
        notifications.add(notification);
        // Actual persistence handled later via util.FileUtil
    }

    public List<Notification> getAllNotifications() {
        return notifications;
    }
}
