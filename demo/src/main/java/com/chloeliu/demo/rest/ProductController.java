package com.chloeliu.demo.rest;
import com.chloeliu.demo.entity.Product;
import com.chloeliu.demo.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private IService productService;

    //mapping the getProduct() method to /book
    @GetMapping(value = "/book")
    public List<Product> getBook() {
        //finds all the products
        List<Product> books = productService.findAll();
        //return the product list
        return books;
    }

    @GetMapping(value = "/boardgame")
    public List<Product> getBoardGame() {
        //finds all the products
        List<Product> boardGames = productService.findAll();
        //return the product list
        return boardGames;
    }
}
