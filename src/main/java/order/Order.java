package order;

import order.enuns.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> orders = new ArrayList<>();

    public Order() {    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<OrderItem> getOrders() {
        return orders;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem order){ orders.add(order);
    }

    public void removeItem(OrderItem order) {orders.remove(order); }

    public double total() {
        double sum = 0;
        for (OrderItem o : orders) {

            sum = o.subTotal();
        }
        return sum;
    }

}
