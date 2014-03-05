
package heartrate;

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

    private String fName;
    private String lName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    
    /**
     * Constructor HeartRates Used to initialize HeartRate object.
     * 
     * @param fName
     * @param lName
     * @param birthMonth
     * @param birthDay
     * @param birthYear 
     */

    public HeartRates(String fName, String lName, int birthMonth, int birthDay, int birthYear) {

        this.fName = fName;
        this.lName = lName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;

    }
    
    /**
     * Method setFirstName sets User's first name
     * @param name User's first name
     */

    public void setFirstName(String name) {

        this.fName = name;

    }
    /**
     * Method setLastName sets User's last name
     * @param name User's last name
     */

    public void setLastName(String name) {

        this.lName = name;

    }
    
    /**
     * Method setBirthMonth sets User's birth month
     * @param month User's birth month
     */

    public void setBirthMonth(int month) {

        this.birthMonth = month;

    }
    
    /**
     * Method setBirthDay sets User's birth day
     * @param day User's birth day
     */

    public void setBirthDay(int day) {

        this.birthDay = day;

    }
    
    /**
     * Method setBirthYear sets User's birth year
     * @param year User's birth year
     */

    public void setBirthYear(int year) {

        this.birthYear = year;

    }
    
    /**
     * Method getFirstName gets User's first name
     * @return this.fName returns User's first name
     */

    public String getFirstName() {

        return this.fName;

    }
    /**
     * Method getLastName gets User's last name
     * @return this.lName returns User's last name
     */

    public String getLastName() {

        return this.lName;

    }
    /**
     * Method getBirthMonth gets User's birth month
     * @return this.birthMonth returns User's birth month
     */

    public int getBirthMonth() {

        return this.birthMonth;

    }
    /**
     * Method getBirthDay gets User's birth day
     * @return this.birthDay returns User's birth day
     */

    public int getBirthDay() {

        return this.birthDay;

    }
    
    /**
     * Method getBirthYear gets User's birth year
     * @return this.birthYear returns User's birth year
     */

    public int getBirthYear() {

        return this.birthYear;

    }
    /**
     * Method calcAge calculates User's age
     * @param birthDate User's birth date
     * @return age returns User's age
     */

    public int calcAge(Date birthDate) {

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
