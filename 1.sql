create table netology.PERSONS(
    name varchar not null ,
    surname varchar not null ,
    age int check ( age>0 ) default 1,
    phone_number int,
    city_of_living varchar default 'Novosibirsk',
    PRIMARY KEY (name,surname, age)
)