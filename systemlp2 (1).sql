-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2024 at 10:15 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `systemlp2`
--
CREATE DATABASE IF NOT EXISTS `systemlp2` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `systemlp2`;

-- --------------------------------------------------------

--
-- Table structure for table `investimentos`
--

CREATE TABLE `investimentos` (
  `id_investimento` int(11) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `valor_inicial` decimal(10,2) DEFAULT NULL,
  `incremento` decimal(10,2) DEFAULT NULL,
  `meses` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `investimentos`
--

INSERT INTO `investimentos` (`id_investimento`, `id_usuario`, `valor_inicial`, `incremento`, `meses`) VALUES
(1, NULL, 1000.00, 200.00, 4),
(2, NULL, 1000.00, 200.00, 5),
(8, 1, 5000.00, 200.00, 24),
(9, 789456, 100.00, 50.00, 5),
(10, 789456, 100.02, 50.04, 5),
(11, 4567, 1000.00, 500.00, 3),
(12, 67, 1000.00, 200.00, 3),
(13, 67, 1000.00, 200.00, 3),
(14, 444, 100.00, 20.00, 6),
(15, 444, 100.00, 20.00, 6),
(16, 444, 100.00, 20.00, 6),
(17, 9, 500.00, 200.00, 4),
(18, 77, 200.00, 80.00, 6),
(19, 66, 50.00, 200.00, 4),
(20, 11, 100.00, 550.00, 5),
(21, 4545, 1000.00, 2000.00, 9),
(22, 1, 5000.00, 200.00, 24),
(23, 424334, 200.00, 10.00, 4);

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id`, `nome`) VALUES
(1, 'test'),
(2, 'test'),
(3, 'Nome do Usuário'),
(9, 'Luis'),
(11, 'TESTENOVAMENTE'),
(66, 'TESTEDNV'),
(67, 'Henrique Teste'),
(77, 'Cleide'),
(444, 'Test variacoes'),
(4545, 'jucreio'),
(4567, 'Jucreia'),
(123456, 'Henrique'),
(424334, 'Jucreio'),
(789456, 'Henrique');

-- --------------------------------------------------------

--
-- Table structure for table `variacoes`
--

CREATE TABLE `variacoes` (
  `id_variacoes` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_investimento` int(11) NOT NULL,
  `meses` int(11) DEFAULT NULL,
  `variacao` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `variacoes`
--

INSERT INTO `variacoes` (`id_variacoes`, `id_usuario`, `id_investimento`, `meses`, `variacao`) VALUES
(5, 1, 1, 1, 0.4),
(6, 1, 1, 2, 0.5),
(7, 1, 1, 3, 0.6),
(40, 3, 1, 1, 5),
(41, 3, 1, 2, 2),
(42, 3, 1, 3, 4),
(43, 3, 1, 4, 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `investimentos`
--
ALTER TABLE `investimentos`
  ADD PRIMARY KEY (`id_investimento`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `variacoes`
--
ALTER TABLE `variacoes`
  ADD PRIMARY KEY (`id_variacoes`),
  ADD KEY `variacoes_ibfk_1` (`id_usuario`),
  ADD KEY `variacoes_ibfk_2` (`id_investimento`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `investimentos`
--
ALTER TABLE `investimentos`
  MODIFY `id_investimento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `variacoes`
--
ALTER TABLE `variacoes`
  MODIFY `id_variacoes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `investimentos`
--
ALTER TABLE `investimentos`
  ADD CONSTRAINT `investimentos_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `variacoes`
--
ALTER TABLE `variacoes`
  ADD CONSTRAINT `variacoes_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `variacoes_ibfk_2` FOREIGN KEY (`id_investimento`) REFERENCES `investimentos` (`id_investimento`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
