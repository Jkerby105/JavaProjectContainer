
/**
 * Budget Allocation
 * - Enter your budget
 * Enter the proportion of each expenses item
 * - Ignore futher items if proportion exceeds 100%
 * - Use ArrayList to store expense proportions  -->> Because we do no know the number of items.
 * - Find the amount for each item
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        System.out.println("How much can you spend?");
        Scanner scan = new Scanner(System.in);
        double total = scan.nextDouble();
        double sum = 0;
        int i = 0;
        ArrayList<Double> proportion = new ArrayList<Double>();
        System.out.println("Enter your proportion of various expenses.");
        System.out.println("The system stops if cumulative proportion exceeds 100%");
        do{
           System.out.println("Your proportion of expense " + (i + 1) + ":");
           double value = scan.nextDouble();
            proportion.add(value);
           sum += proportion.get(i);
           i++;
        }while( sum <= 100);
        scan.close();
        if(sum > 100){
           double cumulative = 0.0;
           for(int j = 0; j < proportion.size() - 1; j++){
              cumulative += proportion.get(j);
           }
           proportion.set(proportion.size() - 1, 100.0 - cumulative);
        }

       for (Double value : proportion) {
              double expense = value * total/100.0;
              System.out.println("Your " + value + "% equals $" + expense);
       }


    }

}
