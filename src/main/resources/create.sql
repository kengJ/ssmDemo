--性别表
create table sex(
SexId int primary key,
SexType varchar(10) not null
);

--管理员表
create table admin(
AdminId int primary key,
AdminName varchar(16) not null,
AdminPassword varchar(12) not null,
notes varchar(50)
);

--用户表
create table user(
UserId int primary key,
UserName varchar(16) not null,
UserPassword varchar(12) not null,
UserEmail varchar(100) not null,
UserNickName varchar(16),
SexId int not null,
UserAddress varchar(200),
UserPhone varchar(24),
UserRemark varchar(200),
CONSTRAINT fk_user_sex FOREIGN key (SexId) REFERENCES  sex(SexId)
);

--区域表
create table Region(
RegionId int primary key,
RegionName varchar(20) not null,
State int not null,
CreateTime datetime not null,
EditTime datetime not null
);

--权限表
create table role(
RoleId int primary key,
RoleName varchar(20) not null
);

--区域权限表
create table RegionRole(
RegionId int not null,
RoleId int not null
);


