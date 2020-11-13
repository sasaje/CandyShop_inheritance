/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 10/11/2020
 *
 */

package CandyShopStock;

// subclass to CandyType
public class PieceOfCandy extends CandyType{
    String name;
    int inStock;
//  Date expirationDate;
    Storage storage; // Enum Storage
    double unitPrice;
    CandyCategory category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }


/*    public Date getExpirationDate() {
        return expirationDate;
    }*/

 /*   public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }*/

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public CandyCategory getCategory() {
        return category;
    }

    public void setCategory(CandyCategory category) {
        this.category = category;
    }
}
