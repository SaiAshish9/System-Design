package com.sai.amazon.shopping;

import com.sai.amazon.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Long order_number;
    private OrderStatus status;
    private Date order_date;
    private List<OrderLog> order_log;

    Order(){
        this.order_number = 0L;
        this.status = OrderStatus.PENDING;
        this.order_date = new Date();
        this.order_log = new ArrayList<>();
    }

    public void send_for_shipment(){}

    public void make_payment(String payment){}

    public void add_order_log(OrderLog order_log){}

    public void setOrderNumber(Long order_number) {
        this.order_number = order_number;
    }

    public void updateStatus(OrderStatus status) {
        this.status = status;
    }
}
