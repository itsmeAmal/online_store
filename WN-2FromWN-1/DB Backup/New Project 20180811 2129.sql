-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.6.25-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema ifixlaptops
--

CREATE DATABASE IF NOT EXISTS ifixlaptops;
USE ifixlaptops;

--
-- Temporary table structure for view `account_status`
--
DROP TABLE IF EXISTS `account_status`;
DROP VIEW IF EXISTS `account_status`;
CREATE TABLE `account_status` (
  `Date` date,
  `account_status_invoice` varchar(450),
  `account_status_qty` int(11),
  `account_status_unit_price` decimal(10,2),
  `account_status_out` varchar(22),
  `account_status_in` varchar(22)
);

--
-- Temporary table structure for view `user_count`
--
DROP TABLE IF EXISTS `user_count`;
DROP VIEW IF EXISTS `user_count`;
CREATE TABLE `user_count` (
  `user_count` bigint(21)
);

--
-- Definition of table `cart_references`
--

DROP TABLE IF EXISTS `cart_references`;
CREATE TABLE `cart_references` (
  `cart_references_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cart_references_item_id` int(10) unsigned DEFAULT NULL,
  `cart_references_qty` int(10) unsigned DEFAULT '1',
  `cart_references_status` int(10) unsigned DEFAULT '0',
  `cart_references_user_id` int(10) unsigned DEFAULT NULL,
  `cart_references_item_price` decimal(10,2) DEFAULT '0.00',
  `cart_references_delivery_status` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`cart_references_id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `cart_references`
--

/*!40000 ALTER TABLE `cart_references` DISABLE KEYS */;
INSERT INTO `cart_references` (`cart_references_id`,`cart_references_item_id`,`cart_references_qty`,`cart_references_status`,`cart_references_user_id`,`cart_references_item_price`,`cart_references_delivery_status`) VALUES 
 (27,14,1,0,29,'0.00',NULL);
/*!40000 ALTER TABLE `cart_references` ENABLE KEYS */;


--
-- Definition of table `imageupload`
--

DROP TABLE IF EXISTS `imageupload`;
CREATE TABLE `imageupload` (
  `imageUpload_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `imageUpload_path` varchar(450) DEFAULT NULL,
  `imageUpload_file_name` varchar(450) DEFAULT NULL,
  `imageupload_item_desc` varchar(450) DEFAULT NULL,
  `imageupload_price` decimal(10,2) DEFAULT NULL,
  `imageupload_model` varchar(450) DEFAULT NULL,
  `imageupload_processor` varchar(450) DEFAULT NULL,
  `imageupload_os` varchar(450) DEFAULT NULL,
  `imageupload_graphics` varchar(450) DEFAULT NULL,
  `imageupload_webcam` varchar(450) DEFAULT NULL,
  `imageupload_memory` varchar(450) DEFAULT NULL,
  `imageupload_storage` varchar(450) DEFAULT NULL,
  `imageupload_display` varchar(450) DEFAULT NULL,
  PRIMARY KEY (`imageUpload_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `imageupload`
--

/*!40000 ALTER TABLE `imageupload` DISABLE KEYS */;
INSERT INTO `imageupload` (`imageUpload_id`,`imageUpload_path`,`imageUpload_file_name`,`imageupload_item_desc`,`imageupload_price`,`imageupload_model`,`imageupload_processor`,`imageupload_os`,`imageupload_graphics`,`imageupload_webcam`,`imageupload_memory`,`imageupload_storage`,`imageupload_display`) VALUES 
 (18,'E:\\personel_git\\WN-2FromWN-1\\web\\uploadedImages\\6.jpg','6.jpg','APPLE','44999.00','test model','CELERON','WINDOWS 7','INTEL HD ','','2 GB','500 GB','11.6\''),
 (19,'E:\\personel_git\\WN-2FromWN-1\\web\\uploadedImages\\17 apple.jpg','17 apple.jpg','APPLE','44999.00','test model','CELERON','WINDOWS 7','INTEL HD ','','2 GB','500 GB','11.6\''),
 (20,'E:\\personel_git\\WN-2FromWN-1\\web\\uploadedImages\\13.jpg','13.jpg','DELL','84999.00','Dell 3543','CELERON','WINDOWS 7','INTEL HD ','','2 GB','500 GB','11.6\''),
 (21,'E:\\personel_git\\WN-2FromWN-1\\web\\uploadedImages\\14.jpg','14.jpg','HP','74999.00','34772','CORE i3','WINDOWS 10','INTEL HD ','','4 GB','500 GB','15.6\''),
 (22,'E:\\personel_git\\WN-2FromWN-1\\web\\uploadedImages\\3.jpg','3.jpg','APPLE','79999.00','3542','CORE i3','WINDOWS 10','INTEL HD ','','4 GB','500 GB','15.6\''),
 (23,'E:\\personel_git\\WN-2FromWN-1\\web\\uploadedImages\\14.jpg','14.jpg','HP','69999.00','9964-1','CORE i3','UBUNTU','INTEL HD ','','4 GB','1 TB','15.6\''),
 (24,'E:\\personel_git\\WN-2FromWN-1\\web\\uploadedImages\\8.jpg','8.jpg','APPLE','84999.00','test model','CELERON','WINDOWS 7','INTEL HD ','','2 GB','500 GB','11.6\''),
 (25,'E:\\personel_git\\WN-2FromWN-1\\web\\uploadedImages\\6.jpg','6.jpg','APPLE','49999.00','3654356','CELERON','WINDOWS 7','INTEL HD ','','2 GB','500 GB','11.6\'');
/*!40000 ALTER TABLE `imageupload` ENABLE KEYS */;


--
-- Definition of table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
CREATE TABLE `invoice` (
  `invoice_id` int(10) NOT NULL,
  `invoice_date` date DEFAULT NULL,
  `invoice_time` varchar(45) DEFAULT NULL,
  `invoice_user_id` int(10) DEFAULT NULL,
  `invoice_status` tinyint(1) DEFAULT NULL,
  `invoice_delever_status` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`invoice_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `invoice`
--

/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;


--
-- Definition of table `laptop_model`
--

DROP TABLE IF EXISTS `laptop_model`;
CREATE TABLE `laptop_model` (
  `laptop_model_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `laptop_model_laptop_id` varchar(450) DEFAULT NULL,
  `laptop_model_hard_disk` varchar(450) DEFAULT NULL,
  `laptop_model_ram` varchar(450) DEFAULT NULL,
  `laptop_model_vga` varchar(450) DEFAULT NULL,
  `laptop_model_processor` varchar(450) DEFAULT NULL,
  `laptop_model_usb_type_1` varchar(450) DEFAULT NULL,
  `laptop_model_usb_type_2` varchar(450) DEFAULT NULL,
  `laptop_model_hdmi` varchar(450) DEFAULT NULL,
  `laptop_model_vga_output` varchar(450) DEFAULT NULL,
  `laptop_model_screen_size` varchar(450) DEFAULT NULL,
  `laptop_model_cache_memory` int(10) DEFAULT NULL,
  `laptop_model_status` int(10) DEFAULT '1',
  `laptop_model_image_path` varchar(450) DEFAULT NULL,
  PRIMARY KEY (`laptop_model_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `laptop_model`
--

/*!40000 ALTER TABLE `laptop_model` DISABLE KEYS */;
/*!40000 ALTER TABLE `laptop_model` ENABLE KEYS */;


--
-- Definition of table `laptop_price_detail`
--

DROP TABLE IF EXISTS `laptop_price_detail`;
CREATE TABLE `laptop_price_detail` (
  `laptop_price_detail_id` int(10) DEFAULT NULL,
  `laptop_price_detail_model_id` varchar(450) NOT NULL,
  `laptop_price_detail_buying_price` decimal(10,2) DEFAULT NULL,
  `laptop_price_detail_selling_price` decimal(10,2) DEFAULT NULL,
  `laptop_price_detail_min_selling_price` decimal(10,2) DEFAULT NULL,
  `laptop_price_detail_status` tinyint(1) DEFAULT NULL,
  `laptop_price_detail_qty` int(10) DEFAULT '0',
  `laptop_price_detail_date` date DEFAULT NULL,
  PRIMARY KEY (`laptop_price_detail_model_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `laptop_price_detail`
--

/*!40000 ALTER TABLE `laptop_price_detail` DISABLE KEYS */;
INSERT INTO `laptop_price_detail` (`laptop_price_detail_id`,`laptop_price_detail_model_id`,`laptop_price_detail_buying_price`,`laptop_price_detail_selling_price`,`laptop_price_detail_min_selling_price`,`laptop_price_detail_status`,`laptop_price_detail_qty`,`laptop_price_detail_date`) VALUES 
 (NULL,'1','99990.00','104999.00','101999.00',1,10,'2017-11-24'),
 (NULL,'2','2344.00','234.00','2323.00',2,11,NULL);
/*!40000 ALTER TABLE `laptop_price_detail` ENABLE KEYS */;


--
-- Definition of table `payment_history`
--

DROP TABLE IF EXISTS `payment_history`;
CREATE TABLE `payment_history` (
  `payment_history_id` int(10) NOT NULL,
  `payment_history_amount` decimal(10,2) DEFAULT NULL,
  `payment_history_card_type` varchar(45) DEFAULT NULL,
  `payment_history_card-no` varchar(45) DEFAULT NULL,
  `payment_history_invoice_id` int(10) DEFAULT NULL,
  `payment_history_status` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`payment_history_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment_history`
--

/*!40000 ALTER TABLE `payment_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment_history` ENABLE KEYS */;


--
-- Definition of table `payment_history_detail`
--

DROP TABLE IF EXISTS `payment_history_detail`;
CREATE TABLE `payment_history_detail` (
  `payment_history_detail_id` int(10) NOT NULL,
  `payment_history_detail_payment_id` int(10) DEFAULT NULL,
  `payment_history_detail_laptop_model_id` varchar(450) DEFAULT NULL,
  `payment_history_detail_qty` int(10) DEFAULT NULL,
  `payment_history_detail_sold_price` decimal(10,2) DEFAULT NULL,
  `payment_history_detail_status` tinyint(1) DEFAULT NULL,
  `payment_history_detail_date` date DEFAULT NULL,
  PRIMARY KEY (`payment_history_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment_history_detail`
--

/*!40000 ALTER TABLE `payment_history_detail` DISABLE KEYS */;
INSERT INTO `payment_history_detail` (`payment_history_detail_id`,`payment_history_detail_payment_id`,`payment_history_detail_laptop_model_id`,`payment_history_detail_qty`,`payment_history_detail_sold_price`,`payment_history_detail_status`,`payment_history_detail_date`) VALUES 
 (1,1,'Acer E5-531',2,'50000.00',1,'2017-09-07');
/*!40000 ALTER TABLE `payment_history_detail` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(450) DEFAULT NULL,
  `user_address` varchar(450) DEFAULT NULL,
  `user_contact` varchar(45) DEFAULT NULL,
  `user_email` varchar(450) DEFAULT NULL,
  `user_password` varchar(450) DEFAULT NULL,
  `user_status` tinyint(1) DEFAULT '1',
  `user_img_path` varchar(450) DEFAULT '""',
  `user_img_name` varchar(450) DEFAULT '""',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`user_id`,`user_name`,`user_address`,`user_contact`,`user_email`,`user_password`,`user_status`,`user_img_path`,`user_img_name`) VALUES 
 (29,'amal','address 010101','0117100100','234amal@gmail.com','123456',2,NULL,NULL),
 (30,'amal','address 010101','0117100100','235amal@gmail.co5','123456',1,NULL,NULL),
 (31,'amal','address 010101','0117100100','eee@gmail.com','333',1,NULL,NULL),
 (32,'amal','address 010101','0117100100','232amal@gmail.com','123456',1,NULL,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


--
-- Definition of table `user_logging_history`
--

DROP TABLE IF EXISTS `user_logging_history`;
CREATE TABLE `user_logging_history` (
  `logging_history_id` int(11) NOT NULL AUTO_INCREMENT,
  `logging_history_user_id` varchar(45) DEFAULT NULL,
  `logging_history_time` varchar(45) DEFAULT NULL,
  `logging_history_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`logging_history_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_logging_history`
--

/*!40000 ALTER TABLE `user_logging_history` DISABLE KEYS */;
INSERT INTO `user_logging_history` (`logging_history_id`,`logging_history_user_id`,`logging_history_time`,`logging_history_date`) VALUES 
 (2,'0','20:17:44','2017-08-01'),
 (3,'3','20:35:44','2017-08-01'),
 (4,'2','07:05:59','2017-08-02'),
 (5,'2','07:11:28','2017-08-02');
/*!40000 ALTER TABLE `user_logging_history` ENABLE KEYS */;


--
-- Definition of view `account_status`
--

DROP TABLE IF EXISTS `account_status`;
DROP VIEW IF EXISTS `account_status`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `account_status` AS select `laptop_price_detail`.`laptop_price_detail_date` AS `Date`,`laptop_price_detail`.`laptop_price_detail_model_id` AS `account_status_invoice`,`laptop_price_detail`.`laptop_price_detail_qty` AS `account_status_qty`,`laptop_price_detail`.`laptop_price_detail_selling_price` AS `account_status_unit_price`,(`laptop_price_detail`.`laptop_price_detail_selling_price` * `laptop_price_detail`.`laptop_price_detail_qty`) AS `account_status_out`,'0' AS `account_status_in` from `laptop_price_detail` union select `payment_history_detail`.`payment_history_detail_date` AS `Date`,`payment_history_detail`.`payment_history_detail_laptop_model_id` AS `account_status_invoice`,`payment_history_detail`.`payment_history_detail_qty` AS `account_status_qty`,`payment_history_detail`.`payment_history_detail_sold_price` AS `account_status_unit_price`,'0' AS `account_status_out`,(`payment_history_detail`.`payment_history_detail_sold_price` * `payment_history_detail`.`payment_history_detail_qty`) AS `account_status_in` from `payment_history_detail`;

--
-- Definition of view `user_count`
--

DROP TABLE IF EXISTS `user_count`;
DROP VIEW IF EXISTS `user_count`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `user_count` AS select count(`user`.`user_id`) AS `user_count` from `user`;



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
