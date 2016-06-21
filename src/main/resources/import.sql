create table `city`
(
`id` int(11) NOT NULL AUTO_INCREMENT, 
 `name`  varchar(20),
 `state`  varchar(20),
 `country` varchar(20),
  PRIMARY KEY (`id`)
 );
 
insert into city (name, state, country) values ('San Francisco', 'CA', 'US');