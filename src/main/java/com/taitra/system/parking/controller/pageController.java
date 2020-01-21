package com.taitra.system.parking.controller;

import com.taitra.system.parking.entity.Lot;
import com.taitra.system.parking.entity.LotCollection;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class pageController {

    @GetMapping("/")
    public String handleIndex() {
        return "index";
    }

    @GetMapping("/booking")
    public String handleBooking(Model model) {
        LotCollection lots = new LotCollection();

        for(int i = 0; i < 10; i++) {
            lots.addLot(new Lot());
        }

        model.addAttribute("form", lots);
        return "booking";
    }
}
