package com.taitra.system.parking.service;

import com.taitra.system.parking.entity.Lot;
import com.taitra.system.parking.repository.ParkingLotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LotServiceImpl implements LotService{
    private ParkingLotRepository parkingLotRepository;

    @Autowired
    public LotServiceImpl(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public void save(Lot lot) {
        this.parkingLotRepository.save(lot);
    }

    @Override
    public void saveAll(List<Lot> lots) {
        this.parkingLotRepository.saveAll(lots);
    }

    @Override
    public List<Lot> findAll() {
        return this.parkingLotRepository.findAll();
    }
}
