-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 12/12/2024 às 22:49
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `systemlp2`
--
CREATE DATABASE IF NOT EXISTS `systemlp2` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `systemlp2`;

-- --------------------------------------------------------

--
-- Estrutura para tabela `investimentos`
--

CREATE TABLE `investimentos` (
  `id_investimento` int(11) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `valor_inicial` decimal(10,2) DEFAULT NULL,
  `incremento` decimal(10,2) DEFAULT NULL,
  `meses` int(11) DEFAULT NULL,
  `valor_final` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `investimentos`
--

INSERT INTO `investimentos` (`id_investimento`, `id_usuario`, `valor_inicial`, `incremento`, `meses`, `valor_final`) VALUES
(41, 3216549, 10000.00, 250.00, 35, 15998.43889718794);

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `usuario`
--

INSERT INTO `usuario` (`id`, `nome`) VALUES
(3216549, 'Luis Miguel');

-- --------------------------------------------------------

--
-- Estrutura para tabela `variacoes`
--

CREATE TABLE `variacoes` (
  `id_variacoes` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `id_investimento` int(11) NOT NULL,
  `meses` int(11) DEFAULT NULL,
  `variacao` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `variacoes`
--

INSERT INTO `variacoes` (`id_variacoes`, `id_usuario`, `id_investimento`, `meses`, `variacao`) VALUES
(619, 3216549, 41, 1, 6.37227215046674),
(620, 3216549, 41, 2, -10.016620404499477),
(621, 3216549, 41, 3, -11.000474158090878),
(622, 3216549, 41, 4, -2.1210503331928976),
(623, 3216549, 41, 5, -6.115498284077681),
(624, 3216549, 41, 6, 5.1072811484529135),
(625, 3216549, 41, 7, 19.72605123309399),
(626, 3216549, 41, 8, 14.831258767577648),
(627, 3216549, 41, 9, 1.687315659041344),
(628, 3216549, 41, 10, -9.159298146628302),
(629, 3216549, 41, 11, -8.896807411342822),
(630, 3216549, 41, 12, -13.5314525869193),
(631, 3216549, 41, 13, -13.122342941454335),
(632, 3216549, 41, 14, 1.6424598799815948),
(633, 3216549, 41, 15, -7.83987177645905),
(634, 3216549, 41, 16, -11.141609582579049),
(635, 3216549, 41, 17, 3.660427615417894),
(636, 3216549, 41, 18, -11.96336402185928),
(637, 3216549, 41, 19, 0.567631109959077),
(638, 3216549, 41, 20, 7.288340168464491),
(639, 3216549, 41, 21, 13.521029296730358),
(640, 3216549, 41, 22, 0.4434377509028531),
(641, 3216549, 41, 23, -6.688242258237387),
(642, 3216549, 41, 24, 17.33525187020333),
(643, 3216549, 41, 25, -11.580404696267266),
(644, 3216549, 41, 26, 13.320752904066758),
(645, 3216549, 41, 27, 5.887361767401789),
(646, 3216549, 41, 28, 2.560686339508611),
(647, 3216549, 41, 29, 2.2597574347243077),
(648, 3216549, 41, 30, 9.365104478908194),
(649, 3216549, 41, 31, -9.953026666642383),
(650, 3216549, 41, 32, -1.6947896063082557),
(651, 3216549, 41, 33, 17.67676992036695),
(652, 3216549, 41, 34, -3.8670207704426196),
(653, 3216549, 41, 35, 0.7607164249030518);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `investimentos`
--
ALTER TABLE `investimentos`
  ADD PRIMARY KEY (`id_investimento`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Índices de tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- Índices de tabela `variacoes`
--
ALTER TABLE `variacoes`
  ADD PRIMARY KEY (`id_variacoes`),
  ADD KEY `variacoes_ibfk_1` (`id_usuario`),
  ADD KEY `variacoes_ibfk_2` (`id_investimento`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `investimentos`
--
ALTER TABLE `investimentos`
  MODIFY `id_investimento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT de tabela `variacoes`
--
ALTER TABLE `variacoes`
  MODIFY `id_variacoes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=654;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `investimentos`
--
ALTER TABLE `investimentos`
  ADD CONSTRAINT `investimentos_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Restrições para tabelas `variacoes`
--
ALTER TABLE `variacoes`
  ADD CONSTRAINT `variacoes_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `variacoes_ibfk_2` FOREIGN KEY (`id_investimento`) REFERENCES `investimentos` (`id_investimento`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
