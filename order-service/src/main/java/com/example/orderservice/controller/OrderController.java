package com.example.orderservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.orderservice.model.Order;
import com.example.orderservice.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepository orderRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createorder(@RequestBody Order order) {
        orderRepository.save(order);
    }
}
