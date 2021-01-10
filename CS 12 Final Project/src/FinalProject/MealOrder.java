package FinalProject;

import java.util.ArrayList;

public class MealOrder {

    public Main meal;
    public String side;
    public String drink;

   
    public MealOrder(Main m,String s, String d) {
//        sideOrder.add("Fries");
//        sideOrder.add("Onion Rings");
//        sideOrder.add("Salad");
//        sideOrder.add("None");
//
//        drinkOrder.add("Water");
//        drinkOrder.add("Coke");
//        drinkOrder.add("Sprite");
//        drinkOrder.add("Root Beer");
//        drinkOrder.add("Orange Juice");
//        drinkOrder.add("None");

        meal = m;
        side = s;
        drink = d;

    }

    public static int randomWithRange(int max) {
        int min = 0;
        int range = (max - min);
        return (int) (Math.random() * range) + min;
    }
}//end class
