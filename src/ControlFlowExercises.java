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
//            }
        }
//        while (i <= 100) {
//            System.out.println( i + " " + "fizz");
//            i+=3;
//        }

//        while (i <= 100) {
//            System.out.println( i + " " + "buzz");
//            i+=5;
//        }


        int j = 1;
        Scanner tableScanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        String outPutTable = tableScanner.nextLine();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------ | ------ ");
        while(j <= Integer.parseInt(outPutTable)) {

            System.out.printf(i + " " + "|" + i * 2 + " " + "|" + " " + i);
            j++;
        }
        System.out.println("Here is your table!");



//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125


    }
}
