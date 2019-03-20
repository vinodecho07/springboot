insert into ingsuite.Product_group (product_group_id, product_group_name, product_group_description) values(1, 'Mortgage', 'Mortgage Group');
insert into ingsuite.Product_group (product_group_id, product_group_name, product_group_description) values(2, 'Payments', 'Payments Group');
insert into ingsuite.Product_group (product_group_id, product_group_name, product_group_description) values(3, 'Savings', 'Savings Group');

INSERT INTO ingsuite.product (product_id, product_description, product_name, product_group_id) VALUES ('1', 'Orange savings account desc', 'Orange savings account', '3');
INSERT INTO ingsuite.product (product_id, product_description, product_name, product_group_id) VALUES ('2', 'Child savings account desc', 'Child savings account', '3');
INSERT INTO ingsuite.product (product_id, product_description, product_name, product_group_id) VALUES ('3', 'Savings account for Unicef desc', 'Savings account for Unicef', '3');
INSERT INTO ingsuite.product (product_id, product_description, product_name, product_group_id) VALUES ('4', 'Bonus interest account desc', 'Bonus interest account', '3');
INSERT INTO ingsuite.product (product_id, product_description, product_name, product_group_id) VALUES ('5', 'Savings deposit desc', 'Savings deposit', '3');
INSERT INTO ingsuite.product (product_id, product_description, product_name, product_group_id) VALUES ('6', 'Green savings deposit desc', 'Green savings deposit', '3');

INSERT INTO ingsuite.product_detail (product_detail_id, duration, maximum_investment, minimum_investment, precentage_of_interest, rate_of_interest, special, withdrawal, product_product_id) VALUES ('2', 'unlimited', '99999999', '0', '0.20', 'variable', 'Savings Lion as present', 'always possible', '2');