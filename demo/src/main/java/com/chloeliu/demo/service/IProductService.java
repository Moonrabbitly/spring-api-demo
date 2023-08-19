package com.chloeliu.demo.service;

import com.chloeliu.demo.entity.Product;
import java.util.List;

public interface IProductService {
    List<Product> findAll();

    //Aug.15th, 2023 - add full CRUD methods (Create, Read, Update, Delete)
    Product findById(int theId);

    Product save(Product theProduct);

    void deleteById(int theId);

    public List<Product> findByName(String keyword);

}
