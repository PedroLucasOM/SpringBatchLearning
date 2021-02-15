DROP TABLE IF EXISTS client;

CREATE table client
(
    name         TEXT,
    nickname     TEXT,
    age          INT,
    email        VARCHAR(50),
    salary_range DOUBLE,
    primary key (email)
);

DROP TABLE IF EXISTS bank_account;

CREATE table bank_account
(
    id           int auto_increment,
    account_type ENUM ('PRATA','OURO','PLATINA','DIAMANTE'),
    max_limit    DOUBLE,
    client_id    text,
    primary key (id)
);


INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Mariam Reichert PhD', 56, 'abernier@example.com', '889.2');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Kyra Gutmann', 58, 'alexandria.gutmann@example.org', '2084.11');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Mrs. Ashlynn Treutel', 61, 'amani.wuckert@example.net', '395.25');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Cassie Breitenberg', 66, 'ankunding.cheyanne@example.net', '407.48');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Herman Skiles', 97, 'asimonis@example.net', '522577.31');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Ashly Sawayn I', 80, 'bell.botsford@example.org', '584');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Abigail Hagenes', 44, 'bernier.junius@example.org', '689550.84');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Denis Schroeder', 62, 'berry.heaney@example.net', '297487.77');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Yessenia Rau II', 34, 'bkris@example.org', '7556151.11');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Magali Feil', 30, 'brice52@example.com', '617.38');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Melany Mann', 58, 'bridie93@example.net', '18359059.13');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Emily Bradtke I', 80, 'brown.aliya@example.org', '403492464.41');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Miss Rossie Kohler II', 31, 'buckridge.tiana@example.com', '31118.75');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Dr. Reba Grady III', 78, 'carlie15@example.org', '1590.43');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Dr. Brycen Kirlin', 89, 'celestino10@example.org', '190891.39');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Ova Hauck', 28, 'celine.cummerata@example.org', '77999571.99');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Miss Cortney Doyle', 49, 'cordie.eichmann@example.com', '104.41');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Kristofer Sipes MD', 92, 'cronin.theo@example.org', '305397.43');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Benny Denesik Jr.', 57, 'dejon41@example.net', '977.83');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Lea Miller', 37, 'dejuan67@example.com', '85384934.62');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Bryana Hermann', 47, 'demetrius.fisher@example.net', '443450.12');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Donnell Lind MD', 21, 'denesik.ruben@example.com', '14897.49');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Ken Auer II', 58, 'derek.paucek@example.org', '36583.92');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Leonel Adams', 92, 'destini.marks@example.org', '34276761.76');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Dr. Laverna Barrows DDS', 79, 'dkilback@example.org', '695233169.5');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Regan Walter PhD', 83, 'dkoepp@example.com', '2140.55');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Tom Hirthe', 32, 'dsanford@example.org', '13564.87');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Stanford Davis', 87, 'ernser.sarah@example.org', '146.82');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Stacy Kilback', 24, 'farrell.noemy@example.org', '413.61');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Mr. Eldred Nikolaus MD', 53, 'freddie94@example.org', '130.73');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Mr. Zack Wisozk', 51, 'freichel@example.net', '163801089.81');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Dusty Kunde', 68, 'freynolds@example.com', '606.36');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Maxie O\'Reilly III', 62, 'garrison.larson@example.com', '634.82');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Mr. Moshe Mraz', 23, 'gdonnelly@example.org', '352.12');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Prof. Barbara Dach', 27, 'geo.dach@example.org', '29984721.28');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Jenifer Muller', 82, 'gleason.daphney@example.com', '151.69');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Dr. Frederic Little', 96, 'gulgowski.kali@example.com', '62463470.79');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Bert Cummings', 75, 'halvorson.ivy@example.net', '188671.16');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Ardith Wilkinson', 45, 'harrison.bradtke@example.com', '1467.07');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Twila Stark', 35, 'heaney.meggie@example.org', '7792.28');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Thelma Cormier', 88, 'hilario79@example.org', '189193721.73');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Prof. Van Auer', 22, 'homenick.sydney@example.com', '1250.65');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Prof. Palma Spinka', 28, 'howe.elian@example.net', '26.86');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Norene Ortiz', 49, 'ignatius.kuhlman@example.org', '808.06');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Wava Buckridge', 49, 'jacobi.megane@example.com', '29.88');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Prof. Cameron Keeling', 75, 'jody41@example.com', '4683692.41');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Zack Stiedemann', 77, 'julian81@example.com', '701.35');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Haven Mann', 66, 'kaley41@example.org', '809.64');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Francisco Swaniawski', 80, 'kariane.marvin@example.org', '204014467.33');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Prof. Lavonne King', 73, 'karianne.wolff@example.org', '199.97');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Keith Hoeger', 47, 'klocko.kareem@example.net', '405.51');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Mrs. Avis Gerhold', 99, 'kunde.kraig@example.org', '1155.96');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Dr. Clair Bayer', 78, 'kunze.aniya@example.com', '32062756.73');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Elyssa Gerhold', 60, 'magdalen99@example.org', '964.64');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Anastasia Kemmer', 19, 'maiya.boehm@example.org', '984.76');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Maegan Hackett', 58, 'marilyne.mcglynn@example.net', '3305.84');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Eladio Weber', 58, 'marlene.beahan@example.net', '325997037.21');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Damien Bauch', 29, 'maurine88@example.org', '10847.18');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Dr. Gabe Paucek', 41, 'medhurst.tiffany@example.net', '3997102.27');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Mr. Mustafa Altenwerth', 93, 'mgleason@example.net', '275805079.07');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Madie Bechtelar', 23, 'milford.corkery@example.net', '135858.96');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Gladys Goodwin', 27, 'milton.white@example.org', '8217.66');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Moshe Spencer', 29, 'molly.feil@example.org', '28407202.05');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Ms. Sandrine Nienow', 62, 'mstehr@example.net', '30658330.39');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Joanie Purdy', 34, 'ncorkery@example.org', '800.14');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Miss Lila Jacobs Sr.', 74, 'nwehner@example.org', '41300639');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Sydnee Koelpin', 21, 'octavia.white@example.com', '792.82');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Ibrahim Kiehn MD', 33, 'oswald.parisian@example.net', '78729.77');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Adrianna Hilpert', 61, 'pfeffer.louisa@example.com', '1802878.73');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Agustin Champlin', 20, 'pink.schoen@example.com', '839.61');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Elijah Carter', 64, 'qdonnelly@example.net', '33041.46');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Rhiannon Kirlin PhD', 20, 'qfahey@example.com', '3830.46');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Keeley Lindgren', 98, 'qrau@example.com', '354.53');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Prof. Margarita Conn V', 31, 'quinton.koelpin@example.org', '23164.7');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Tyree Luettgen', 43, 'rcorwin@example.org', '3198.02');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Emmanuelle Waelchi', 50, 'reilly.emmie@example.net', '14555593.68');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Josh Abbott', 98, 'rex.frami@example.org', '1151.21');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Mrs. Kaylah Wyman DVM', 37, 'roberto09@example.org', '686.48');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Skyla Raynor', 76, 'rose71@example.net', '902.09');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Mr. Baron Hodkiewicz DDS', 34, 'rossie25@example.org', '887.3');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Broderick Lueilwitz', 31, 'rrunolfsdottir@example.org', '6059.99');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Dayna Gleichner', 65, 'salvador.corwin@example.net', '983.83');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Prof. Carli Will', 73, 'sophie.grimes@example.org', '1405.43');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Prof. Al Oberbrunner Sr.', 34, 'stehr.lane@example.com', '479.21');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Francesco Ankunding', 93, 'swaniawski.sophia@example.com', '7607114.09');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Arden Gorczany', 64, 'sylvester59@example.com', '440195394.59');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Lesley Lueilwitz', 64, 'tbernier@example.com', '455.82');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Carrie Hagenes I', 29, 'trycia.fay@example.org', '745.03');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Lauren Torphy', 62, 'ublanda@example.net', '788.06');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Georgianna Hoppe', 100, 'uturner@example.com', '1027.07');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Dr. Vivien Miller', 42, 'vcremin@example.org', '364854.36');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Verner Walker', 85, 'vlittle@example.com', '845.41');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Noemi Tremblay', 27, 'ward.makenna@example.org', '2110.2');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Dr. Erin Dooley', 32, 'wbruen@example.net', '67165450.91');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Dr. Madison Schultz', 38, 'winnifred69@example.org', '586.71');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Dr. Gladyce Klocko', 73, 'xhomenick@example.com', '20627.86');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Modesta Kiehn', 26, 'xschoen@example.org', '11129.81');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Madonna Russel MD', 61, 'yundt.eda@example.net', '33943.39');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Michel Borer', 61, 'zkub@example.org', '41.63');
INSERT INTO `client` (`name`, `age`, `email`, `salary_range`)
VALUES ('Mr. Major O\'Connell IV', 96, 'zmuller@example.org', '57016018.85');
