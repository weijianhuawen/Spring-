create database if not exists accounts;
use accounts;
-- 创建银行账户表
drop table if exists account;
create table account (
    -- 用户编号uid
                         uid int primary key auto_increment,
    -- 身份证号
                         id varchar(32) unique,
    -- 姓名
                         username varchar(32),
    -- 年龄
                         age int,
    -- 性别
                         sex varchar(4),
    -- 住址
                         address varchar(256),
    -- 电话
                         telephone varchar(24),
    -- 余额
                         money double(8, 2) not null default 0
    );

insert into account values (null, '120321202011111222', '小明', 3, '女', '河南省郑州市', '12345678900', 1234.56);