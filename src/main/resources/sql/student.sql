/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : thymeleafstudent

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 04/12/2019 09:12:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sage` int(5) NULL DEFAULT NULL,
  `score` int(50) NULL DEFAULT NULL,
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 'tom', 19, 80, '北京市海淀区');
INSERT INTO `student` VALUES (4, '李雷', 16, 78, '山西省太原市');
INSERT INTO `student` VALUES (5, '韩梅梅', 17, 89, '山西省太原市');
INSERT INTO `student` VALUES (6, '小黑最可爱', 15, 90, '蓝溪镇');
INSERT INTO `student` VALUES (7, '无限大人', 500, 100, '四海为家');
INSERT INTO `student` VALUES (8, '张大千', 57, 93, '忘了住哪里');

SET FOREIGN_KEY_CHECKS = 1;
