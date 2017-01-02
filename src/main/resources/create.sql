create table sex(
SexId int auto_increment primary key,
SexType varchar(10) not null
);

create table user(
UserId int auto_increment primary key,
UserName varchar(16) not null,
UserPassword varchar(12) not null,
UserEmail varchar(100) not null,
UserNickName varchar(16),
SexId int not null,
UserAddress varchar(200),
UserPhone varchar(24),
UserRemark varchar(200),
CONSTRAINT fk_user_sex FOREIGN key (SexId) REFERENCES key sex(SexId)
);

create table admin(
AdminId int auto_increment primary key,
AdminName varchar(16) not null,
AdminPassword varchar(12) not null
);
