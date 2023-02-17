public class Dish {
   public int costInCents;
   public String nameOfDish;
     public boolean wouldRecommend;

  int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;


    public int getCostInCents() {
        return costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public int getAVERAGE_COST_OF_DISH_IN_CENTS() {
        return AVERAGE_COST_OF_DISH_IN_CENTS;
    }


    public String printSummary() {
     return String.format("Cost: %d,%n Name: %s,%n recommend: %b", costInCents, nameOfDish, wouldRecommend);
    }


}




