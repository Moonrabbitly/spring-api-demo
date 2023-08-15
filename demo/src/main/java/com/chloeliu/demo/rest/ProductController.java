package com.chloeliu.demo.rest;
import com.chloeliu.demo.entity.Product;
//import com.chloeliu.demo.service.BoardGameService;
import com.chloeliu.demo.dao.BoardGameDAOJpa;
import com.chloeliu.demo.service.BoardGameService;
import com.chloeliu.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("home")
public class ProductController {
    @Autowired
    private BookService bookService;

    @Autowired
    private BoardGameService boardGameService;

    //mapping the getProduct() method to /book
    @GetMapping(value = "/book")
    public List<Product> getBook() {

        return bookService.findAll();

    }

    //mapping the getProduct() method to /boardgame
    @GetMapping(value = "/boardgame")
    public List<Product> getBoardGame() {

        return boardGameService.findAll();

    }

}
