package heartrate;

import java.util.Date;
import java.util.Scanner;

/** 
 * CMPSC 221 
 * Initial Assignments 
 * Program 3.16 
 * Page 101
 * HeartRateApplication.java 
 * Purpose: Execute HeartRate Application 
 * 
 * @author Mike Moye 
 * @version 1.0 22 January 2014 
 **/

public class HeartRateApplication {

    /**
     * The main method begins execution of application.
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("***Welcome to the Target Heart Rate Calculator***\n\n");

            System.out.print("Plese enter your first name:\n");

            String fName = input.next();

            System.out.print("Plese enter your last name:\n");

            String lName = input.next();

            System.out.print("Plese enter your birth day (XX/XX/XXXX):\n");

            String birthday = input.next();

            HeartRates hr = new HeartRates(fName, lName, Integer.parseInt(birthday.substring(0, 2)), Integer.parseInt(birthday.substring(3, 5)), Integer.parseInt(birthday.substring(6)));

            Date birthDate = new Date(hr.getBirthMonth() + "/" + hr.getBirthDay() + "/" + hr.getBirthYear());

            System.out.print("\n\nName: "
                    + hr.getFirstName()
                    + " "
                    + hr.getLastName()
                    + "\nAge: " + 
                    hr.calcAge(birthDate)
                    + "\nMax Heart Rate: " 
                    + hr.calcMaxHeartRate(hr.calcAge(birthDate))
                    + "\nTarget Heart Rate: "
                    + hr.calcTargetHeartRate(hr.calcAge(birthDate))
                    + "\n"
            );
            
            
        } catch (NumberFormatException x) {
            System.out.print("An error has occured.\n\n");
            x.printStackTrace();
        }

    }

}
