package com.chloeliu.demo.service;


import com.chloeliu.demo.dao.BoardGameDAOJpa;
import com.chloeliu.demo.entity.BoardGame;
import com.chloeliu.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

//The @Service annotation is used to annotate classes that provide some form of business logic or service.
//These classes encapsulate business-related functionality and often serve as intermediaries between controllers and repositories.
//The use of @Service helps to distinguish these classes from other components...
//...and adds a semantic meaning of being a service or business-related component.
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
