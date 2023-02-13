import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
//       String exercise = "We don't need no education\nWe don't need no thought contral";
//        System.out.println(exercise);
//        String exercise2 = "Check \"this\" out!, \"s inside of \"s!";
//        System.out.println(exercise2);
//        String exercise3 = "In windows, the main drive is usually C:\\";
//        System.out.println(exercise3);
//        String exercise4 = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";
//
        Scanner sc = new Scanner(System.in);
        String userResponse = sc.nextLine();
        if (userResponse.endsWith("?")) {
            System.out.println("Sure");
        } else if (userResponse.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userResponse.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }


    }



    }





