CREATE DATABASE  IF NOT EXISTS `product_directory`;
USE `product_directory`;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_name` varchar(45) NOT NULL,
  `barcode` varchar(45) NOT NULL,
  `price` decimal(10, 2) NOT NULL,
  `inventory_count` int NOT NULL,
  #`description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- Alter the table to set the AUTO_INCREMENT starting value
ALTER TABLE `book` AUTO_INCREMENT = 101;

--
-- Data for table `book`
--

INSERT INTO `book` (`product_name`, `barcode`, `price`, `inventory_count`) VALUES 
	('Bears Don''t Wear Shoes','31901068868894',15.92, 5),
	('Piggy And Gerald','31901069100362',12.80,8),
    ('Cheerful Chick','31901064155148',11.12,3),
    ('Goodnight, Butterfly','31901068634296',12.80,13),
    ('The Incredible Book Eating Boy','31901060457779',12.25,5),
    ('Max and Marla Are Having A Picnic','31901062723707',9.80,9),
    ('My Pocket Bathroom','31901069351429',12.85,9),
    ('Sleepover Duck','31901062397114',9.10,12),
    ('When the Wind Blew','31901060804590',10.15,6),
    ('The World''s Best Class Plant','31901069330720',14.14,7)
