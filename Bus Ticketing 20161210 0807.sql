-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema kamal
--

CREATE DATABASE IF NOT EXISTS kamal;
USE kamal;

--
-- Definition of table `bus_ticketing`
--

DROP TABLE IF EXISTS `bus_ticketing`;
CREATE TABLE `bus_ticketing` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `date` varchar(45) NOT NULL,
  `start_date` varchar(45) NOT NULL,
  `passenger_name` varchar(45) NOT NULL,
  `age` varchar(45) NOT NULL,
  `sex` varchar(45) NOT NULL,
  `phone_number` varchar(45) NOT NULL,
  `destination` varchar(45) NOT NULL,
  `bus_number` varchar(45) NOT NULL,
  `bus_name` varchar(45) NOT NULL,
  `bus_type` varchar(45) NOT NULL,
  `ticket_type` varchar(45) NOT NULL,
  `total_amount` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus_ticketing`
--

/*!40000 ALTER TABLE `bus_ticketing` DISABLE KEYS */;
/*!40000 ALTER TABLE `bus_ticketing` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
