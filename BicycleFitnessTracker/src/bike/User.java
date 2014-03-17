package bike;

/**
 * CMPSC 221 
 * BicycleFitnessTracker 
 * User.java 
 * Purpose: Creates a User
 *
 * @author Mike Moye
 * @version 1.0 17 March 2014
 *
 */
public class User {

    private static String fName = "";
    private static String lName = "";
    private static double targetHeartRate = 93;
    private static double maxHeartRate = 157;
    private static int birthMonth = 9;
    private static int birthDay = 11;
    private static int birthYear = 1979;
    private static HeartRates hr;

    /**
     * Default Constructor
     */
    public User() {
        hr = new HeartRates();
    }

    /**
     * Method setFName sets first name
     *
     * @param name User's name
     */
    public static void setFName(String name) {
        fName = name;
    }

    /**
     * Method setLName sets last name
     *
     * @param name User's name
     */
    public static void setLName(String name) {
        lName = name;
    }

    /**
     * Method getFName gets first name
     *
     * @return fName User's first name
     */
    public static String getFName() {
        return fName;
    }

    /**
     * Method getLName gets user's last name
     *
     * @return lName User's last Name
     */
    public static String getLName() {
        return lName;
    }

    /**
     * Method setTargetHeartRate sets User's target heart rate
     */
    public static void setTargetHeartRate() {
        targetHeartRate = hr.calcTargetHeartRate(hr.calcAge(User.getBirthMonth(), User.getBirthDay(), User.getBirthYear()));
    }

    /**
     * Method setMaxHeartRate set the User's max heart rate
     */
    public static void setMaxHeartRate() {
        maxHeartRate = hr.calcMaxHeartRate(hr.calcAge(User.getBirthMonth(), User.getBirthDay(), User.getBirthYear()));
    }

    /**
     * Method getTargetHeartRate
     *
     * @return targetHeartRate
     */
    public static double getTargetHeartRate() {
        return targetHeartRate;
    }

    /**
     * Method getMaxHeartRate
     *
     * @return maxHeartRate
     */
    public static double getMaxHeartRate() {
        return maxHeartRate;
    }

    /**
     * Method getHeartRates gets user's heart rates
     *
     * @return hr heartRates
     */
    public HeartRates getHeartRates() {
        return hr;
    }

    /**
     * Method setHeartRate
     *
     * @param heartRate user's heartRates
     */
    public void setHeartRate(HeartRates heartRate) {
        hr = heartRate;
    }

    /**
     * Method setBirthMonth sets User's birth month
     *
     * @param month User's birth month
     */
    public static void setBirthMonth(int month) {
        birthMonth = month;
    }

    /**
     * Method setBirthDay sets User's birth day
     *
     * @param day User's birth day
     */
    public static void setBirthDay(int day) {
        birthDay = day;
    }

    /**
     * Method setBirthYear sets User's birth year
     *
     * @param year User's birth year
     */
    public static void setBirthYear(int year) {
        birthYear = year;
    }

    /**
     * Method getBirthMonth gets User's birth month
     *
     * @return this.birthMonth returns User's birth month
     */
    public static int getBirthMonth() {
        return birthMonth;
    }

    /**
     * Method getBirthDay gets User's birth day
     *
     * @return this.birthDay returns User's birth day
     */
    public static int getBirthDay() {
        return birthDay;
    }

    /**
     * Method getBirthYear gets User's birth year
     *
     * @return this.birthYear returns User's birth year
     */
    public static int getBirthYear() {
        return birthYear;
    }
}
