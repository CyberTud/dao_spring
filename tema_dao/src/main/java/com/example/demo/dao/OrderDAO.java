package com.example.demo.dao;

import com.example.demo.repository.OrderRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderDAO implements DAO<OrderDAO> {
    private final OrderRepository orderRepository;

    @Override
    public Object get(Integer id) {
        return orderRepository.findById(id);
    }

    @Override
    public void create(OrderDAO order) {
        orderRepository.save(order);
    }

    @Override
    public void delete(OrderDAO order) {
        orderRepository.delete(order);
    }

    @Override
    public void update(OrderDAO order) {
        orderRepository.save(order);
    }
}
