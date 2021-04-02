/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80020
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 80020
 File Encoding         : 65001

 Date: 02/04/2021 13:10:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `id` bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `nick_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '外号昵称',
  `sex` char(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别【0:未知 1:男 2:女】',
  `age` tinyint(0) NULL DEFAULT NULL COMMENT '年龄',
  `money_reward` decimal(12, 2) NULL DEFAULT NULL COMMENT '悬赏金',
  `birthday` date NULL DEFAULT NULL COMMENT '生日【yyyy-mm-dd】',
  `phone_num` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系方式',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭住址',
  `group_id` bigint(0) NULL DEFAULT NULL COMMENT '所属团队id',
  `is_delete` char(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否删除【1:删除 0:未删除】',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '人员信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES (1, '蒙奇·D·路飞', '草帽小子', '1', 21, 1500000000.00, '1999-04-24', '17311110001', '东海-哥亚王国-风车村', 1, '0', '2021-04-01 11:16:52', '2021-04-01 11:16:57');
INSERT INTO `user_info` VALUES (2, '罗罗诺亚·索隆', '海贼猎人', '1', 23, 320000000.00, '1997-12-21', '17311110002', '和之国', 1, '0', '2021-04-01 11:21:29', '2021-04-01 11:21:31');
INSERT INTO `user_info` VALUES (3, '娜美', '小贼猫', '2', 21, 66000000.00, '1999-10-21', '17311110003', '欧伊科特王国→东海·可可亚西村', 1, '0', '2021-04-01 11:23:59', '2021-04-01 11:24:02');
INSERT INTO `user_info` VALUES (4, '乌索普', '狙击王', '1', 22, 200000000.00, '1998-05-12', '17311110004', '东海-西罗布村', 1, '0', '2021-04-01 11:24:49', '2021-04-01 11:24:51');
INSERT INTO `user_info` VALUES (5, '文斯莫克·山治', '黑足山治', '1', 23, 330000000.00, '1997-02-28', '17311110005', '北海杰尔玛王国', 1, '0', '2021-04-01 11:27:17', '2021-04-01 11:27:19');
INSERT INTO `user_info` VALUES (6, '托尼托尼·乔巴', '爱吃棉花糖的驯鹿', '0', 20, 100.00, '2000-01-01', '17311110006', '磁鼓王国', 1, '0', '2021-04-01 11:28:46', '2021-04-01 11:28:48');
INSERT INTO `user_info` VALUES (7, '妮可·罗宾', '恶魔之子', '2', 30, 80000000.00, '1990-03-12', '17311110007', '西海的考古学之岛“奥哈拉”', 1, '0', '2021-04-01 11:30:36', '2021-04-01 11:30:38');
INSERT INTO `user_info` VALUES (8, '弗兰奇', '改造人', '1', 35, 94000000.00, '1985-06-01', '17311110008', '水之都', 1, '0', '2021-04-01 11:31:41', '2021-04-01 11:31:44');
INSERT INTO `user_info` VALUES (9, '布鲁克', '灵魂之王', '1', 100, 83000000.00, '1900-02-27', '17311110009', '西海', 1, '0', '2021-04-01 12:13:20', '2021-04-01 12:13:23');
INSERT INTO `user_info` VALUES (10, '甚平', '海侠', '1', 45, 438000000.00, '1975-07-27', '17311110010', '鱼人岛', 1, '0', '2021-04-01 12:15:49', '2021-04-01 12:15:51');

SET FOREIGN_KEY_CHECKS = 1;
