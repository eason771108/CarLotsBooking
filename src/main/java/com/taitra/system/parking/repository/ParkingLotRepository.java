package com.taitra.system.parking.repository;

import com.taitra.system.parking.entity.Lot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingLotRepository extends JpaRepository<Lot, String> {
}
