package com.taitra.system.parking.service;

import com.taitra.system.parking.entity.Lot;

import java.util.List;

public interface LotService {
    void save(Lot lot);
    void saveAll(List<Lot> lots);

    List<Lot> findAll();
}
