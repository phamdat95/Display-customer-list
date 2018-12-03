package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> cus = new HashMap<>();
    static {
        cus.put(1, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        cus.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        cus.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        cus.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        cus.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        cus.put(6, new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(cus.values());
    }

    @Override
    public void save(Customer customer) {
        cus.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return cus.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        cus.put(id,customer);
    }

    @Override
    public void remove(int id) {
        cus.remove(id);
    }
}
