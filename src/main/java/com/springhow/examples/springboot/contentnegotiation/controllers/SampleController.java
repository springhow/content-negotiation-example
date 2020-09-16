package com.springhow.examples.springboot.contentnegotiation.controllers;

import com.springhow.examples.springboot.contentnegotiation.pojo.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class SampleController {


    @GetMapping("/item")
    public Item item() {
        return new Item(1, "Item 1", BigDecimal.valueOf(10.9d));
    }
}
