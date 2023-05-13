package order;

public class OrderLineItem { // REFACT: Extracció de classe
    private String productName;
    private int quantity;
    private double price;

    public OrderLineItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice() { // REFACT: Renaming
        return price * quantity;
    }
}
