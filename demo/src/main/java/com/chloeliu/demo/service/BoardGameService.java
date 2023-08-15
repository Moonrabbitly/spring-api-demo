package com.chloeliu.demo.service;


import com.chloeliu.demo.dao.BoardGameDAOJpa;
import com.chloeliu.demo.dao.ProductDAO;
import com.chloeliu.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BoardGameService implements ProductService{

    private BoardGameDAOJpa boardGameDAOJpa;
    @Autowired
    public BoardGameService(BoardGameDAOJpa boardGameDAOJpa) {
        this.boardGameDAOJpa = boardGameDAOJpa;
    }
    @Override
    public List<Product> findAll() {
        return boardGameDAOJpa.findAll();
    }
}
