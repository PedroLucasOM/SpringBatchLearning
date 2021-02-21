CREATE TABLE `bank_account` (
                                `id` int NOT NULL AUTO_INCREMENT,
                                `account_type` enum('PRATA','OURO','PLATINA','DIAMANTE') DEFAULT NULL,
                                `max_limit` double DEFAULT NULL,
                                `client_id` text,
                                PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=404 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `client` (
                          `name` text,
                          `nickname` text,
                          `age` int DEFAULT NULL,
                          `email` varchar(50) NOT NULL,
                          `salary_range` double DEFAULT NULL,
                          PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `employee` (
                            `registration` int NOT NULL,
                            `name` text,
                            `age` int DEFAULT NULL,
                            PRIMARY KEY (`registration`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `launch` (
                          `codeNatureExpense` int DEFAULT NULL,
                          `descriptionNatureExpense` text,
                          `launchDescription` text,
                          `launchDate` date DEFAULT NULL,
                          `launchValue` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `point_registry` (
                                  `id` int NOT NULL AUTO_INCREMENT,
                                  `date` datetime DEFAULT NULL,
                                  `employee_id` int DEFAULT NULL,
                                  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `point_sheet` (
                               `id` int NOT NULL AUTO_INCREMENT,
                               `month` int DEFAULT NULL,
                               `year` int DEFAULT NULL,
                               `employee_id` int DEFAULT NULL,
                               `registry_points` text,
                               PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;