package com.sai.amazon.shipment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shipment {

    private Long shipment_number;
    private String shipment_method;
    private List<ShipmentLog> shipment_logs;
    private Date shipment_date;
    private Date estimated_arrival;

    public Shipment(Long shipment_number, String shipment_method){
        this.shipment_number = shipment_number;
        this.shipment_method = shipment_method;
        this.shipment_logs = new ArrayList<>();
        this.shipment_date = new Date();
        this.estimated_arrival = new Date();
    }

    public void add_shipment_log(ShipmentLog log){
        this.shipment_logs.add(log);
    }

}
