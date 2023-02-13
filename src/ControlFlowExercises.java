import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 0;
//        do{
//            System.out.println(i);
//            i+=2;
//        } while(i <= 100);

//        long i = 2;
//        do{
//            System.out.println(i);
//            i*=i;
//        } while(i <= 1_000_000);

//        for(int i = 0; i <= 100; i++) {
//            System.out.println(i);
//        }

//        for(int i = 2; i <= 1_000_000; i*=2) {
//            System.out.println(i);
//        }
//        int i = 0;
//
//        for (int i = 1; i <= 100; i += 1) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//        }

        //        boolean willContinue = false;
//        do {
//            System.out.println("Please enter an integer");
//            Scanner sc = new Scanner(System.in);
//            int userInt = sc.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed\n------ | ------- | -----");
//            for (int i = 1; i <= userInt; i++) {
//                System.out.printf("%-6d | %-7d | %-5f%n", i, i * i, Math.pow(i, 3));
//            }
//            System.out.println("Do you want to enter another number? (y/n)");
//            String userResponse = sc.next();
//            if (userResponse.equalsIgnoreCase("y")) {
//                willContinue = true;
//            } else {
//                willContinue = false;
//            }
//        } while (willContinue);



        Scanner sc = new Scanner(System.in);
//
        boolean anotherGrade = true;

        do {
            System.out.print("Please enter a numerical grade from 0 to 100 ");

            int numericGrade = sc.nextInt();

            if (numericGrade >= 88) {
                System.out.println("A");
            } else if (numericGrade >= 80) {
                System.out.println("B");
            } else if (numericGrade >= 67) {
                System.out.println("C");
            } else if (numericGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.print("Do you wish to enter a new grade? (y/n) ");

            String userResponse = sc.next();

            if (!userResponse.equalsIgnoreCase("y")) {
                anotherGrade = false;
            }

        } while (anotherGrade);


    }


    }

