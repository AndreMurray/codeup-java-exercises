package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public static void main(String[] args) {

       String userEnter;
        System.out.println("Write a string");
        Input newInput = new Input();
        userEnter = newInput.toString();
        System.out.println("you wrote " + userEnter);

    }
}
