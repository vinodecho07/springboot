insert into ingsuite.Product_group (product_group_id, product_group_name, product_group_description) values(0, 'Overview', 'Overview');
insert into ingsuite.Product_group (product_group_id, product_group_name, product_group_description) values(1, 'Mortgage', 'Mortgage Group');
insert into ingsuite.Product_group (product_group_id, product_group_name, product_group_description) values(2, 'Payments', 'Payments Group');
insert into ingsuite.Product_group (product_group_id, product_group_name, product_group_description) values(3, 'Savings', 'Savings Group');

insert into ingsuite.product (product_id, product_description, product_name, product_group_id) values(1,'Bank Saving mortgage','Bank Saving mortgage',1);
insert into ingsuite.product (product_id, product_description, product_name, product_group_id) values(2,'Interest-only','Interest-only',1);
insert into ingsuite.product (product_id, product_description, product_name, product_group_id) values(3,'Annuity','Annuity',1);
insert into ingsuite.product (product_id, product_description, product_name, product_group_id) values(4,'Linear','Linear',1);

insert into ingsuite.product (product_id, product_description, product_name, product_group_id)(product_id, product_name, product_description, product_group_id) values(5,'Payments account','Payments account',2);
insert into ingsuite.product (product_id, product_description, product_name, product_group_id) values(6,'Debit card','Debit card',2);
insert into ingsuite.product (product_id, product_description, product_name, product_group_id) values(7,'Quarterly limit','Quarterly limit',2);
insert into ingsuite.product (product_id, product_description, product_name, product_group_id) values(8,'Continuously limit','Continuously limit',2);

INSERT INTO ingsuite.product (product_id, product_description, product_name, product_group_id) VALUES ('1', 'Orange savings account desc', 'Orange savings account', '3');
INSERT INTO ingsuite.product (product_id, product_description, product_name, product_group_id) VALUES ('2', 'Child savings account desc', 'Child savings account', '3');
INSERT INTO ingsuite.product (product_id, product_description, product_name, product_group_id) VALUES ('3', 'Savings account for Unicef desc', 'Savings account for Unicef', '3');
INSERT INTO ingsuite.product (product_id, product_description, product_name, product_group_id) VALUES ('4', 'Bonus interest account desc', 'Bonus interest account', '3');
INSERT INTO ingsuite.product (product_id, product_description, product_name, product_group_id) VALUES ('5', 'Savings deposit desc', 'Savings deposit', '3');
INSERT INTO ingsuite.product (product_id, product_description, product_name, product_group_id) VALUES ('6', 'Green savings deposit desc', 'Green savings deposit', '3');

INSERT INTO ingsuite.product_detail (product_detail_id, duration, maximum_investment, minimum_investment, precentage_of_interest, rate_of_interest, special, withdrawal, product_product_id) VALUES ('2', 'unlimited', '99999999', '0', '0.20', 'variable', 'Savings Lion as present', 'always possible', '2');

INSERT INTO `ingsuite`.`metric`(`id`,`count`,`group_id`,`group_name`) VALUES(1,0,1,"Overview");
INSERT INTO `ingsuite`.`metric`(`id`,`count`,`group_id`,`group_name`) VALUES(2,0,2,"Mortgage");
INSERT INTO `ingsuite`.`metric`(`id`,`count`,`group_id`,`group_name`) VALUES(3,0,3,"Payments");
INSERT INTO `ingsuite`.`metric`(`id`,`count`,`group_id`,`group_name`) VALUES(4,0,4,"Savings");



