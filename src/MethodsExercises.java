import java.time.temporal.ValueRange;
import java.util.Scanner;

public class MethodsExercises {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInt = sc.nextInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        } else {
            System.out.println("Input out of range!");
            return getInteger(min, max);
        }
    }

    public static void main(String[] args) {

    System.out.print("Enter a number between 1 and 10:");
    int userInput = getInteger(1, 10);


    }



}

