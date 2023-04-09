package com.sai.amazon.shopping;

import com.sai.amazon.enums.OrderStatus;

import java.util.Date;

public class OrderLog {

    private Long order_number;
    private Date creation_date;
    private OrderStatus status;

    public OrderLog(Long order_number){
        this.order_number = order_number;
        this.creation_date = new Date();
        this.status = OrderStatus.PENDING;
    }

    public void updateStatus(OrderStatus status){
        this.status = status;
    }

}
