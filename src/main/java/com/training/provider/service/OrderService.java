package com.training.provider.service;

import com.training.provider.model.Order;

import java.util.List;

public interface OrderService {
    public List<Order> getAll();
    public  Order addorder( Order order);
    public  Order updateorder (Order order);
    public  Order deleteorder (int id );
}
