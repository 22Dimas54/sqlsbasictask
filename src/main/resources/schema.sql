create table netology.CUSTOMERS(
    id int primary key,
    name varchar not null ,
    surname varchar not null ,
    age int check ( age>0 ) default 1,
    phone_number varchar
);

create index index_id
on netology.CUSTOMERS(id);

create table netology.ORDERS
(
    id           int primary key,
    date         date,
    customer_id  int,
    product_name varchar,
    amount       int
);

alter table netology.ORDERS add constraint customers_orders_fk
    foreign key (customer_id) references netology.customers(id);

create index index_idOrders
    on netology.ORDERS (id);