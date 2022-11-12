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