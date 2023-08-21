package com.chloeliu.demo.dao;

import com.chloeliu.demo.entity.Book;
import com.chloeliu.demo.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BookDAOJpa implements ProductDAO {

    //define field for entitymanager
    private EntityManager entityManager;

    //set up constructor injection
    @Autowired
    public BookDAOJpa(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Product> findAll() {
        //create a query
        //the keyword used after the "FROM" clause should be the entity class name, not the database table name
        //in this case it's "from Book" instead of "from book", it is CASE SENSITIVE
        TypedQuery<Product> theQuery = entityManager.createQuery("from Book", Product.class);

        List<Product> books = theQuery.getResultList();
        return books;
    }

    //Note here we don't handle @Transactional at DAO layer, it will be handled in the Service layer
    @Override
    public Product findById(int theId) {
        Product theBook = entityManager.find(Book.class, theId);
        return theBook;
    }

    @Override
    public Product save(Product theProduct) {
        Product dbBook = entityManager.merge(theProduct);
        return dbBook;
    }

    @Override
    public void deleteById(int theId) {
        Product theBook = entityManager.find(Book.class, theId);
        entityManager.remove(theBook);
    }
}
