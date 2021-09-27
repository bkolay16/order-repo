package com.test.bk.inventory.controller;

import com.test.bk.inventory.entity.Item;
import com.test.bk.inventory.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class InventoryController {

    @Autowired
    ItemRepository repo;

    @PostMapping
    public Item addItem(@RequestBody Item item){

       return  repo.save(item);
    }

    @GetMapping
    public List<Item> getItems(){

        return  repo.findAll();
    }

    @GetMapping("/{id}")
    public Item getItems(@PathVariable(name = "id") int id){

        return  repo.getById(id);
    }
}
