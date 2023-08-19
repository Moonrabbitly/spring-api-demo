package com.chloeliu.demo.rest;

import com.chloeliu.demo.entity.Product;
import com.chloeliu.demo.service.BoardGameService;
import com.chloeliu.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.Collections;
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

    //add mapping for GET /employees/{employeeId}
    @GetMapping(value = "/boardgame/{param}")
    public ResponseEntity<List<Product>> searchBoardGame(@PathVariable String param) {
        List<Product> boardGames;
        if (param.matches("\\d+")) {
            // If the parameter is a number, assume it's an ID search
            int boardGameId = Integer.parseInt(param);
            Product theBoardGame = boardGameService.findById(boardGameId);
            if (theBoardGame == null) {
                return ResponseEntity.notFound().build();
            }
            boardGames = Collections.singletonList(theBoardGame);
        } else {
            // If the parameter is not a number, assume it's a keyword search
            boardGames = boardGameService.findByName(param);
        }
        return ResponseEntity.ok(boardGames);
    }

}
