package com.chloeliu.demo.dao;

import com.chloeliu.demo.entity.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> findAll();

    //Aug.15th, 2023 - add full CRUD methods (Create, Read, Update, Delete)
    Product findById(int theId);

    Product save(Product theProduct);

    void deleteById(int theId);

}
