create table netology.CUSTOMERS(
    id int primary key,
    name varchar not null ,
    surname varchar not null ,
    age int check ( age>0 ) default 1,
    phone_number varchar
);

create index index_id
on netology.CUSTOMERS(id);