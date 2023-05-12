import java.util.List;

public class Order {
    private List<OrderLineItems.OrderLineItem> lineItems;
    private double taxRate;

    public Order(List<OrderLineItems.OrderLineItem> lineItems, double taxRate) {
        this.lineItems = lineItems;
        this.taxRate = taxRate;
    }

    public double calculateTotalPrice() {
        double subtotal = 0.0;
        for (OrderLineItems.OrderLineItem item : lineItems) {
            subtotal += item.getPrice();
        }
        //Refactor 10 tipo Inline code,he tret la variable tax i he posat l'operacio directament
        return subtotal + (subtotal * taxRate);
        /*double tax = subtotal * taxRate;
        return subtotal + tax;
         */
    }
}