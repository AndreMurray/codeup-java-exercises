public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 1300;
        dish1.nameOfDish = "Burger";
        dish1.wouldRecommend = true;
        Dishtools.analyzeDishCost(dish1);
    }





}
