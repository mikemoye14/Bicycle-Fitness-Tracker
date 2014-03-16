
package bike;

import java.util.Date;

/** 
 * CMPSC 221 
 * Initial Assignments 
 * Program 3.16 
 * Page 101
 * HeartRates.java 
 * Purpose: Calculate heart rate
 * 
 * @author Mike Moye 
 * @version 1.0 22 January 2014 
 **/

public class HeartRates {
    
    public HeartRates(){        
    }
    
    
    /**
     * Method calcAge calculates User's age
     * @return age returns User's age
     */

    public int calcAge(int birthMonth, int birthDay, int birthYear) {
        
        Date birthDate = new Date(birthMonth + "/" + birthDay + "/" + birthYear);

        int currentYear = new Date().getYear();

        int age;

        if (birthDate.getMonth() > new Date().getMonth()) {

            age = ((currentYear - birthDate.getYear()) - 1);

        } else if (birthDate.getMonth() == new Date().getMonth()) {

            if (birthDate.getDate() > new Date().getDate()) {

                age = ((currentYear - birthDate.getYear()) - 1);

            } else {

                age = (currentYear - birthDate.getYear());

            }

        } else {

            age = (currentYear - birthDate.getYear());

        }

        return age;

    }
    /**
     * Method calcMaxHeartRate calculates User's max heart rate
     * @param age User's age
     * @return (220 - age) returns calculated maximum heart rate
     */
    
    public int calcMaxHeartRate(int age){
            
            return (220 - age);
        
    }
    /**
     * Method calcTargetHeartRate calculates User's target heart rate
     * @param age User's age
     * @return (calcMaxHeartRate(age)*.5) returns calculated target heart rate
     */
    
    public double calcTargetHeartRate(int age){
        
        return (calcMaxHeartRate(age)*.5);
        
    }
    
}
