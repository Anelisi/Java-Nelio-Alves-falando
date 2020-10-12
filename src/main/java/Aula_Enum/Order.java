package Aula_Enum;

import java.util.Date;

public class Order {
    private int id;
    private Date moments;
    private OrderStatus status;

    public Order() {    }

    public Order(int id, Date moments, OrderStatus status) {
        this.id = id;
        this.moments = moments;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMoments() {
        return moments;
    }

    public void setMoments(Date moments) {
        this.moments = moments;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order[" +
                "id= " + id +
                ", moments= " + moments +
                ", status= " + status +
                ']';
    }
}
