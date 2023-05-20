create database if not exists mybatis_case;
use mybatis_case;
drop table if exists tab_user;
create table tab_user (
    -- 编号
    id bigint(18) primary key auto_increment,
    -- 姓名
    name varchar(32) not null default '这是一个懒汉，名字都没有设置',
    -- 年龄
    age int default 0,
    -- 密码
    password varchar(32) not null,
    -- 邮箱
    email varchar(64) default '邮箱不存在'
);

insert into tab_user (name, age, password, email) values('张三', 28, '123456', 'zhangsan@163.com');
insert into tab_user (name, age, password, email) values('李四', 18, '里斯', 'lisi@163.com');
insert into tab_user (name, age, password, email) values('wangwu', 12, 'wangwu666', 'wangwu@163.com');
insert into tab_user (name, age, password, email) values('老刘', 48, 'too666', 'laoliu@163.com');
insert into tab_user (name, age, password, email) values('小七', 5, 'xiaoqiiscute', 'qiqi@163.com');
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