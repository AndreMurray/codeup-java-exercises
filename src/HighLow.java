public class HighLow {

    public static void init() {
        System.out.println("Welcome to the High / Low Game");
        int randomNum = MethodsExercises.getRandomInt(1, 100);
        int guess = MethodsExercises.getInteger(1, 100);
        if (guess == randomNum) {
            System.out.println("Nice");
        } else if (guess < randomNum) {
            System.out.println("Highter");
        } else {
            System.out.println("Lower");
        }
    }

    public static void main(String[] args) {

    }
}
