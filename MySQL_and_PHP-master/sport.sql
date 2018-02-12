-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2016 at 06:47 PM
-- Server version: 5.5.25
-- PHP Version: 5.3.13

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sport`
--

-- --------------------------------------------------------

--
-- Table structure for table `city`
--

CREATE TABLE IF NOT EXISTS `city` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `IX_City` (`Name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `city`
--

INSERT INTO `city` (`ID`, `Name`) VALUES
(1, ' Berlin'),
(6, ' Moscow'),
(9, 'Helsinki'),
(2, 'London'),
(3, 'New York'),
(5, 'San-Francisco'),
(7, 'St. Petersburg'),
(10, 'Stockholm'),
(8, 'Vancouver'),
(11, 'Vasyuki'),
(4, 'Washington');

-- --------------------------------------------------------

--
-- Table structure for table `country`
--

CREATE TABLE IF NOT EXISTS `country` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `IX_Country` (`Name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=21 ;

--
-- Dumping data for table `country`
--

INSERT INTO `country` (`ID`, `Name`) VALUES
(20, 'Brazil'),
(5, 'Canada'),
(17, 'Estonia'),
(6, 'Finland'),
(12, 'France'),
(1, 'Germany'),
(2, 'Great Britain'),
(15, 'Greece'),
(13, 'Italy'),
(8, 'Japan'),
(9, 'Korea'),
(18, 'Latvia'),
(14, 'Poland'),
(19, 'Romania'),
(4, 'Russia'),
(7, 'Sweden'),
(11, 'Switzerland'),
(16, 'Turkey'),
(10, 'Ukraine'),
(3, 'USA');

-- --------------------------------------------------------

--
-- Stand-in structure for view `country_wins_race`
--
CREATE TABLE IF NOT EXISTS `country_wins_race` (
`country` varchar(100)
,`count_sportsmans` bigint(21)
,`year_of` int(4)
,`total_wins` bigint(21)
);
-- --------------------------------------------------------

--
-- Table structure for table `olympic_record`
--

CREATE TABLE IF NOT EXISTS `olympic_record` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `sportID` int(11) NOT NULL,
  `value` double NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `IX_Olympic` (`value`),
  KEY `FK_Olympic_Record_SportID` (`sportID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `olympic_record`
--

INSERT INTO `olympic_record` (`ID`, `sportID`, `value`) VALUES
(1, 1, 1.87),
(2, 2, 9.88),
(3, 3, 57.08),
(4, 4, 400),
(5, 5, 4.77),
(6, 6, 2.9);

-- --------------------------------------------------------

--
-- Stand-in structure for view `records_5years`
--
CREATE TABLE IF NOT EXISTS `records_5years` (
`sport` varchar(100)
,`world_record` double
,`City` varchar(100)
);
-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE IF NOT EXISTS `result` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Result_value` double NOT NULL,
  `Place` int(11) NOT NULL,
  `CompetitionID` int(11) NOT NULL,
  `SportsmanID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_Result_CompetitionID` (`CompetitionID`),
  KEY `FK_Result_SportsmanID` (`SportsmanID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=76 ;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`ID`, `Result_value`, `Place`, `CompetitionID`, `SportsmanID`) VALUES
