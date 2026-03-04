package m1practice;

public class EnterpriseOrderManagementSystem {

    // =======================
    // 1. Custom Exception
    // =======================
    static class InvalidOrderStateException extends RuntimeException {
        public InvalidOrderStateException(String message) {
            super(message);
        }
    }

    // =======================
    // 2. Behavior Interface
    // =======================
    interface OrderBehavior {
        boolean canCancel();
        boolean canRefund();
        OrderStatus next();       // move forward
        OrderStatus cancel();     // cancel order
    }

    // =======================
    // 3. Enum Implementing Interface
    // =======================
    enum OrderStatus implements OrderBehavior {

        CREATED {
            public boolean canCancel() { return true; }
            public boolean canRefund() { return false; }
            public OrderStatus next() { return CONFIRMED; }
            public OrderStatus cancel() { return CANCELLED; }
        },

        CONFIRMED {
            public boolean canCancel() { return true; }
            public boolean canRefund() { return false; }
            public OrderStatus next() { return SHIPPED; }
            public OrderStatus cancel() { return CANCELLED; }
        },

        SHIPPED {
            public boolean canCancel() { return false; }
            public boolean canRefund() { return false; }
            public OrderStatus next() { return DELIVERED; }
            public OrderStatus cancel() {
                throw new InvalidOrderStateException("Cannot cancel after shipment.");
            }
        },

        DELIVERED {
            public boolean canCancel() { return false; }
            public boolean canRefund() { return true; }
            public OrderStatus next() {
                throw new InvalidOrderStateException("Order already delivered.");
            }
            public OrderStatus cancel() {
                throw new InvalidOrderStateException("Cannot cancel delivered order.");
            }
        },

        CANCELLED {
            public boolean canCancel() { return false; }
            public boolean canRefund() { return false; }
            public OrderStatus next() {
                throw new InvalidOrderStateException("Cancelled order cannot move forward.");
            }
            public OrderStatus cancel() {
                throw new InvalidOrderStateException("Order already cancelled.");
            }
        };
    }

    // =======================
    // 4. Order Entity
    // =======================
    static class Order {

        private final String orderId;
        private final String customerName;
        private OrderStatus status;

        public Order(String orderId, String customerName) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.status = OrderStatus.CREATED;
        }

        public String getOrderId() { return orderId; }
        public String getCustomerName() { return customerName; }
        public OrderStatus getStatus() { return status; }

        public void moveToNextState() {
            status = status.next(); // polymorphism
        }

        public void cancelOrder() {
            status = status.cancel(); // polymorphism
        }

        public boolean canCancel() {
            return status.canCancel();
        }

        public boolean canRefund() {
            return status.canRefund();
        }

        @Override
        public String toString() {
            return "Order ID: " + orderId +
                    ", Customer: " + customerName +
                    ", Status: " + status;
        }
    }

    // =======================
    // 5. Main Method (Demo)
    // =======================
    public static void main(String[] args) {

        Order order = new Order("ORD101", "Vignan");

        System.out.println(order);

        order.moveToNextState();
        System.out.println(order);

        order.moveToNextState();
        System.out.println(order);

        try {
            order.cancelOrder(); // Should throw exception
        } catch (InvalidOrderStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        order.moveToNextState();
        System.out.println(order);

        System.out.println("Can Refund? " + order.canRefund());
    }
}