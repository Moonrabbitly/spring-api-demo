/***

package com.chloeliu.demo.service;

import com.chloeliu.demo.entity.BoardGame;
import com.chloeliu.demo.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BoardGameService implements IService{
    @Override
    public List<Product> findAll() {
        //creating an object of ArrayList
        ArrayList<Product> products = new ArrayList<Product>();
        //adding products to the List
        products.add(new BoardGame(201, "Monopoly Game", "32901068868899", 19.92, 20,
                "Family Board Games for 2 to 6 Players & Kids Ages 8 and Up, Includes 8 Tokens (Token Vote Edition)"));
        products.add(new BoardGame(202, "Pictionary", "3290172497982", 16.80, 10,
                "Drawing Game for Kids, Adults and Game Night, Unique Catch-All Category for 2 Teams"));
        products.add(new BoardGame(203, "Trivial Pursuit Family Edition", "3290106823815", 14.99, 8,
                "Chloe's Exclusive"));
        products.add(new BoardGame(204, "The Game of Life", "32901068812853232", 24.99, 5,
                "Super Mario Edition Board Game for Kids Ages 8 and Up, Play Minigames, Collect Stars, Battle Bowser"));
        products.add(new BoardGame(205, "Sorry!", "32901061278365", 9.97, 18,
                "Nostalgic tabletop gameplay meets interactive digital content for an immersive gaming experience"));
        products.add(new BoardGame(206, "Candy Land", "32901068621520", 12.99, 5,
                "Kingdom of Sweet Adventures Kids Board Game, Preschool Games for 2-4 Players, Kids Board Games, Preschool Games, Ages 3 and Up"));
        products.add(new BoardGame(207, "Guess Who? ", "329027638627", 16.95, 17,
                "Animal Friends Board Game for Kids Ages 6+, Guess Who? Game with Animals, Includes 2 Double-Sided Animal Sheets"));
        products.add(new BoardGame(208, "Connect 4 Strategy Board Game", "3295723971047", 9.34, 16,
                "For Ages 6 and Up"));
        products.add(new BoardGame(209, "Scrabble Board Game", "32957236526502", 16.49, 12,
                "Word Game for Kids Ages 8 and Up, Fun Family Game for 2-4 Players, The Classic Crossword Game"));
        products.add(new BoardGame(210, "CLUE", "329011264264393", 38.99, 3,
                "Wizarding World Harry Potter Edition Mystery Board Game for 3-5 Players, Kids Ages 8 and Up"));

        //returns a list of product
        return products;
    }
}

 ***/
