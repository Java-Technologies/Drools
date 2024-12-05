package com.example.drools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RulesController {

    @Autowired
    RulesService rulesService;

    @PostMapping("/rules")
    public String index(@RequestBody Item item) {
        int fired = this.rulesService.fireRules(item);
        System.out.println(" Item Details " + item.toString());
        return "Rules Fired";
    }
}
