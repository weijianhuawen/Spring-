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

-- 逻辑删除
-- 新建一个字段deleted表示是否删除，1表示该条数据为删除状态，0表示未删除状态
create database if not exists mybatis_case;
use mybatis_case;
drop table if exists del_user;
create table del_user (
    -- 编号
        id bigint(18) primary key auto_increment,
    -- 姓名
        name varchar(32) not null default '这是一个懒汉，名字都没有设置',
    -- 年龄
        age int default 0,
    -- 密码
        password varchar(32) not null,
    -- 邮箱
        email varchar(64) default '邮箱不存在',
    -- 是否已经删除
        deleted int default 0
);

insert into del_user (name, age, password, email) values('张三', 28, '123456', 'zhangsan@163.com');
insert into del_user (name, age, password, email) values('李四', 18, '里斯', 'lisi@163.com');
insert into del_user (name, age, password, email) values('wangwu', 12, 'wangwu666', 'wangwu@163.com');
insert into del_user (name, age, password, email) values('老刘', 48, 'too666', 'laoliu@163.com');
insert into del_user (name, age, password, email) values('小七', 5, 'xiaoqiiscute', 'qiqi@163.com');

-- 乐观锁
-- 使用版本的方式来实现乐观锁
create database if not exists mybatis_case;
use mybatis_case;
drop table if exists opt_user;
create table opt_user (
    -- 编号
        id bigint(18) primary key auto_increment,
    -- 姓名
        name varchar(32) not null default '这是一个懒汉，名字都没有设置',
    -- 年龄
        age int default 0,
    -- 密码
        password varchar(32) not null,
    -- 邮箱
        email varchar(64) default '邮箱不存在',
    -- 是否已经删除
        deleted int default 0,
    -- 当前版本
        version int default 1
);

insert into opt_user (name, age, password, email) values('张三', 28, '123456', 'zhangsan@163.com');
insert into opt_user (name, age, password, email) values('李四', 18, '里斯', 'lisi@163.com');
insert into opt_user (name, age, password, email) values('wangwu', 12, 'wangwu666', 'wangwu@163.com');
insert into opt_user (name, age, password, email) values('老刘', 48, 'too666', 'laoliu@163.com');
insert into opt_user (name, age, password, email) values('小七', 5, 'xiaoqiiscute', 'qiqi@163.com');