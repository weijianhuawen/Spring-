create database if not exists mybatis_case;
use mybatis_case;
drop table if exists user;
create table user (
    -- 编号
    id int primary key auto_increment,
    -- 姓名
    name varchar(32) not null default '这是一个懒汉，名字都没有设置',
    -- 年龄
    age int default 0,
    -- 邮箱
    email varchar(64) default '邮箱不存在'
);

insert into user (name, age, email) values('张三', 28, "zhangsan@163.com");
insert into user (name, age, email) values('李四', 18, "lisi@163.com");
insert into user (name, age, email) values('wangwu', 12, "wangwu@163.com");

create database if not exists mybatis_case;
use mybatis_case;
drop table if exists user2;
create table user2 (
    -- 编号
                      uid int primary key auto_increment,
    -- 姓名
                      name varchar(32) not null default '这是一个懒汉，名字都没有设置',
    -- 年龄
                      age int default 0,
    -- 邮箱
                      email varchar(64) default '邮箱不存在'
);

insert into user2 (name, age, email) values('张三', 28, "zhangsan@163.com");
insert into user2 (name, age, email) values('李四', 18, "lisi@163.com");
insert into user2 (name, age, email) values('wangwu', 12, "wangwu@163.com");