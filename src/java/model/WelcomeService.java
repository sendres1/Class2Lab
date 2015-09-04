/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author Steven Endres
 */
public class WelcomeService {
   
    
    private String getTOD() {
        Calendar currentDate = null;
        String timeOfDayGreeting = "";
        int timeOfDay = 0;
        timeOfDay = currentDate.get(Calendar.HOUR_OF_DAY);

        if (timeOfDay <= 12) {
            timeOfDayGreeting = "Good Morning";
        } else if (timeOfDay >= 12 && timeOfDay <= 16) {
            timeOfDayGreeting = "Good Afternoon";
        } else if (timeOfDay >= 16) {
            timeOfDayGreeting = "Good Evening";
        }
        return timeOfDayGreeting;
    }

    private String createGretting(String inputName) {
        return (getTOD() + "," + inputName + "." + "  Welcome!");

    }

}
