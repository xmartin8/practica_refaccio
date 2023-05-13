package order;



import java.util.List;

public class Order { // REFACT: Extracció de classe
    private List<OrderLineItem> lineItems;
    private double taxRate;

    public Order(List<OrderLineItem> lineItems, double taxRate) {
        this.lineItems = lineItems;
        this.taxRate = taxRate;
    }

    public double calculateTotalPrice() { // REFACT: Renaming
        double subtotal = 0.0;
        for (OrderLineItem item : lineItems) {
            subtotal += item.getTotalPrice(); // REFACT: Renaming
        }
        double tax = subtotal * taxRate;
        return subtotal + tax;
    }
}

// Anterior codi
    // public double calculateTotalPrice() {
    //     double itemTotal = 0.0;
    //     for (order.OrderLineItem item : lineItems) {
    //         itemTotal += item.getPrice();
    //     }
    //     double tax = itemTotal * taxRate;
    //     return itemTotal + tax;
    // }

