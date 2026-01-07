/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.User;

public class AuthenticationController {

    public boolean authenticate(User user, String password) {
        return user.login(password);
    }

    public void logout(User user) {
        user.logout();
    }
}
