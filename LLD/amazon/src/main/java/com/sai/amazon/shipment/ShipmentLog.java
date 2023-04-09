package com.sai.amazon.shipment;

import com.sai.amazon.enums.ShipmentStatus;

import java.util.Date;

public class ShipmentLog {

    private Date creation_date;
    private Long shipment_number;
    private ShipmentStatus status;

    public ShipmentLog(Long shipment_number){
        this.shipment_number = shipment_number;
        this.creation_date = new Date();
        this.status = ShipmentStatus.PENDING;
    }

    public void updateStatus(ShipmentStatus status){
        this.status = status;
    }

}