(1, 1.88, 1, 1, 1),
(2, 1.76, 2, 1, 2),
(3, 1.62, 3, 1, 3),
(4, 1.45, 4, 1, 4),
(5, 1.38, 5, 1, 5),
(6, 1.92, 1, 2, 10),
(7, 1.9, 2, 2, 4),
(8, 1.85, 3, 2, 1),
(9, 1.66, 4, 2, 5),
(10, 1.39, 5, 2, 2),
(11, 1.55, 1, 11, 10),
(12, 1.54, 2, 11, 4),
(13, 1.51, 3, 11, 2),
(14, 1.45, 4, 11, 1),
(15, 1.38, 5, 11, 7),
(16, 1.66, 1, 12, 1),
(17, 1.65, 2, 12, 2),
(18, 1.62, 3, 12, 3),
(19, 1.54, 4, 12, 4),
(20, 1.47, 5, 12, 5),
(21, 1.79, 1, 13, 3),
(22, 1.76, 2, 13, 1),
(23, 1.65, 3, 13, 5),
(24, 1.59, 4, 13, 4),
(25, 1.48, 5, 13, 2),
(26, 1.74, 1, 14, 5),
(27, 1.73, 2, 14, 3),
(28, 1.66, 3, 14, 4),
(29, 1.5, 4, 14, 2),
(30, 1.43, 5, 14, 1),
(31, 1.8, 1, 15, 1),
(32, 1.7, 2, 15, 2),
(33, 1.64, 3, 15, 4),
(34, 1.62, 4, 15, 6),
(35, 1.57, 5, 15, 8),
(36, 1.65, 1, 16, 2),
(37, 1.62, 2, 16, 1),
(38, 1.56, 3, 16, 4),
(39, 1.54, 4, 16, 5),
(40, 1.52, 5, 16, 7),
(41, 1.76, 1, 17, 2),
(42, 1.75, 2, 17, 1),
(43, 1.74, 3, 17, 3),
(44, 1.68, 4, 17, 4),
(45, 1.57, 5, 17, 6),
(46, 1.78, 1, 18, 1),
(47, 1.67, 2, 18, 4),
(48, 1.64, 3, 18, 2),
(49, 1.61, 4, 18, 3),
(50, 1.59, 5, 18, 5),
(51, 1.82, 1, 19, 2),
(52, 1.77, 2, 19, 3),
(53, 1.66, 3, 19, 1),
(54, 1.65, 4, 19, 5),
(55, 1.61, 5, 19, 7),
(56, 1.72, 1, 20, 1),
(57, 1.71, 2, 20, 2),
(58, 1.69, 3, 20, 6),
(59, 1.64, 4, 20, 5),
(60, 1.55, 5, 20, 4),
(61, 2.67, 1, 21, 7),
(62, 2.65, 2, 21, 9),
(63, 2.6, 3, 21, 6),
(64, 2.33, 4, 21, 4),
(65, 2.44, 5, 21, 2),
(66, 2.8, 1, 22, 6),
(67, 2.76, 2, 22, 4),
(68, 2.65, 3, 22, 7),
(69, 2.49, 4, 22, 2),
(70, 2.41, 5, 22, 9),
(71, 9.74, 1, 25, 9),
(72, 56.88, 1, 26, 8),
(73, 430, 1, 23, 5),
(74, 4.69, 1, 24, 6),
(75, 3.2, 1, 27, 7);

--
-- Triggers `result`
--
DROP TRIGGER IF EXISTS `NewWorldRecord`;
DELIMITER //
CREATE TRIGGER `NewWorldRecord` AFTER INSERT ON `result`
 FOR EACH ROW BEGIN
IF EXISTS(
SELECT new.Result_value AS mbRecord, new.CompetitionID AS number
FROM Result
GROUP BY mbRecord, number
HAVING (mbRecord > (SELECT value
FROM world_record WHERE sportID = (SELECT SportID 
FROM сompetition WHERE ID = number))))

THEN 
SET @var := (SELECT new.Result_value
FROM Result
GROUP BY new.Result_value);
UPDATE world_record SET value = @var WHERE ID = (SELECT SportID 
FROM сompetition WHERE ID = (SELECT new.CompetitionID
FROM Result LIMIT 1)
LIMIT 1);
END IF;
END
//
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `sport`
--

