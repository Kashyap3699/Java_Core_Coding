package Week_4;

enum OrderStatus {
    PENDING,
    SHIPPED,
    DELIVERED
}

class Order {
    private int orderId;
    private OrderStatus status;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Status: " + status;
    }
}

public class Program_172 {
    public static void main(String[] args) {
        Order order1 = new Order(101);
        System.out.println(order1);

        order1.setStatus(OrderStatus.PENDING);
        System.out.println(order1);

        order1.setStatus(OrderStatus.SHIPPED);
        System.out.println(order1);

        order1.setStatus(OrderStatus.DELIVERED);
        System.out.println(order1);
    }
}
