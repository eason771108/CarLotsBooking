package com.taitra.system.parking.controller;

import com.taitra.system.parking.entity.Lot;
import com.taitra.system.parking.entity.LotCollection;
import com.taitra.system.parking.service.LotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class lotActionController {

    private LotService lotService;

    public lotActionController(LotService lotService) {
        this.lotService = lotService;
    }

    @PostMapping("/lot/save")
    public String handleSaveLots(@ModelAttribute LotCollection lots, Model model) {

        lots.getLots().forEach( item->{
            log.info("Lot ID : {}, Car Number : {}", item.getLotId(), item.getCarNumber());
            if(!item.getCarNumber().isEmpty() && !item.getLotId().isEmpty())
                lotService.save(item);
        });

        return "redirect:/lot/all";
    }

    @GetMapping("/lot/all")
    public  String handleGetAllLots(Model model) {

        List<Lot> lots = new ArrayList<>();

        lotService.findAll().iterator().forEachRemaining(lots::add);
        LotCollection lotCollection = new LotCollection(lots);
        log.info("all lots : {}", lots.size());
        model.addAttribute("form", lotCollection);
        return "lots";
    }
}
