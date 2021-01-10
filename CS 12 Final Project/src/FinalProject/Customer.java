package FinalProject;

import java.util.ArrayList;

public class Customer implements Meal {

    public MealOrder mealOrder;

    public Customer(MealOrder m) {
        mealOrder = m;
    }

    public boolean correctMeal(MealOrder meal) {
        if (meal.side.equalsIgnoreCase(mealOrder.side) || meal.drink.equalsIgnoreCase(mealOrder.drink)) {
            int counter = 0;
            if (meal.meal.name.equalsIgnoreCase(mealOrder.meal.name)) {
                counter++;
            }
            if (meal.meal.ingredient1.equalsIgnoreCase(mealOrder.meal.ingredient1)) {
                counter++;
            }
            if (meal.meal.ingredient2.equalsIgnoreCase(mealOrder.meal.ingredient2)) {
                counter++;
            }
            if (meal.meal.ingredient3.equalsIgnoreCase(mealOrder.meal.ingredient3)) {
                counter++;
            }
            if (meal.meal.ingredient4.equalsIgnoreCase(mealOrder.meal.ingredient4)) {
                counter++;
            }

            if (counter == 5) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}//end class
