package com.training.provider.serviceImpl;

import com.training.provider.model.Order;
import com.training.provider.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public List<Order> getAll() {
        List<Order> getall = new ArrayList<>();
        Order o1 = new Order(1,"mobile","noida");
        Order o2 = new Order(2,"tv","delhi");
        getall.add(o1);
        getall.add(o2);

        return getall;
    }

    @Override
    public Order addorder(Order order) {
        return order;
    }

    @Override
    public Order updateorder(Order order) {
        return null;
    }

    @Override
    public Order deleteorder(int id) {
        return null;
    }
}
