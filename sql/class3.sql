/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50148
Source Host           : localhost:3306
Source Database       : class3

Target Server Type    : MYSQL
Target Server Version : 50148
File Encoding         : 65001

Date: 2017-03-25 09:49:00
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `sex` char(255) DEFAULT NULL,
  `salary` decimal(9,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO user VALUES ('1', 'admin', '123', '1', '1000.00');
INSERT INTO user VALUES ('2', 'user1', '123', '1', '2000.00');
INSERT INTO user VALUES ('3', 'user2', '123', '0', '200.00');
INSERT INTO user VALUES ('4', 'user3', '123', '0', '500.00');
