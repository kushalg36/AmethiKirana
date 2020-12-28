package com.amethikirana.AmethiKirana.Order.Service;

import com.amethikirana.AmethiKirana.Order.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    
}
