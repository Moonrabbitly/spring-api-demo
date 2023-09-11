package com.chloeliu.demo.rest;

import com.chloeliu.demo.entity.BoardGame;
import com.chloeliu.demo.entity.Book;
import com.chloeliu.demo.entity.Product;
import com.chloeliu.demo.service.BoardGameService;
import com.chloeliu.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.Collections;
import java.util.List;

@RestController
//@RequestMapping("/home")
public class ProductController {
    @Autowired
    private BookService bookService;
    @Autowired
    private BoardGameService boardGameService;

    //mapping the getProduct() method to /book
    @GetMapping(value = "/product/book")
    public List<Product> getBook() {
        return bookService.findAll();
    }

    //mapping the getProduct() method to /boardgame
    @GetMapping(value = "/product/boardgame")
    public List<Product> getBoardGame() {
        return boardGameService.findAll();
    }

    //add mapping for GET /book/{bookId}
    @GetMapping(value = "/product/book/{param}")
    public ResponseEntity<List<Product>> searchBook(@PathVariable String param) {
        List<Product> books;
        if (param.matches("\\d+")) {
            // If the parameter is a number, assume it's an ID search
            int bookId = Integer.parseInt(param);
            Product theBook = bookService.findById(bookId);
            if (theBook == null) {
                return ResponseEntity.notFound().build();
            }
            books = Collections.singletonList(theBook);
        } else {
            // If the parameter is not a number, assume it's a keyword search
            books = bookService.findByName(param);
        }
        return ResponseEntity.ok(books);
    }

    //add mapping for GET /boardgame/{boardgameId}
    @GetMapping(value = "/product/boardgame/{param}")
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

    //add mapping for POST/book - add new book
    //test in Postman - HTTP method "POST", http://localhost:8080/book
    @PostMapping("/product/book")
    public Product addBook(@RequestBody Book theBook) {
        //also just in case they pass an id in JSON...set id to 0
        //this is to force a save of new item...instead of update
        theBook.setId(0);
        Product bdBook = bookService.save(theBook);
        return bdBook;
    }

    //add mapping for POST/boardgame - add new boardgame
    @PostMapping("/product/boardgame")
    public Product addBoardGame(@RequestBody BoardGame theBoardGame) {
        theBoardGame.setId(0);
        Product bdBoardGame = boardGameService.save(theBoardGame);
        return bdBoardGame;
    }

    //add mapping for PUT /book - update existing book
    //test in Postman - HTTP method "PUT", http://localhost:8080/book
    @PutMapping("/product/book")
    public Product updateBook(@RequestBody Book theBook) {
        Product dbBook = bookService.save(theBook);
        return dbBook;
    }

    //add mapping for PUT /boardgame - update existing boardgame
    @PutMapping("/product/boardgame")
    public Product updateBoardGame(@RequestBody BoardGame theBoardGame) {
        Product bdBoardGame = bookService.save(theBoardGame);
        return bdBoardGame;
    }

    //add mapping for DELETE /book/{bookId} - delete book
    @DeleteMapping("/product/book/{bookId}")
    public String deleteBook(@PathVariable int bookId) {
        Product tempBook = bookService.findById(bookId);

        //throw exception if null
        if (tempBook == null) {
            throw new RuntimeException("Book id not found - " + bookId);
        }
        bookService.deleteById(bookId);
        return "Deleted book id - " + bookId;
    }

    //add mapping for DELETE /boardgame/{boardgameId} - delete boardgame
    @DeleteMapping("/product/boardgame/{boardgameId}")
    public String deleteBoardGame(@PathVariable int boardgameId) {
        Product tempBoardGame = boardGameService.findById(boardgameId);

        //throw exception if null
        if (tempBoardGame == null) {
            throw new RuntimeException("Boardgame id not found - " + boardgameId);
        }
        boardGameService.deleteById(boardgameId);
        return "Deleted boardgame id - " + boardgameId;
    }

}









