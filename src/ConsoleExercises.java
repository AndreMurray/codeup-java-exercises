import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        String messege = String.valueOf(System.out.format("The value of pi is approximately %.2f.", pi));
//        System.out.println(messege);
//        System.out.printf("The value of pi is approximately %.2f.", pi);
////
        Scanner thisScan = new Scanner(System.in);
////
//        System.out.print("Enter an integer.");
//        int myNumber = thisScan.nextInt();
//        System.out.println("You entered:" + myNumber + ".");
//
//        System.out.print("Enter three words");
//        String first = thisScan.next();
//        String second = thisScan.next();
//        String third = thisScan.next();

//        System.out.printf("%s\n%s\n%s",first,second,third);
//
//        System.out.print("Give me a  combo sentence.");
//        String theCombo = thisScan.next();
//        System.out.println(theCombo);

        System.out.println("Please enter the length of the classroom:");
        double length = Double.parseDouble(thisScan.nextLine());

        System.out.println("Please enter the width of the classroom: ");
        double width = Double.parseDouble(thisScan.nextLine());

        System.out.println("Please enter the height of the classroom: ");
        double height = Double.parseDouble(thisScan.nextLine());

        double perimeter = length + width;
        double area = length * width;
        double volume = length * width * height;

        System.out.println("the perimeter is: " + perimeter);
        System.out.println("The area is " + area + ".");
        System.out.println("The volume is " + volume + ".");


    }
}
