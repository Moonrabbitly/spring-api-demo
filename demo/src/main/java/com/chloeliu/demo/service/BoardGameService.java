package com.chloeliu.demo.service;


import com.chloeliu.demo.dao.BoardGameDAOJpa;
import com.chloeliu.demo.entity.BoardGame;
import com.chloeliu.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
public class BoardGameService implements IProductService {

    private BoardGameDAOJpa boardGameDAOJpa;
    @Autowired
    public BoardGameService(BoardGameDAOJpa boardGameDAOJpa) {
        this.boardGameDAOJpa = boardGameDAOJpa;
    }

    //Delegate the calls to the DAO
    @Override
    public List<Product> findAll() {
        return boardGameDAOJpa.findAll();
    }

    @Override
    public Product findById(int theId) {
        return boardGameDAOJpa.findById(theId);
    }

    //Apply @Transactional annotation at Service layer (when modifying database)
    @Transactional
    @Override
    public Product save(Product theProduct) {
        return boardGameDAOJpa.save(theProduct);
    }
    @Transactional
    @Override
    public void deleteById(int theId) {
        boardGameDAOJpa.deleteById(theId);
    }

    public List<Product> findByName(String keyword) {
        List<Product> allBoardGames = boardGameDAOJpa.findAll();
        List<Product> matchingBoardGames = new ArrayList<>();

        for (Product boardGame : allBoardGames) {
            if (boardGame.getPname().toLowerCase().contains(keyword.toLowerCase())) {
                matchingBoardGames.add(boardGame);
            }
        }

        return matchingBoardGames;
    }
}
