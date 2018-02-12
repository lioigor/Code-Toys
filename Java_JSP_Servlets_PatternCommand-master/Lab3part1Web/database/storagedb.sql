-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Час створення: Лис 01 2016 р., 00:40
-- Версія сервера: 10.1.16-MariaDB
-- Версія PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База даних: `storagedb`
--

-- --------------------------------------------------------

--
-- Структура таблиці `patient`
--

CREATE TABLE `patient` (
  `idPatient` int(10) UNSIGNED NOT NULL,
  `Patientsurname` varchar(45) NOT NULL,
  `Patientname` varchar(45) NOT NULL,
  `Patientpatronymic` varchar(45) NOT NULL,
  `Patientaddress` varchar(45) NOT NULL,
  `Patientdiagnosis` varchar(45) NOT NULL,
  `Patientphone` int(11) NOT NULL,
  `Patientmedicalcard` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=armscii8;

--
-- Дамп даних таблиці `patient`
--

INSERT INTO `patient` (`idPatient`, `Patientsurname`, `Patientname`, `Patientpatronymic`, `Patientaddress`, `Patientdiagnosis`, `Patientphone`, `Patientmedicalcard`) VALUES
(1, 'Ivanov', 'Petro', 'Ivanovich', 'Lenina 49 st. Kiev', 'flue', 675894899, 56634222),
(2, 'Sidorov', 'Anton', 'Oleksandrovich', 'Main 12 st. Zhytomir', 'flue', 664563451, 78445321),
(3, 'Kalashnikov', 'Vasiliy', 'Ivanovich', '28 Okolicia st. Vinnicia', 'stealth', 636781239, 43245453);

--
-- Індекси збережених таблиць
--

--
-- Індекси таблиці `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`idPatient`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
