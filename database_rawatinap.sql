-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.11-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for rawat_inap
CREATE DATABASE IF NOT EXISTS `rawat_inap` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `rawat_inap`;

-- Dumping structure for table rawat_inap.t_admin
CREATE TABLE IF NOT EXISTS `t_admin` (
  `id_admin` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) NOT NULL DEFAULT '',
  `Password` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table rawat_inap.t_admin: ~0 rows (approximately)
/*!40000 ALTER TABLE `t_admin` DISABLE KEYS */;
INSERT INTO `t_admin` (`id_admin`, `Username`, `Password`) VALUES
	(1, 'admin', 'admin');
/*!40000 ALTER TABLE `t_admin` ENABLE KEYS */;

-- Dumping structure for table rawat_inap.t_rawat_inap
CREATE TABLE IF NOT EXISTS `t_rawat_inap` (
  `NoRM` int(10) NOT NULL AUTO_INCREMENT,
  `Ruangan` varchar(7) DEFAULT NULL,
  `NamaPasien` varchar(50) DEFAULT NULL,
  `JenisKelamin` varchar(6) DEFAULT NULL,
  `Alamat` varchar(50) DEFAULT NULL,
  `Telepon` varchar(12) DEFAULT NULL,
  `Umur` varchar(2) DEFAULT NULL,
  `Pekerjaan` varchar(50) DEFAULT NULL,
  `TanggalMasuk` varchar(50) DEFAULT NULL,
  `TanggalKeluar` varchar(50) DEFAULT NULL,
  `Keterangan` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`NoRM`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table rawat_inap.t_rawat_inap: ~1 rows (approximately)
/*!40000 ALTER TABLE `t_rawat_inap` DISABLE KEYS */;
INSERT INTO `t_rawat_inap` (`NoRM`, `Ruangan`, `NamaPasien`, `JenisKelamin`, `Alamat`, `Telepon`, `Umur`, `Pekerjaan`, `TanggalMasuk`, `TanggalKeluar`, `Keterangan`) VALUES
	(2, 'Melati', 'asd', 'Pria', 'asd', '123', '21', 'asd', 'asd', 'asd', 'asd'),
	(3, 'Melati', 'Kevin', 'Pria', 'Jl. asdas', '2131231', '21', 'sadas', 'asda', 'asda', 'asda');
/*!40000 ALTER TABLE `t_rawat_inap` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
