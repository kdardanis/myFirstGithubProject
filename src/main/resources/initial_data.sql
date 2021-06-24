/*
-- Query: SELECT * FROM tour.region
-- Date: 2021-06-24 11:15
*/
INSERT INTO `region` (`id`,`region`) VALUES (2,'Ήπειρος');
INSERT INTO `region` (`id`,`region`) VALUES (3,'Αττική');
INSERT INTO `region` (`id`,`region`) VALUES (8,'Κρήτη');

INSERT INTO `tour` (`id`,`description`,`duration`,`price`,`title`,`region_id`,`image`) VALUES (5,'Κνωσσός',1,100,NULL,8,NULL);
INSERT INTO `tour` (`id`,`description`,`duration`,`price`,`title`,`region_id`,`image`) VALUES (6,'Ηράκλειο',3,100,NULL,8,NULL);
INSERT INTO `tour` (`id`,`description`,`duration`,`price`,`title`,`region_id`,`image`) VALUES (10,'Χανιά',3,100,NULL,8,NULL);
INSERT INTO `tour` (`id`,`description`,`duration`,`price`,`title`,`region_id`,`image`) VALUES (11,'Γιάννενα',2,50,NULL,2,NULL);
INSERT INTO `tour` (`id`,`description`,`duration`,`price`,`title`,`region_id`,`image`) VALUES (15,'Άνοιξη',2,20,NULL,2,NULL);
INSERT INTO `tour` (`id`,`description`,`duration`,`price`,`title`,`region_id`,`image`) VALUES (16,'Μιτσικέλι',2,50,NULL,2,NULL);

INSERT INTO `tour_package` (`id`,`description`,`duration`,`keywords`,`name`,`price`,`image`,`thumbnail`) VALUES (12,'Γύρος της Κρήτης',7,'tour','Κρήτη',700,NULL,NULL);
INSERT INTO `tour_package` (`id`,`description`,`duration`,`keywords`,`name`,`price`,`image`,`thumbnail`) VALUES (17,'Γιάννενα και Ζαγοροχώρια',6,'tour','Ήπειρος',500,NULL,NULL);

INSERT INTO `tour_package_tour` (`tour_package_id`,`tour_id`) VALUES (12,5);
INSERT INTO `tour_package_tour` (`tour_package_id`,`tour_id`) VALUES (12,6);
INSERT INTO `tour_package_tour` (`tour_package_id`,`tour_id`) VALUES (12,10);
INSERT INTO `tour_package_tour` (`tour_package_id`,`tour_id`) VALUES (17,11);
INSERT INTO `tour_package_tour` (`tour_package_id`,`tour_id`) VALUES (17,15);
INSERT INTO `tour_package_tour` (`tour_package_id`,`tour_id`) VALUES (17,16);
