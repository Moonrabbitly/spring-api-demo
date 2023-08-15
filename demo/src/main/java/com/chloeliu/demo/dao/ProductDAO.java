package com.chloeliu.demo.dao;

import com.chloeliu.demo.entity.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> findAll();
}
