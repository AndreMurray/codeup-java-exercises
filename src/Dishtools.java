public class Dishtools {

    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(Dish dish) {
        System.out.println(dish.getNameOfDish().toUpperCase());
    };

    public static void analyzeDishCost(Dish dish) {
         String message;
        if (dish.getCostInCents() > AVERAGE_COST_OF_DISH_IN_CENTS) {
            message = "More expensive than average";
        } else {
            message = "Less expensive than average";
        }
System.out.println(message);
    };

//    public static boolean flipRecommendation(Dish dish) {
//        return !dish.WouldRecommend;
//    }

}
