create database if not exists transfer;
use transfer;
-- 创建账户表
drop table if exists account;
create table account (
    -- 用户编号uid
                         uid int primary key auto_increment,
    -- 姓名
                         username varchar(32),
    -- 余额
                         money double(8, 2) not null default 0
    );

insert into account values (null, '小明', 1222.56);
insert into account values (null, '小花',  12466.56);
insert into account values (null, '小卷', 31222.56);