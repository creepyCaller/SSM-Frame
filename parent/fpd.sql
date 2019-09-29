-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `U_Id` int(11) NOT NULL AUTO_INCREMENT,
  `U_Name` varchar(255) DEFAULT NULL,
  `U_PassWord` varchar(255) DEFAULT NULL,
  `U_Email` varchar(30) DEFAULT NULL,
  `R_Id` int(11) NOT NULL,
  PRIMARY KEY (`U_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('0', 'admin', 'admin', 'sample@address.com', '0');
