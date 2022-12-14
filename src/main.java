import java.util.InputMismatchException;
import java.util.Scanner;
public class main {

    static Scanner input = new Scanner(System.in);
    static int day, month, year, dayAsCount;

    public static void main(String[] args) {

        try{
            System.out.print("Input number of day: ");
            day = input.nextInt();
            countYear();
            countMonth();
            countDay();
            System.out.println(year + " year, " + month + " month, " + dayAsCount + " day.");
        }catch (InputMismatchException e){
            System.out.println("Input is not a number!");
        }
    }

    private static void countDay() {
        dayAsCount = (day - ((year * 365) + (month * 30)));
    }

    private static void countMonth() {
        month = (day - (year * 365)) / 30;
    }

    private static void countYear() {
        year = (day / 365);
    }


}