/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 11/11/2020
 *
 */

package CandyShopStock;

import java.io.FileNotFoundException;
import java.util.Scanner;

import static CandyShopStock.Stock.stock;

 class Persistens {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to the Candy Shop");
        System.out.println("Loading data...");
        System.out.println(" ");
        System.out.println("********** The candy shop stock contains at the moment: **********");
        Persistens p = new Persistens();
        p.save();
        p.load();

        // You can edit the products.txt to change (add/delete) the products in the stock.
        // Then p.load() to get it in the system's memory.
        // Or p.save(); to save the changes to the stock in the memory.
    }

    public void save() throws FileNotFoundException {

        java.io.File file = new java.io.File("data/products.txt");
        // Creates a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Fill up the stock in the products.txt
        Stock.fillUp();

        // This goes through all the piecesOfCandy and shows every element's name as a String.
        for (PieceOfCandy piecesOfCandy : stock) {
            output.println(piecesOfCandy.getClass().getSimpleName());
        }
        // Closes the file
        output.close();
    }

    public void load() throws FileNotFoundException {
        // Create a File instance
        java.io.File file = new java.io.File("data/products.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Read data from data/products.txt
        while (input.hasNext()) {
            String pieceOfCandyString = input.next();
            System.out.println(pieceOfCandyString);
            // Allows only these types of input in the stock and when written it creates a new object as that specific type
            if(pieceOfCandyString=="Marabou") stock.add(new Marabou());
            if(pieceOfCandyString=="SkipperMix") stock.add(new SkipperMix());
            if(pieceOfCandyString=="Twix") stock.add(new Twix());
            if(pieceOfCandyString=="Twister") stock.add(new Twister());
            if(pieceOfCandyString=="Vingummibamser") stock.add(new Vingummibamser());
        }

        // Closes the file
        input.close();
    }
}