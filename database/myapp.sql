-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2020 at 06:29 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `myapp`
--
CREATE DATABASE IF NOT EXISTS `myapp` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `myapp`;

-- --------------------------------------------------------

--
-- Table structure for table `listproduct`
--

CREATE TABLE IF NOT EXISTS `listproduct` (
`Id` int(20) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` float NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=23 ;

--
-- Dumping data for table `listproduct`
--

INSERT INTO `listproduct` (`Id`, `name`, `quantity`, `price`) VALUES
(1, 'Bánh', 20, 5),
(2, 'Keo', 30, 10),
(3, 'Coca', 25, 18),
(4, 'Bút', 15, 3),
(5, 'Sách toán 2', 20, 20),
(14, 'Sách Tv 1', 20, 17),
(15, 'Osi', 50, 5),
(17, 'Pepsi', 0, 1232);

-- --------------------------------------------------------

--
-- Table structure for table `useraccount`
--

CREATE TABLE IF NOT EXISTS `useraccount` (
  `username` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `useraccount`
--

INSERT INTO `useraccount` (`username`, `password`) VALUES
('admin', '12345'),
('admin2', '123'),
('Lac123', '123456'),
('me', 'me12'),
('susu', 'su123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `listproduct`
--
ALTER TABLE `listproduct`
 ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `useraccount`
--
ALTER TABLE `useraccount`
 ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `listproduct`
--
ALTER TABLE `listproduct`
MODIFY `Id` int(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=23;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
