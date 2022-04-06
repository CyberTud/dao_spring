package com.example.demo.dao;

public interface DAO <T>{
    Object get(Integer id);
    void create(T t);
    void delete(T t);
    void update(T t);
}
