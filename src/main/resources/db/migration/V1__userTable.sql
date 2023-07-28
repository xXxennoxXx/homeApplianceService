create table account (
  id bigint not null,
  username varchar(255)  ,
  password varchar(255),
  is_active bit,
   constraint account_ok primary key (id)
);

create table account_user_roles (
  account_id bigint not null,
   user_roles varchar(255)
);

alter table account_user_roles add constraint fk_account foreign key (account_id) references account (id);

insert into account (id, username, password, is_active) values(1,'sa','{noop}password',1);
insert into account_user_roles(account_id,user_roles) values(1, 'ADMIN');