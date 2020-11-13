/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 11/11/2020
 *
 */

package CandyShopStock;
import java.util.ArrayList;

public class Stock extends PieceOfCandy{

    //ArrayList declaration
    static ArrayList<PieceOfCandy> stock = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("The stock contains: " + numberOfProducts() + " products.");
        fillUp();
        System.out.println("The stock contains: " + numberOfProducts() + " products.");

        //Show all products by name
        showProducts();
  }

    //LEVEL1
    public static void fillUp(){
        //fyld varer i lageret

        for (int i = 0; i < 7; i++) {
            stock.add(new Marabou());
        }
        for (int i = 0; i < 4; i++) {
            stock.add(new SkipperMix());
        }
        for (int i = 0; i < 12; i++) {
            stock.add(new Twister());
        }
        for (int i = 0; i < 3; i++) {
            stock.add(new Twix());
        }
        for (int i = 0; i < 2; i++) {
            stock.add(new Vingummibamser());
        }
    }

    //LEVEL 1
    public static int numberOfProducts(){
        // This will print the size of the stock list
        int products = stock.size();
        return products;
    }

    //Level 2
    public static void showProducts(){
        // Printing every element's name as String
       for(int i = 0; i < stock.size(); i++){
           int x=i+1;
            System.out.println("Product(" + x + "): " + stock.get(i).getClass().getSimpleName());
       }
   }

    //Level3
    public int numberOfMarabous(){
  //    Hvor mange marabou er der
        return 0;
    }
    public int numberOf(String type){
  //    Hvor mange marabou er der
        return 0;
    }
}
