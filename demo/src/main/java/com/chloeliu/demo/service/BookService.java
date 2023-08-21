package com.chloeliu.demo.service;

import com.chloeliu.demo.dao.BookDAOJpa;
import com.chloeliu.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookService implements IProductService {

    private BookDAOJpa bookDAOJpa;
    @Autowired
    public BookService(BookDAOJpa bookDAOJpa) {
        this.bookDAOJpa = bookDAOJpa;
    }

    //Delegate the calls to the DAO
    @Override
    public List<Product> findAll() {
        return bookDAOJpa.findAll();
    }

    @Override
    public Product findById(int theId) {
        return bookDAOJpa.findById(theId);
    }

    //Apply @Transactional annotation at Service layer (when modifying database)
    @Transactional
    @Override
    public Product save(Product product) {
        return bookDAOJpa.save(product);
    }
    @Transactional
    @Override
    public void deleteById(int theId) {
        bookDAOJpa.deleteById(theId);
    }

    @Override
    public List<Product> findByName(String keyword) {
        List<Product> allBooks = bookDAOJpa.findAll();
        List<Product> matchingBooks = new ArrayList<>();

        for (Product book : allBooks) {
            if (book.getPname().toLowerCase().contains(keyword.toLowerCase())) {
                matchingBooks.add(book);
            }
        }

        return matchingBooks;
    }
}
