/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 5.5.27 : Database - stus
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`stus` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;

USE `stus`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `balance` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `account` */

/*Table structure for table `boktype` */

DROP TABLE IF EXISTS `boktype`;

CREATE TABLE `boktype` (
  `id` int(11) NOT NULL,
  `name` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `boktype` */

insert  into `boktype`(`id`,`name`) values 
(1,'Person');

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `bin` int(11) NOT NULL,
  `banme` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `price` float DEFAULT '10',
  `btypeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`bin`),
  UNIQUE KEY `banme` (`banme`),
  KEY `fk_book_boktype` (`btypeId`),
  CONSTRAINT `fk_book_boktype` FOREIGN KEY (`btypeId`) REFERENCES `boktype` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `book` */

insert  into `book`(`bin`,`banme`,`price`,`btypeId`) values 
(1,'NiceToMeetYou',20,1),
(2,'You',270,1),
(3,'Nice',240,1),
(4,'ToMeet',210,1),
(5,'To',200,1),
(6,'Y',170,1),
(7,'e',140,1),
(8,'eet',110,1),
(9,'T',100,1);

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `id` int(11) NOT NULL,
  `dname` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `department` */

insert  into `department`(`id`,`dname`) values 
(101,'教学部'),
(102,'市场部'),
(103,'教研部'),
(104,'运营部'),
(105,'后勤部');

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ename` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `did` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `employee` */

insert  into `employee`(`id`,`ename`,`email`,`gender`,`birthday`,`did`) values 
(1,'AA','1234567@qq.com',1,'2022-08-09 08:27:19',101),
(2,'BB','1234567@163.com',0,'2022-08-09 08:27:19',102),
(3,'CC','4234335@qq.com',1,'2022-08-09 08:27:19',103),
(4,'DD','4343343@qq.com',0,'2022-08-09 08:27:19',104),
(5,'EE','6768554@qq.com',1,'2022-08-09 08:27:19',105);

/*Table structure for table `major` */

DROP TABLE IF EXISTS `major`;

CREATE TABLE `major` (
  `id` int(11) DEFAULT NULL,
  `majorName` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `major` */

/*Table structure for table `myclass` */

DROP TABLE IF EXISTS `myclass`;

CREATE TABLE `myclass` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stuname` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `seat` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `stuname` (`stuname`),
  UNIQUE KEY `seat` (`seat`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `myclass` */

insert  into `myclass`(`id`,`stuname`,`seat`) values 
(3,'三号',3);

/*Table structure for table `tab_identity` */

DROP TABLE IF EXISTS `tab_identity`;

CREATE TABLE `tab_identity` (
  `id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `tab_identity` */

/*Table structure for table `zh_resource` */

DROP TABLE IF EXISTS `zh_resource`;

CREATE TABLE `zh_resource` (
  `TYPE_` int(10) DEFAULT NULL,
  `ID_` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `NAME_` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `MENU_PATH_` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `SERVICE_PATH_` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `DATA_PATH_` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `DATA_TYPE_` int(10) DEFAULT NULL,
  `TABLE_` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `COLUMN_` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `PROTO_` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `IP_` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `PORT_` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `APP_PRO_` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `AUTH_` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `EDIT_TIME_` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `zh_resource` */

insert  into `zh_resource`(`TYPE_`,`ID_`,`NAME_`,`MENU_PATH_`,`SERVICE_PATH_`,`DATA_PATH_`,`DATA_TYPE_`,`TABLE_`,`COLUMN_`,`PROTO_`,`IP_`,`PORT_`,`APP_PRO_`,`AUTH_`,`EDIT_TIME_`) values 
(1,'1','张三','1','1','1',1,'1','1',NULL,'192.168.2.2',NULL,NULL,NULL,NULL),
(2,'2','王二','22','ee','ee',2,'r',NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(1,'3','NEW李四',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(5,'2','周五',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(5,'2','周五',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(12,'112',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0101',NULL);

/*Table structure for table `zh_user_resource` */

DROP TABLE IF EXISTS `zh_user_resource`;

CREATE TABLE `zh_user_resource` (
  `USER_ID_` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户主键ID',
  `RESOURCE_ID_` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '应用资源ID',
  `ROLE_TYPE_` int(10) DEFAULT NULL COMMENT '授权类型，1：直接授权，2：基于角色的授权，3：基于属性授权；'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

/*Data for the table `zh_user_resource` */

insert  into `zh_user_resource`(`USER_ID_`,`RESOURCE_ID_`,`ROLE_TYPE_`) values 
('1','1',11),
('2','2',22),
('3','33',33),
('4','44',4),
('4','2',3),
('55','09',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
