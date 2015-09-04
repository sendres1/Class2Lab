/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Steven Endres
 */
public class WelcomeService {
    
    Calendar currentDate ;
     String timeOfDayGreeting = "";
        int timeOfDay = 0;
    
    public WelcomeService() {
    }
   
    
    public String getTOD() {   
        currentDate = Calendar.getInstance();
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

    public List createGreeting(String inputName) {
        List greet = new ArrayList();
        greet.add("tryit");
        return greet;
        
        //return (getTOD() + "," + inputName + "." + "  Welcome!");

    }

}
