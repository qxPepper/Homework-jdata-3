create table CUSTOMERS
(
    id           serial primary key not null,
    name         varchar(20)        not null,
    surname      varchar(40)        not null,
    age          int check (age >= 0),
    phone_number varchar(16)
);

create table ORDERS
(
    id           serial primary key      not null,
    date         timestamp default now() not null,
    customer_id  int,
    product_name varchar(40),
    amount       int
);
