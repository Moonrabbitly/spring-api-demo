package com.chloeliu.demo.dao;

import com.chloeliu.demo.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository: This annotation marks the class as a Spring bean and indicates that it should be eligible for component scanning.
//Spring will automatically detect and manage instances of this class.
@Repository
public class BoardGameDAOJpa implements ProductDAO {

    //define field for entitymanager
    private EntityManager entityManager;

    //set up constructor injection
    @Autowired
    public BoardGameDAOJpa(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Product> findAll() {
        //create a query
        //the keyword used after the "FROM" clause should be the entity class name, not the database table name
        //in this case it's "from BoardGame" instead of "from boardgame", it is CASE SENSITIVE
        TypedQuery<Product> theQuery = entityManager.createQuery("from BoardGame", Product.class);

        //execute query and get result list
        List<Product> boardGames = theQuery.getResultList();

        //return the results
        return boardGames;
    }
}
