DELETE IF EXISTS `bank_account`;

CREATE TABLE `bank_account` (
                                `id` int NOT NULL AUTO_INCREMENT,
                                `account_type` enum('PRATA','OURO','PLATINA','DIAMANTE') DEFAULT NULL,
                                `max_limit` double DEFAULT NULL,
                                `client_id` text,
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=404 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DELETE IF EXISTS `client`;

CREATE TABLE `client` (
                          `name` text,
                          `nickname` text,
                          `age` int DEFAULT NULL,
                          `email` varchar(50) NOT NULL,
                          `salary_range` double DEFAULT NULL,
                          PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `client` VALUES
('Mariam Reichert PhD', NULL, '56', 'abernier@example.com', '889.2'),
('Kyra Gutmann', NULL, '58', 'alexandria.gutmann@example.org', '2084.11'),
('Mrs. Ashlynn Treutel', NULL, '61', 'amani.wuckert@example.net', '395.25'),
('Cassie Breitenberg', NULL, '66', 'ankunding.cheyanne@example.net', '407.48'),
('Herman Skiles', NULL, '97', 'asimonis@example.net', NULL),
('Ashly Sawayn I', NULL, '80', 'bell.botsford@example.org', '584'),
('Abigail Hagenes', NULL, '44', 'bernier.junius@example.org', NULL),
('Denis Schroeder', NULL, '62', 'berry.heaney@example.net', NULL),
('Yessenia Rau II', NULL, '34', 'bkris@example.org', NULL),
('Magali Feil', NULL, '30', 'brice52@example.com', '617.38'),
('Melany Mann', NULL, '58', 'bridie93@example.net', NULL),
('Emily Bradtke I', NULL, '80', 'brown.aliya@example.org', NULL),
('Miss Rossie Kohler II', NULL, '31', 'buckridge.tiana@example.com', '31118.75'),
('Dr. Reba Grady III', NULL, '78', 'carlie15@example.org', '1590.43'),
('Dr. Brycen Kirlin', NULL, '89', 'celestino10@example.org', NULL),
('Ova Hauck', NULL, '28', 'celine.cummerata@example.org', NULL),
('Miss Cortney Doyle', NULL, '49', 'cordie.eichmann@example.com', '104.41'),
('Kristofer Sipes MD', NULL, '92', 'cronin.theo@example.org', NULL),
('Benny Denesik Jr.', NULL, '57', 'dejon41@example.net', '977.83'),
('Lea Miller', NULL, '37', 'dejuan67@example.com', NULL),
('Bryana Hermann', NULL, '47', 'demetrius.fisher@example.net', NULL),
('Donnell Lind MD', NULL, '21', 'denesik.ruben@example.com', '14897.49'),
('Ken Auer II', NULL, '58', 'derek.paucek@example.org', '36583.92'),
('Leonel Adams', NULL, '92', 'destini.marks@example.org', NULL),
('Dr. Laverna Barrows DDS', NULL, '79', 'dkilback@example.org', NULL),
('Regan Walter PhD', NULL, '83', 'dkoepp@example.com', '2140.55'),
('Tom Hirthe', NULL, '32', 'dsanford@example.org', '13564.87'),
('Stanford Davis', NULL, '87', 'ernser.sarah@example.org', '146.82'),
('Stacy Kilback', NULL, '24', 'farrell.noemy@example.org', '413.61'),
('Mr. Eldred Nikolaus MD', NULL, '53', 'freddie94@example.org', '130.73'),
('Mr. Zack Wisozk', NULL, '51', 'freichel@example.net', NULL),
('Dusty Kunde', NULL, '68', 'freynolds@example.com', '606.36'),
('Maxie OReilly III', NULL, '62', 'garrison.larson@example.com', '634.82'),
('Mr. Moshe Mraz', NULL, '23', 'gdonnelly@example.org', '352.12'),
('Prof. Barbara Dach', NULL, '27', 'geo.dach@example.org', NULL),
('Jenifer Muller', NULL, '82', 'gleason.daphney@example.com', '151.69'),
('Dr. Frederic Little', NULL, '96', 'gulgowski.kali@example.com', NULL),
('Bert Cummings', NULL, '75', 'halvorson.ivy@example.net', NULL),
('Ardith Wilkinson', NULL, '45', 'harrison.bradtke@example.com', '1467.07'),
('Twila Stark', NULL, '35', 'heaney.meggie@example.org', '7792.28'),
('Thelma Cormier', NULL, '88', 'hilario79@example.org', NULL),
('Prof. Van Auer', NULL, '22', 'homenick.sydney@example.com', '1250.65'),
('Prof. Palma Spinka', NULL, '28', 'howe.elian@example.net', '26.86'),
('Norene Ortiz', NULL, '49', 'ignatius.kuhlman@example.org', '808.06'),
('Wava Buckridge', NULL, '49', 'jacobi.megane@example.com', '29.88'),
('Prof. Cameron Keeling', NULL, '75', 'jody41@example.com', NULL),
('Zack Stiedemann', NULL, '77', 'julian81@example.com', '701.35'),
('Haven Mann', NULL, '66', 'kaley41@example.org', '809.64'),
('Francisco Swaniawski', NULL, '80', 'kariane.marvin@example.org', NULL),
('Prof. Lavonne King', NULL, '73', 'karianne.wolff@example.org', '199.97'),
('Keith Hoeger', NULL, '47', 'klocko.kareem@example.net', '405.51'),
('Mrs. Avis Gerhold', NULL, '99', 'kunde.kraig@example.org', '1155.96'),
('Dr. Clair Bayer', NULL, '78', 'kunze.aniya@example.com', NULL),
('Elyssa Gerhold', NULL, '60', 'magdalen99@example.org', '964.64'),
('Anastasia Kemmer', NULL, '19', 'maiya.boehm@example.org', '984.76'),
('Maegan Hackett', NULL, '58', 'marilyne.mcglynn@example.net', '3305.84'),
('Eladio Weber', NULL, '58', 'marlene.beahan@example.net', NULL),
('Damien Bauch', NULL, '29', 'maurine88@example.org', '10847.18'),
('Dr. Gabe Paucek', NULL, '41', 'medhurst.tiffany@example.net', NULL),
('Mr. Mustafa Altenwerth', NULL, '93', 'mgleason@example.net', NULL),
('Madie Bechtelar', NULL, '23', 'milford.corkery@example.net', NULL),
('Gladys Goodwin', NULL, '27', 'milton.white@example.org', '8217.66'),
('Moshe Spencer', NULL, '29', 'molly.feil@example.org', NULL),
('Ms. Sandrine Nienow', NULL, '62', 'mstehr@example.net', NULL),
('Joanie Purdy', NULL, '34', 'ncorkery@example.org', '800.14'),
('Miss Lila Jacobs Sr.', NULL, '74', 'nwehner@example.org', NULL),
('Sydnee Koelpin', NULL, '21', 'octavia.white@example.com', '792.82'),
('Ibrahim Kiehn MD', NULL, '33', 'oswald.parisian@example.net', '78729.77'),
('Adrianna Hilpert', NULL, '61', 'pfeffer.louisa@example.com', NULL),
('Agustin Champlin', NULL, '20', 'pink.schoen@example.com', '839.61'),
('Elijah Carter', NULL, '64', 'qdonnelly@example.net', '33041.46'),
('Rhiannon Kirlin PhD', NULL, '20', 'qfahey@example.com', '3830.46'),
('Keeley Lindgren', NULL, '98', 'qrau@example.com', '354.53'),
('Prof. Margarita Conn V', NULL, '31', 'quinton.koelpin@example.org', '23164.7'),
('Tyree Luettgen', NULL, '43', 'rcorwin@example.org', '3198.02'),
('Emmanuelle Waelchi', NULL, '50', 'reilly.emmie@example.net', NULL),
('Josh Abbott', NULL, '98', 'rex.frami@example.org', '1151.21'),
('Mrs. Kaylah Wyman DVM', NULL, '37', 'roberto09@example.org', '686.48'),
('Skyla Raynor', NULL, '76', 'rose71@example.net', '902.09'),
('Mr. Baron Hodkiewicz DDS', NULL, '34', 'rossie25@example.org', '887.3'),
('Broderick Lueilwitz', NULL, '31', 'rrunolfsdottir@example.org', '6059.99'),
('Dayna Gleichner', NULL, '65', 'salvador.corwin@example.net', '983.83'),
('Prof. Carli Will', NULL, '73', 'sophie.grimes@example.org', '1405.43'),
('Prof. Al Oberbrunner Sr.', NULL, '34', 'stehr.lane@example.com', '479.21'),
('Francesco Ankunding', NULL, '93', 'swaniawski.sophia@example.com', NULL),
('Arden Gorczany', NULL, '64', 'sylvester59@example.com', NULL),
('Lesley Lueilwitz', NULL, '64', 'tbernier@example.com', '455.82'),
('Carrie Hagenes I', NULL, '29', 'trycia.fay@example.org', '745.03'),
('Lauren Torphy', NULL, '62', 'ublanda@example.net', '788.06'),
('Georgianna Hoppe', NULL, '100', 'uturner@example.com', '1027.07'),
('Dr. Vivien Miller', NULL, '42', 'vcremin@example.org', NULL),
('Verner Walker', NULL, '85', 'vlittle@example.com', '845.41'),
('Noemi Tremblay', NULL, '27', 'ward.makenna@example.org', '2110.2'),
('Dr. Erin Dooley', NULL, '32', 'wbruen@example.net', NULL),
('Dr. Madison Schultz', NULL, '38', 'winnifred69@example.org', '586.71'),
('Dr. Gladyce Klocko', NULL, '73', 'xhomenick@example.com', '20627.86'),
('Modesta Kiehn', NULL, '26', 'xschoen@example.org', '11129.81'),
('Madonna Russel MD', NULL, '61', 'yundt.eda@example.net', '33943.39'),
('Michel Borer', NULL, '61', 'zkub@example.org', '41.63'),
('Mr. Major O Connell IV', NULL, '96', 'zmuller@example.org', NULL);

DELETE IF EXISTS `employee`;

CREATE TABLE `employee` (
                            `registration` int NOT NULL,
                            `name` text,
                            `age` int DEFAULT NULL,
                            PRIMARY KEY (`registration`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `employee` VALUES
('113883', 'Lukas Abernathy OK', '58'),
('121928', 'Felicity Jacobson OK', '56'),
('122683', 'Mr. Junius Wintheiser OK', '33'),
('171171', 'Macy Willms NOK', '35'),
('184218', 'Luna Moen IV NOK', '35');

DELETE IF EXISTS `launch`;

CREATE TABLE `launch` (
                          `codeNatureExpense` int DEFAULT NULL,
                          `descriptionNatureExpense` text,
                          `launchDescription` text,
                          `launchDate` date DEFAULT NULL,
                          `launchValue` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `launch` VALUES
('44905224', 'EQUIPAMENTO DE PROTEÇÃO SEGURANÇA E SOCORRO', 'Alarme', '2020-05-01', '1000'),
('44905287', 'MATERIAL DE CONSUMO DE USO DURADOURO', 'Cortina de sala', '2020-05-02', '1000'),
('44905287', 'MATERIAL DE CONSUMO DE USO DURADOURO', 'Bandeiras', '2020-05-03', '500'),
('44905287', 'MATERIAL DE CONSUMO DE USO DURADOURO', 'Guarda Sol', '2020-05-04', '500'),
('33903016', 'MATERIAL DE EXPEDIENTE', 'Resma de Papel A4', '2020-05-01', '2000'),
('33903016', 'MATERIAL DE EXPEDIENTE', 'Cartucho Impressora', '2020-05-10', '2000'),
('44905218', 'COLEÇÕES E MATERIAIS BIBLIOGRÁFICOS', 'Dicionários', '2020-05-12', '4000'),
('44905218', 'COLEÇÕES E MATERIAIS BIBLIOGRÁFICOS', 'Livro de Algoritmos', '2020-05-11', '4000'),
('33903024', 'MATERIAL P/ MANUT. DE BENS IMÓVEIS/INSTALAÇÕES', 'Amianto', '2020-05-13', '8000'),
('33903024', 'MATERIAL P/ MANUT. DE BENS IMÓVEIS/INSTALAÇÕES', 'Aparelhos Sanitários', '2020-05-11', '6000'),
('33903024', 'MATERIAL P/ MANUT. DE BENS IMÓVEIS/INSTALAÇÕES', 'Cimento', '2020-05-12', '2000'),
('33903302', 'PASSAGENS PARA O EXTERIOR', 'Viagem para Las Vegas', '2020-05-01', '32000');

DELETE IF EXISTS `point_registry`;

CREATE TABLE `point_registry` (
                                  `id` int NOT NULL AUTO_INCREMENT,
                                  `date` datetime DEFAULT NULL,
                                  `employee_id` int DEFAULT NULL,
                                  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `point_registry` VALUES
('1', '2021-02-04 08:00:00', '121928'),
('2', '2021-02-04 12:00:00', '121928'),
('3', '2021-02-04 14:00:00', '121928'),
('4', '2021-02-04 18:00:00', '121928'),
('5', '2021-02-05 08:00:00', '121928'),
('6', '2021-02-04 12:00:00', '113883'),
('7', '2021-02-04 08:00:00', '122683'),
('8', '2021-02-05 08:00:00', '122683');

DELETE IF EXISTS `point_sheet`;

CREATE TABLE `point_sheet` (
                               `id` int NOT NULL AUTO_INCREMENT,
                               `month` int DEFAULT NULL,
                               `year` int DEFAULT NULL,
                               `employee_id` int DEFAULT NULL,
                               `registry_points` text,
                               PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;