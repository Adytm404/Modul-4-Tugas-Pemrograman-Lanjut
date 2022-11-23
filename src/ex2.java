import java.util.Scanner;

public class ex2 {
    static int day, dayAsCount;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input number of day: ");
        day = input.nextInt();
        countDay();
        System.out.println(dayAsCount + " day.");
    }

    private static void countDay() {
        dayAsCount = day;
    }
}
