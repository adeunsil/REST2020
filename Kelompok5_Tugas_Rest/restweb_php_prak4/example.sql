-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 21, 2020 at 04:12 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 5.6.40

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `example`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `id` varchar(5) NOT NULL DEFAULT '',
  `author` varchar(30) DEFAULT NULL,
  `title` varchar(30) DEFAULT NULL,
  `genre` varchar(30) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `publish_date` date DEFAULT NULL,
  `description` text
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`id`, `author`, `title`, `genre`, `price`, `publish_date`, `description`) VALUES
('1', 'Gambardella, Matthew', 'XML Developer\'s Guide', 'Computer', 44.95, '2000-10-01', 'An in-depth look at creating applications\n      with XML.'),
('2', 'Ralls, Kim', 'Midnight Rain', 'Fantasy', 5.95, '2000-12-16', 'A former architect battles corporate zombies,\n      an evil sorceress, and her own childhood to become queen\n      of the world.'),
('666', 'Matthew Bellamy', 'Starlight', 'Fiction', 5, '2012-07-24', 'Book of fiction'),
('4', 'Marthen Lau', 'Mobile Web Design', 'Computer', 5.6, '2012-04-24', 'mobile web design book'),
('18', 'Jaka', 'Jaka Sembung', 'Folks', 12, '2012-04-24', 'bagus'),
('17', 'Jaka', 'Jaka Sembung', 'Folks', 12, '2012-04-24', 'bagus'),
('21', 'Ralls, Kim', 'Midnight Rain', 'Fantasy', 5.95, '2012-04-24', 'A former architect battles corporate zombies,      an evil sorceress, and her own childhood to become queen      of the world.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
