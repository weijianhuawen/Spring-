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

insert into account values (null, '小明', 1000);
insert into account values (null, '小花', 2000);
insert into account values (null, '小卷', 2000);

-- 创建日志表
drop table if exists account_log;
create table account_log (
    -- 日志id
    lid int primary key auto_increment,
    -- 日志内容
    content varchar(128),
    -- 状态
    state varchar(16)
);

insert into account_log values(null, '测试', '成功');