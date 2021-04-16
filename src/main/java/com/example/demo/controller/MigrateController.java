package com.example.demo.controller;

import com.example.demo.model.Rateplans;
import com.example.demo.service.MigrateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URISyntaxException;

@Controller
@RequestMapping("/migrate")
public class MigrateController {

    private static MigrateService migrateService;

    public MigrateController(MigrateService migrateService) {
        this.migrateService = migrateService;
    }

    @GetMapping("/actual")
    public String getAllMigrateActualRatePlan(Model model) throws URISyntaxException {
        model.addAttribute("rateplanList", migrateService.findActualRatePlans());
        model.addAttribute("rateplan", new Rateplans());
        return "migrated_start_report_page";

 /*       @PostMapping("/save")
        public String createOrder(Model model) throws URISyntaxException {
            //model.addAllAttributes(migrateService.findAllandMigrate());
            model.addAttribute("rateplanList", migrateService.findAllandMigrate());
            model.addAttribute("rateplan", new Rateplans());
            return "migrated_report_page";

        }*/

    }

}
