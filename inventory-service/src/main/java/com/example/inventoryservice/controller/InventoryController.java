package com.example.inventoryservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.inventoryservice.model.inventory;
import com.example.inventoryservice.repository.inventoryRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryRepository inventoryRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Inventory> findAll() {
        return inventoryRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createinventory(@RequestBody Inventory inventory) {
        inventoryRepository.save(inventory);
    }
}
