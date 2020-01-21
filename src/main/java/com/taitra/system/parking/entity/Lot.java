package com.taitra.system.parking.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class Lot implements Serializable {

    @Id
    private String LotId;

    private String CarNumber;

    public Lot(String lotId, String carNumber) {
        LotId = lotId;
        CarNumber = carNumber;
    }

    public Lot() {}
}
