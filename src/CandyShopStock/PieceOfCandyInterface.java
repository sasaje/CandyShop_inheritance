package CandyShopStock;

import java.util.Date;

public interface PieceOfCandyInterface {
    String name = null;
    int inStock = 0;
    Date expirationDate = new Date();
    Storage storage = null; // Enum Storage
    double unitPrice = 0;

    public default String getName() {
        return name;
    }

    public default void setName(String name) {
        name = name;
    }

    public default int getInStock() {
        return inStock;
    }

    public default void setInStock(int inStock) {
        inStock = inStock;
    }

    public default Date getExpirationDate() {
        return expirationDate;
    }

    public default void setExpirationDate(Date expirationDate) {
        expirationDate = expirationDate;
    }

    public default Storage getStorage() {
        return storage;
    }

    public default void setStorage(Storage storage) {
        storage = storage;
    }

    public default double getUnitPrice() {
        return unitPrice;
    }

    public default void setUnitPrice(double unitPrice) {
        unitPrice = unitPrice;
    }


}
