import java.util.ArrayList;

/**
 * Restaurant Bill
 * 
 * Create a Bill object
 * A bill contains the ordered food, quantity and price
 * Get order and total cost of the bill
 * Use ArrayLists ot record the order
 */

public class Bill {

    private ArrayList<String> orderedFood;
    private ArrayList<Integer> orderedQuantity;

    public Bill() {

        orderedFood = new ArrayList<String>();
        orderedQuantity = new ArrayList<Integer>();
    }

    private double totalCost;

    public double getTotal() {
        return totalCost;
    }

    public void addOrder(String meal, int quantity, String[] dish, double[] cost) {
        orderedFood.add(meal);
        orderedQuantity.add(quantity); // autoboxing done here
        for (int i = 0; i < dish.length; i++) {
            if (meal.equals(dish[i])) {
                // totalCost is intialized to be zero
                // when a Bill instance is constructed
                totalCost += quantity * cost[i];
            }
        }
    }

    public void getOrder() {
        for (int i = 0; i < orderedFood.size(); i++) {
            System.out.println(orderedFood.get(i) + " " + orderedQuantity.get(i));
        }

    }

}