CREATE TABLE IF NOT EXISTS `sport` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  `Measurement_unit` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `IX_Sport` (`Name`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `sport`
--

INSERT INTO `sport` (`ID`, `Name`, `Measurement_unit`) VALUES
(1, ' chess', ''),
(2, '100 Metres', 'sec'),
(3, 'relay race', 'sec'),
(4, 'Weightlifting', 'kg'),
(5, 'running cross', 'min'),
(6, 'Cockroach races', 'sm/sec');

-- --------------------------------------------------------

--
-- Table structure for table `sportsman`
--

CREATE TABLE IF NOT EXISTS `sportsman` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(100) NOT NULL,
  `SecondName` varchar(100) NOT NULL,
  `CountryID` int(11) NOT NULL,
  `wins` int(11) NOT NULL,
  `BirthDate` datetime NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_Sportsman_CountryID` (`CountryID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `sportsman`
--

INSERT INTO `sportsman` (`ID`, `FirstName`, `SecondName`, `CountryID`, `wins`, `BirthDate`) VALUES
(1, 'Johannes', 'Zukertort', 1, 22, '1982-03-24 00:00:00'),
(2, 'Howard', 'Staunton', 2, 22, '1985-06-21 00:00:00'),
(3, 'Paul', 'Morphy', 3, 29, '1977-08-04 00:00:00'),
(4, 'Anton', 'Karavaev', 4, 9, '1968-02-26 00:00:00'),
(5, 'Magnus', 'Carlsen', 5, 12, '1979-08-13 00:00:00'),
(6, 'Max', 'Euwe', 6, 17, '1976-05-05 00:00:00'),
(7, 'Wilhelm', 'Steinitz', 7, 35, '1971-07-23 00:00:00'),
(8, 'Daichi', 'Takayama', 8, 7, '1977-09-12 00:00:00'),
(9, 'Joona', 'Serral Sotala', 9, 4, '1986-11-01 00:00:00'),
(10, 'Ruslan', 'Ponomariov', 10, 38, '1989-04-12 00:00:00');

-- --------------------------------------------------------

--
-- Stand-in structure for view `ukrainestop`
--
CREATE TABLE IF NOT EXISTS `ukrainestop` (
`sport` varchar(100)
,`year_of` int(4)
,`NumberOfEventsYear` bigint(21)
,`Ukraines_count` bigint(21)
);
-- --------------------------------------------------------

--
-- Stand-in structure for view `worldrecordset`
--
CREATE TABLE IF NOT EXISTS `worldrecordset` (
`sport` varchar(100)
,`сompetition` varchar(100)
,`location` varchar(100)
,`Data` datetime
,`world_record` double
);
-- --------------------------------------------------------

--
-- Table structure for table `world_record`
--

CREATE TABLE IF NOT EXISTS `world_record` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `sportID` int(11) NOT NULL,
  `value` double NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `IX_World` (`value`),
  KEY `FK_World_Record_sportID` (`sportID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `world_record`
--

INSERT INTO `world_record` (`ID`, `sportID`, `value`) VALUES
(1, 1, 1.92),
(2, 2, 9.74),
(3, 3, 56.88),
(4, 4, 430),
(5, 5, 4.69),
(6, 6, 3.2);

-- --------------------------------------------------------

--
-- Table structure for table `сompetition`
--

CREATE TABLE IF NOT EXISTS `сompetition` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  `Data` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `CityID` int(11) NOT NULL,
  `SportID` int(11) NOT NULL,
  `SportsmanID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `IX_Competition` (`Name`),
  KEY `FK_сompetition_CityID` (`CityID`),
  KEY `FK_сompetition_SportID` (`SportID`),
  KEY `FK_сompetition_SportsmanID` (`SportsmanID`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=28 ;

--
-- Dumping data for table `сompetition`
--

INSERT INTO `сompetition` (`ID`, `Name`, `Data`, `CityID`, `SportID`, `SportsmanID`) VALUES
(1, 'Chess world cup 97', '1997-03-24 00:00:00', 1, 1, 1),
(2, 'Chess world cup 98', '1998-08-22 00:00:00', 2, 1, 2),
(3, 'Chess world cup 99', '1999-05-08 00:00:00', 3, 1, 3),
(4, 'Chess world cup 00', '2000-07-02 00:00:00', 4, 1, 4),
(5, 'Chess world cup 01', '2001-04-15 00:00:00', 5, 1, 5),
(6, '100 Metres olympic championship 04', '2004-08-25 00:00:00', 6, 2, 6),
(7, '100 Metres olympic championship 05', '2005-08-22 00:00:00', 7, 2, 7),
(8, '100 Metres olympic championship 06', '2006-06-10 00:00:00', 8, 2, 8),
(9, '100 Metres olympic championship 07', '2007-07-06 00:00:00', 9, 2, 9),
(10, '100 Metres olympic championship 08', '2008-05-28 00:00:00', 10, 2, 10),
(11, 'Open Chess Championship', '2015-05-20 00:00:00', 11, 1, 1),
(12, 'Chess CHAMP 1', '2000-01-25 00:00:00', 1, 1, 1),
(13, 'Chess CHAMP 2', '2000-02-07 00:00:00', 2, 1, 2),
(14, 'Chess CHAMP 3', '2000-03-21 00:00:00', 3, 1, 3),
(15, 'Chess CHAMP 4', '2000-05-12 00:00:00', 4, 1, 4),
(16, 'Chess CHAMP 5', '2000-06-09 00:00:00', 5, 1, 5),
(17, 'Chess CHAMP 6', '2000-07-29 00:00:00', 6, 1, 6),
(18, 'Chess CHAMP 7', '2000-08-20 00:00:00', 7, 1, 7),
(19, 'Chess CHAMP 8', '2000-09-15 00:00:00', 8, 1, 8),
(20, 'Chess CHAMP 9', '2000-11-04 00:00:00', 9, 1, 9),
(21, 'Cockroach races XX', '2015-07-25 00:00:00', 7, 6, 1),
(22, 'Cockroach races XXI', '2016-09-05 00:00:00', 9, 6, 1),
(23, 'Weightlifting Championship Gold', '2016-05-22 00:00:00', 5, 4, 1),
(24, 'Running cross World cup 05', '2005-08-14 00:00:00', 8, 5, 1),
(25, '100 Metres Europe Championship 01', '2001-07-03 00:00:00', 10, 2, 1),
(26, 'Relay race 2014', '2014-06-28 00:00:00', 1, 3, 1),
(27, 'Cockroach races DD2', '2008-05-16 00:00:00', 7, 6, 1);

-- --------------------------------------------------------

--
-- Structure for view `country_wins_race`
--
DROP TABLE IF EXISTS `country_wins_race`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `country_wins_race` AS (select `c`.`Name` AS `country`,(select count(0) from `sportsman` where (`sportsman`.`CountryID` = (select `country`.`ID` from `country` where (`country`.`Name` = `c`.`Name`)))) AS `count_sportsmans`,year(`com`.`Data`) AS `year_of`,(select count(0) from `result` where ((`result`.`CompetitionID` = `com`.`ID`) and (`result`.`SportsmanID` = (select `sportsman`.`ID` from `sportsman` where (`sportsman`.`CountryID` = `c`.`ID`))))) AS `total_wins` from (((`result` `res` left join `сompetition` `com` on((`res`.`CompetitionID` = `com`.`ID`))) left join `sportsman` `spm` on((`res`.`SportsmanID` = `spm`.`ID`))) left join `country` `c` on((`spm`.`CountryID` = `c`.`ID`))) where ((`com`.`Name` like '%race%') and (`res`.`Place` = 1)) group by `c`.`Name`,(select count(0) from `sportsman` where (`sportsman`.`CountryID` = (select `country`.`ID` from `country` where (`country`.`Name` = `c`.`Name`)))),year(`com`.`Data`) order by year(`com`.`Data`));

-- --------------------------------------------------------

--
-- Structure for view `records_5years`
--
DROP TABLE IF EXISTS `records_5years`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `records_5years` AS (select `sp`.`Name` AS `sport`,`wr`.`value` AS `world_record`,`ct`.`Name` AS `City` from ((((`result` `res` join `сompetition` `com` on((`res`.`CompetitionID` = `com`.`ID`))) join `sport` `sp` on((`com`.`SportID` = `sp`.`ID`))) join `city` `ct` on((`com`.`CityID` = `ct`.`ID`))) join `world_record` `wr` on((`sp`.`ID` = `wr`.`sportID`))) where ((`res`.`Result_value` = `wr`.`value`) and (year(`com`.`Data`) in ((select distinct max(year(`сompetition`.`Data`)) from `сompetition`),(select distinct max((year(`сompetition`.`Data`) - 1)) from `сompetition`),(select distinct max((year(`сompetition`.`Data`) - 2)) from `сompetition`),(select distinct max((year(`сompetition`.`Data`) - 3)) from `сompetition`),(select distinct max((year(`сompetition`.`Data`) - 4)) from `сompetition`)))));

-- --------------------------------------------------------

--
-- Structure for view `ukrainestop`
--
DROP TABLE IF EXISTS `ukrainestop`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ukrainestop` AS (select `sp`.`Name` AS `sport`,year(`com`.`Data`) AS `year_of`,(select count(0) from `сompetition` where ((`сompetition`.`SportID` = `com`.`SportID`) and (year(`сompetition`.`Data`) = year(`com`.`Data`)))) AS `NumberOfEventsYear`,count(distinct `com`.`ID`) AS `Ukraines_count` from ((((`result` `res` left join `сompetition` `com` on((`res`.`CompetitionID` = `com`.`ID`))) left join `sport` `sp` on((`com`.`SportID` = `sp`.`ID`))) left join `sportsman` `spm` on((`res`.`SportsmanID` = `spm`.`ID`))) left join `country` `c` on((`spm`.`CountryID` = `c`.`ID`))) where (`com`.`ID` in (select `сompetition`.`ID` from `сompetition` where year(`сompetition`.`Data`) in (select distinct year(`сompetition`.`Data`) from `сompetition`)) and (`res`.`Place` in (1,2,3)) and (`c`.`Name` like 'Ukraine')) group by `sp`.`Name`,year(`com`.`Data`),(select count(0) from `сompetition` where ((`сompetition`.`SportID` = `com`.`SportID`) and (year(`сompetition`.`Data`) = year(`com`.`Data`)))));

-- --------------------------------------------------------

--
-- Structure for view `worldrecordset`
--
DROP TABLE IF EXISTS `worldrecordset`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `worldrecordset` AS (select `sp`.`Name` AS `sport`,`com`.`Name` AS `сompetition`,`ct`.`Name` AS `location`,`com`.`Data` AS `Data`,`wr`.`value` AS `world_record` from ((((`result` `res` left join `сompetition` `com` on((`res`.`CompetitionID` = `com`.`ID`))) left join `sport` `sp` on((`com`.`SportID` = `sp`.`ID`))) left join `city` `ct` on((`com`.`CityID` = `ct`.`ID`))) left join `world_record` `wr` on((`sp`.`ID` = `wr`.`sportID`))) where (`res`.`Result_value` = `wr`.`value`));

--
-- Constraints for dumped tables
--

--
-- Constraints for table `olympic_record`
--
ALTER TABLE `olympic_record`
  ADD CONSTRAINT `FK_Olympic_Record_SportID` FOREIGN KEY (`sportID`) REFERENCES `sport` (`ID`);

--
-- Constraints for table `result`
--
ALTER TABLE `result`
  ADD CONSTRAINT `FK_Result_CompetitionID` FOREIGN KEY (`CompetitionID`) REFERENCES `сompetition` (`ID`),
  ADD CONSTRAINT `FK_Result_SportsmanID` FOREIGN KEY (`SportsmanID`) REFERENCES `sportsman` (`ID`);

--
-- Constraints for table `sportsman`
--
ALTER TABLE `sportsman`
  ADD CONSTRAINT `FK_Sportsman_CountryID` FOREIGN KEY (`CountryID`) REFERENCES `country` (`ID`);

--
-- Constraints for table `world_record`
--
ALTER TABLE `world_record`
  ADD CONSTRAINT `FK_World_Record_sportID` FOREIGN KEY (`sportID`) REFERENCES `sport` (`ID`);

--
-- Constraints for table `сompetition`
--
ALTER TABLE `сompetition`
  ADD CONSTRAINT `FK_сompetition_CityID` FOREIGN KEY (`CityID`) REFERENCES `city` (`ID`),
  ADD CONSTRAINT `FK_сompetition_SportID` FOREIGN KEY (`SportID`) REFERENCES `sport` (`ID`),
  ADD CONSTRAINT `FK_сompetition_SportsmanID` FOREIGN KEY (`SportsmanID`) REFERENCES `sportsman` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
