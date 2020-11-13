/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 10/11/2020
 *
 */

package CandyShopStock;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        System.out.println("***********************************************");
        System.out.println("PRODUCTS IN STOCK");
        System.out.println("-----------------------------------------------");

        //creates new object "marabou" of the type Marabou (class that extends from Chocolate)
        Marabou marabou = new Marabou();
        marabou.setName("Marabou");
        marabou.setCategory(CandyCategory.CHOCOLATE);
        marabou.setInStock(33); //set items inStock
        marabou.setUnitPrice(22.95);
//        marabou.setExpirationDate(marabou.expirationDate = new Date(435098584));
        marabou.setStorage(Storage.FRIDGE); //set storage from enum variable
        System.out.println("Name: " + marabou.getName()); //prints name
        System.out.println("InStock: " + marabou.getInStock()); //prints inStock
        System.out.println("ExpirationDate: " + marabou.getExpirationDate()); //prints expirationDate
        System.out.println("Storage: " + marabou.getStorage()); //prints storage from enum

        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("");

        //creates new object "skipper mix" of the type SkipperMix (class that extends from Licorice)
        SkipperMix skipperMix = new SkipperMix();
        skipperMix.setName("Skipper Mix");
        skipperMix.setCategory(CandyCategory.LICORICE);
        skipperMix.setInStock(8); //set items inStock
        skipperMix.setUnitPrice(13.95);
//        skipperMix.setExpirationDate(skipperMix.expirationDate = new Date(435098334));
        skipperMix.setStorage(Storage.ROOMTEMPERATURE); //set storage from enum variable
        System.out.println("Name: " + skipperMix.getName()); //prints name
        System.out.println("InStock: " + skipperMix.getInStock()); //prints inStock
        System.out.println("ExpirationDate: " + skipperMix.getExpirationDate()); //prints expirationDate
        System.out.println("Storage: " + skipperMix.getStorage()); //prints storage from enum

        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("");

        //creates new object "twix" of the type Twix (class that extends from ChocolateBar)
        Twix twix = new Twix();
        twix.setName("Twix");
        twix.setCategory(CandyCategory.CHOCOLATEBAR);
        twix.setInStock(14); //set items inStock
        twix.setUnitPrice(9.95);
//        twix.setExpirationDate(twix.expirationDate = new Date(431198334));
        twix.setStorage(Storage.FRIDGE); //set storage from enum variable
        System.out.println("Name: " + twix.getName()); //prints name
        System.out.println("InStock: " + twix.getInStock()); //prints inStock
        System.out.println("ExpirationDate: " + twix.getExpirationDate()); //prints expirationDate
        System.out.println("Storage: " + twix.getStorage()); //prints storage from enum

        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("");

        //creates new object "twister" of the type Twister (class that extends from IceCreme)
        Twister twister = new Twister();
        twister.setName("Twister");
        twister.setCategory(CandyCategory.ICECREME);
        twister.setInStock(12); //set items inStock
        twister.setUnitPrice(7);
//        twister.setExpirationDate(twister.expirationDate = new Date(331198334));
        twister.setStorage(Storage.FREEZER); //set storage from enum variable
        System.out.println("Name: " + twister.getName()); //prints name
        System.out.println("InStock: " + twister.getInStock()); //prints inStock
        System.out.println("ExpirationDate: " + twister.getExpirationDate()); //prints expirationDate
        System.out.println("Storage: " + twister.getStorage()); //prints storage from enum

        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("");

        //creates new object "vingummibamser" of the type Vingummibamser (class that extends from Vingummi)
        Vingummibamser vingummibamser = new Vingummibamser();
        vingummibamser.setName("Vingummibamser");
        vingummibamser.setCategory(CandyCategory.VINGUMMI);
        vingummibamser.setInStock(79); //set items inStock
        vingummibamser.setUnitPrice(26.95);
//        vingummibamser.setExpirationDate(vingummibamser.expirationDate = new Date(334998334));
        vingummibamser.setStorage(Storage.ROOMTEMPERATURE); //set storage from enum variable
        System.out.println("Name: " + vingummibamser.getName()); //prints name
        System.out.println("InStock: " + vingummibamser.getInStock()); //prints inStock
        System.out.println("ExpirationDate: " + vingummibamser.getExpirationDate()); //prints expirationDate
        System.out.println("Storage: " + vingummibamser.getStorage()); //prints storage from enum
    }
}
