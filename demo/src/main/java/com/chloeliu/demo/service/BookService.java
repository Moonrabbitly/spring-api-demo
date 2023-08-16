package com.chloeliu.demo.service;

import com.chloeliu.demo.entity.Book;
import com.chloeliu.demo.entity.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IProductService {

    @Override
    public List<Product> findAll()
    {
        //creating an object of ArrayList
        ArrayList<Product> products = new ArrayList<Product>();
        //adding products to the List
        products.add(new Book(100, "Bears Don't Wear Shoes", "31901068868894", 15, 5));
        products.add(new Book(101, "Piggy And Gerald", "31901069100362", 12, 5));
        products.add(new Book(102, "Cheerful Chick", "31901064155148", 16, 3));
        products.add(new Book(103, "Goodnight, Butterfly", "31901068634296", 8, 3));
        products.add(new Book(104, "The Incredible Book Eating Boy", "31901060457779", 20, 10));
        products.add(new Book(105, "Max and Marla Are Having A Picnic", "31901062723707", 9, 5));
        products.add(new Book(106, "My Pocket Bathroom", "31901069351429", 13, 2));
        products.add(new Book(107, "Sleepover Duck", "31901062397114", 12, 5));
        products.add(new Book(108, "When the Wind Blew", "31901060804590", 10, 9));
        products.add(new Book(109, "The World's Best Class Plant", "31901069330720", 11, 20));

        //returns a list of product
        return products;
    }

    @Override
    public Product findById(int theId) {
        return null;
    }

    @Override
    public Product save(Product theProduct) {
        return null;
    }

    @Override
    public void deleteById(int theId) {

    }
}
