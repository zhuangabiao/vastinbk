create database vast_inbk;
use vast_inbk;

-- 用户表
drop table if exists base_users;
create table base_users(
    id int primary key auto_increment comment 'ID',
    user_code varchar(32) not null comment '用户编号',
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

-- Blog目录表
drop table if exists blog_directory;
create table blog_directory(
    directory_code varchar(32) primary key comment '目录编号',
    directory_name varchar(100) comment '目录名称',
    parent_code varchar(32) comment '上级目录，如果是第一级目录则为0',
    directory_type int comment '目录类型',
    user_code varchar(32) comment '用户ID',
    state int comment '状态'
);

INSERT INTO `blog_directory` VALUES ('10001', 'java', '0', NULL, '1001', 1);
INSERT INTO `blog_directory` VALUES ('10002', 'java基础', '10001', NULL, '1001', 1);
INSERT INTO `blog_directory` VALUES ('10003', 'spring', '10001', NULL, '1001', 1);
INSERT INTO `blog_directory` VALUES ('10004', 'spring cloud', '10001', NULL, '1001', 1);
INSERT INTO `blog_directory` VALUES ('10005', 'mybatis', '0', NULL, '1001', 1);
INSERT INTO `blog_directory` VALUES ('10006', 'vue', '0', NULL, '1001', 1);
INSERT INTO `blog_directory` VALUES ('10007', 'linux', '0', NULL, '1001', 1);
INSERT INTO `blog_directory` VALUES ('10008', 'mysql', '0', NULL, '1001', 1);

-- Blog目录内容表
drop table if exists blog_directory_content;
create table blog_directory_content(
    id varchar(32) primary key ,
    content_code varchar(32) comment '内容编号',
    directory_code varchar(32) comment '目录编码',
    blog_title varchar(200) comment '标题',
    mark_content MEDIUMTEXT comment 'mark格式文本内容',
    html_content MEDIUMTEXT comment 'html格式的内容',
    create_date date comment '创建时间',
    update_date date comment '修改时间',
    create_user varchar(32) comment '创建人'
);



