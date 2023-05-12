import java.util.List;

public class Order {
    private List<Main.OrderLineItem> lineItems;
    private double taxRate;

    public Order(List<Main.OrderLineItem> lineItems, double taxRate) {
        this.lineItems = lineItems;
        this.taxRate = taxRate;
    }

    public double calculateTotalPrice() {
        double subtotal = 0.0;
        for (Main.OrderLineItem item : lineItems) {
            subtotal += item.getPrice();
        }
        double tax = subtotal * taxRate;
        return subtotal + tax;
    }
}
