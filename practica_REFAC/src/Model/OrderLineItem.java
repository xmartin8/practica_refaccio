package Model;

public class OrderLineItem { // REFACT: 16 extrac classe
    private String productName;
    private int quantity;
    private double price;

    public OrderLineItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public double getPrice() {
        return price * quantity;
    }
}
