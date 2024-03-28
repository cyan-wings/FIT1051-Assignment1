import java.util.Scanner;
import java.lang.Exception;
/**
 * FIT1051 Assignment 1 with 4 tasks
 * @author Matthew Yeow
 * @version JDK 21 SE
 */
public class Assessment1 {
    public static void main(String[] args) {
        Assessment1 a1 = new Assessment1();
        //a1.task1();
        //a1.task2();
        //a1.task3();
        //a1.task4();
    }

    public double areaOfCircle(double r) {
        return (Math.PI * r * r);
    }

    public void task1() {
        System.out.println(areaOfCircle(5.0));
    }

    public void task2() {
        Monster monster1 = new Monster();
        monster1.setHealthVal(-5);
        int health = monster1.getHealthVal();
        System.out.println(health);
    }

    public boolean numberValidator(int numToCheck, int min, int max) {
        return (numToCheck >= min && numToCheck <= max);
    }

    public void task3() {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        if (numberValidator(console.nextInt(), 0, 100))
            System.out.println("The number is valid.");
        else
            System.out.println("The number is invalid.");
        console.close();
    }

    private boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public boolean dateValidator(int day, int month, int year) {
        int[] maxDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeap(year))
            maxDays[2] = 29;
        if (month < 1 || month > 12)  //Check month validity
            return (false);
        else
            return (day >= 1 && day <= maxDays[month]);
    }

    public void task4() {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter a date in the format dd/mm/yyyy: ");
        try {
            int day = console.nextInt();
            int month = console.nextInt();
            int year = console.nextInt();
            if (dateValidator(day, month, year))
                System.out.println("The date is valid.");
            else
                System.out.println("The date is invalid.");
        }
        catch (Exception e) {
            System.out.println("Invalid input.");
        }
        console.close();
    }
}