package com.training.provider.controller;

import com.training.provider.model.Order;
import com.training.provider.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class OrderController {
    @Autowired
    private OrderService orderService;


    @GetMapping("/get")
    public List<Order>getAll(){
        return orderService.getAll();
    }
    @PostMapping("/save")
    public Order savestudent(@RequestBody  Order Order){
        return orderService.addorder(Order );
    }

    @DeleteMapping("/deleteOrder/{id}")
    public Order getDelete(@PathVariable int id){
        return orderService.deleteorder(id);
    }

    @PutMapping ("/updateOrder")
    public Order updateOrder(@RequestBody Order order){
        return orderService.updateorder(order);

    }
}
