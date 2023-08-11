CREATE DATABASE  IF NOT EXISTS `product_directory`;
USE `product_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `boardgame`;

CREATE TABLE `boardgame` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_name` varchar(45) NOT NULL,
  `barcode` varchar(45) NOT NULL,
  `price` decimal(10, 2) NOT NULL,
  `inventory_count` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- Alter the table to set the AUTO_INCREMENT starting value
ALTER TABLE `boardgame` AUTO_INCREMENT = 201;

--
-- Data for table `employee`
--

INSERT INTO `boardgame` (`product_name`, `barcode`, `price`, `inventory_count`, `description`) VALUES 
	('Monopoly Game','32901068868899',19.92, 20,'Family Board Games for 2 to 6 Players & Kids Ages 8 and Up, Includes 8 Tokens (Token Vote Edition)'),
	('Pictionary','3290172497982',16.8,10,'Drawing Game for Kids, Adults and Game Night, Unique Catch-All Category for 2 Teams');
