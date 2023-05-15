create database if not exists books;
use books;
-- 创建银行账户表
drop table if exists book;
create table book (
        -- 图书编号
        bid int primary key auto_increment,
        -- 图书名字
        name varchar(64) not null default '未知',
        -- 图书分类
        classify varchar(32) not null default '未分类',
        -- 图书描述
        description varchar(256) default '该书的作者太懒了，什么都没写'
);

insert into book values (null, 'Java核心技术', '计算机程序设计', 'Java入门到入土的书籍');
