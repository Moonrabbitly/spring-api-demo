package com.chloeliu.demo.rest;
import com.chloeliu.demo.entity.BoardGame;
import com.chloeliu.demo.entity.Product;
//import com.chloeliu.demo.service.BoardGameService;
import com.chloeliu.demo.service.BoardGameDAOJpa;
import com.chloeliu.demo.service.BookService;
import com.chloeliu.demo.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("home")
public class ProductController {
    @Autowired
    private BookService bookService;

    //@Autowired
    //private BoardGameService boardGameService;

    //mapping the getProduct() method to /book
    @GetMapping(value = "/book")
    public List<Product> getBook() {
        //finds all the products
        List<Product> books = bookService.findAll();
        //return the product list
        return books;
    }

    //mapping the getProduct() method to /boardgame
    //@GetMapping(value = "/boardgame")
    //public List<Product> getBoardGame() {
        //finds all the products
    //    List<Product> boardGames = boardGameService.findAll();
        //return the product list
    //    return boardGames;
    //}

    //Aug 11th - exploring database DAO
    @Autowired
    private BoardGameDAOJpa boardGameDAOJpa;

    //mapping the getProduct() method to /boardgame
    @GetMapping(value = "/boardgame")
    public List<Product> getBoardGame() {

        //finds all the products
        List<Product> boardGames = boardGameDAOJpa.findAll();

        //return the product list
        return boardGames;

    }
}
