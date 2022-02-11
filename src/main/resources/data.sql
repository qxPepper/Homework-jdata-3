insert into CUSTOMERS (name, surname, age, phone_number)
    values ('Ivan', 'Ivanov', 24, '495-1234567');

insert into CUSTOMERS (name, surname, age, phone_number)
    values ('Vasiliy', 'Pupkin', 31, '495-7778899');

insert into CUSTOMERS (name, surname, age, phone_number)
    values ('Sidor', 'Kuzmin', 16, '49-1234567');

insert into CUSTOMERS (name, surname, age, phone_number)
    values ('Alexey', 'Yagudin', 42, '666-6666666');

insert into CUSTOMERS (name, surname, age, phone_number)
    values ('Ben', 'Stopper', 21, '495-9876543');



insert into ORDERS (customer_id, product_name, amount)
    values (4, 'milk', 95);

insert into ORDERS (date, customer_id, product_name, amount)
    values ('2022-02-06 12:00:02', 1, 'bread', 65);

insert into ORDERS (customer_id, product_name, amount)
    values (4, 'cheese', 790);

insert into ORDERS (customer_id, product_name, amount)
    values (2, 'wine', 845);

insert into ORDERS (date, customer_id, product_name, amount)
    values ('2022-02-06 12:02:11', 5, 'coffee', 340);

insert into ORDERS (customer_id, product_name, amount)
    values (3, 'milk', 95);

insert into ORDERS (date, customer_id, product_name, amount)
    values ('2022-02-06 12:00:58', 1, 'butter', 240);

insert into ORDERS (product_name, amount)
    values ('milk', 95);