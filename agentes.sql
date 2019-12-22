-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-12-2019 a las 16:29:37
-- Versión del servidor: 10.1.36-MariaDB
-- Versión de PHP: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `agentes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `enlaces`
--

CREATE TABLE `enlaces` (
  `id` int(10) NOT NULL,
  `enlace` varchar(30) NOT NULL,
  `palabra_clave` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `enlaces`
--

INSERT INTO `enlaces` (`id`, `enlace`, `palabra_clave`) VALUES
(1, 'www.bdbb.com', 'utpl'),
(2, 'www.bbbbb.com', 'utpl'),
(3, 'www.cccc.com', 'loja');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `enlaces`
--
ALTER TABLE `enlaces`
  ADD PRIMARY KEY (`id`),
  ADD KEY `ind_palabra` (`palabra_clave`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `enlaces`
--
ALTER TABLE `enlaces`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
