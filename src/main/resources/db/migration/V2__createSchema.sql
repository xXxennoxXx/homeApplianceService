create table client (
  id bigint not null,
   first_name varchar(255),
   last_name varchar(255),
   phone varchar(255),
   email varchar(255),
   address varchar(1000),
   constraint pk_client primary key (id)
);
create table part_order (
  id bigint not null,
   part_order_status varchar(255),
   constraint pk_partorder primary key (id)
);
create table repair (
  id bigint not null,
   constraint pk_repair primary key (id)
);

create table orders(
 id bigint not null,
 part_order_status varchar(255),
 received_date datetime2,
 dtype varchar(255)
 );

create sequence order_seq start with  1 increment by 1;