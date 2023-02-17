import java.time.temporal.ValueRange;
import java.util.Scanner;

public class MethodsExercises {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multi(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }
    public static double modulus(double num1, double num2) {
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

    public static int getRandomInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

//    public static void main(String[] args) {
//        System.out.println("Enter in the max number of sides in the dice");
//       int noOfSidesOfDice = getInteger(1, 6);
//        System.out.printf("You have rolled %d and a %d", getRandomInt(1, noOfSidesOfDice), getRandomInt(1, noOfSidesOfDice));
//
//
////    System.out.print("Enter a number between 1 and 10:");
////    int userInput = getInteger(1, 10);
//
//
//    }



}

