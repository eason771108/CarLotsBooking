package com.taitra.system.parking.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class LotCollection {
    private List<Lot> lots;

    public LotCollection() {
        lots = new ArrayList<>();
    }

    public LotCollection(List<Lot> lots) {
        this.lots = lots;
    }

    public void addLot(Lot lot) {
        this.lots.add(lot);
    }
}
