create database vast_inbk;
use vast_inbk;

-- 用户表
drop table if exists base_users;
create table base_users(
    id int primary key auto_increment comment 'ID',
    username varchar(50) not null comment '用户名',
    pwd varchar(64) not null comment '密码',
    status int not null default 1 comment '账号状态 0：不可用，1：可用，默认为1',
    city varchar(20) comment '城市',
    wealth decimal(12,2) comment '财富',
    sex int comment '性别',
    locked int comment '锁定',
    birthday date comment '生日',
    phone varchar(20) comment '手机',
    email varchar(30) comment '邮箱',
    remark varchar(200) comment '备注'
);
insert into base_users(username,pwd,status,city,wealth,sex,locked,phone,email,birthday,remark)
value('admin','123456',1,3021,1200932223.32,1,0,'15259250835','hzwyingyan@126.com','2020-11-23','测试账号');

-- 角色表
drop table if exists base_role;
create table base_role(
    id int primary key auto_increment comment 'ID',
    role_code varchar(20) not null comment '角色编码',
    role_name varchar(20) not null comment '角色名称',
    status int not null default 1 comment '状态，1：启用，其他禁用',
    sort_no int not null comment '序号',
    remark varchar(100) comment '备注'
);

insert into base_users(role_code,role_name,status,sort_no,remark) value ('10001','超级管理员',1,1,'测试用的');

-- 菜单表
drop table if exists base_menus;
create table base_menus(
    id int primary key auto_increment comment 'ID',
    menu_code varchar(20) not null comment '菜单编号',
    menu_name varchar(50) not null comment '菜单名称',
    parent_code varchar(20) not null comment '上级菜单',
    sort_no int not null comment '序号',
    remark varchar(100) comment '备注'
);

-- 用户角色表
drop table if exists base_user_role;
create table base_user_role(
    user_id int not null comment '用户ID',
    role_code varchar(20) not null comment '角色编号'
);

-- 角色菜单表
drop table if exists base_menu_role;
create table base_menu_role(
    menu_code varchar(20) not null comment '菜单编号',
    role_code varchar(20) not null comment '角色编号'
);
