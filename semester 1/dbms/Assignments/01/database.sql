-- MySQL dump 10.13  Distrib 8.0.32, for macos13.0 (arm64)
--
-- Host: localhost    Database: Gallery
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Artist`
--

DROP TABLE IF EXISTS `Artist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Artist` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `FName` varchar(100) NOT NULL,
  `LName` varchar(100) NOT NULL,
  `Country` varchar(100) NOT NULL,
  `Dob` date NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Artist`
--

LOCK TABLES `Artist` WRITE;
/*!40000 ALTER TABLE `Artist` DISABLE KEYS */;
INSERT INTO `Artist` VALUES (3,'Carol','Channing','USA','1995-08-02');
/*!40000 ALTER TABLE `Artist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customer`
--

DROP TABLE IF EXISTS `Customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Customer` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `FName` varchar(100) NOT NULL,
  `LName` varchar(100) NOT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `Phone` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customer`
--

LOCK TABLES `Customer` WRITE;
/*!40000 ALTER TABLE `Customer` DISABLE KEYS */;
INSERT INTO `Customer` VALUES (1,'Jhon','Smith',NULL,NULL),(2,'Jack','Smith',NULL,NULL),(3,'Amal','Perera',NULL,NULL),(4,'George','Jackson',NULL,NULL),(5,'Pam','Roadster',NULL,NULL),(10,'Jackson','Elizabeth','123 – 4th Avenue, Fonthill, ON, L3J 4S4','(206) 284-6783');
/*!40000 ALTER TABLE `Customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Painting`
--

DROP TABLE IF EXISTS `Painting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Painting` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `ArtistID` int NOT NULL,
  `Name` varchar(150) NOT NULL,
  `Type` varchar(20) NOT NULL,
  `Medium` enum('WaterColors','Chalk','Collage','SprayPaint') NOT NULL,
  `CreatedOn` date NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`),
  KEY `FK_Key` (`ArtistID`),
  CONSTRAINT `FK_Key` FOREIGN KEY (`ArtistID`) REFERENCES `Artist` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `painting_ibfk_1` FOREIGN KEY (`ArtistID`) REFERENCES `Artist` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Painting`
--

LOCK TABLES `Painting` WRITE;
/*!40000 ALTER TABLE `Painting` DISABLE KEYS */;
INSERT INTO `Painting` VALUES (43,3,'At the Movie','Canvas','WaterColors','2019-04-22'),(50,3,'Laugh with Teeth','Canvas','WaterColors','2018-01-02');
/*!40000 ALTER TABLE `Painting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Purchases`
--

DROP TABLE IF EXISTS `Purchases`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Purchases` (
  `PurchaseID` int NOT NULL AUTO_INCREMENT,
  `CustomerID` int NOT NULL,
  `PaintingID` int NOT NULL,
  `Price` float NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`PurchaseID`),
  UNIQUE KEY `PurchaseID` (`PurchaseID`),
  KEY `CustomerID` (`CustomerID`),
  KEY `FK-Key` (`PaintingID`),
  CONSTRAINT `FK-Key` FOREIGN KEY (`PaintingID`) REFERENCES `Painting` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `purchases_ibfk_1` FOREIGN KEY (`CustomerID`) REFERENCES `Customer` (`ID`),
  CONSTRAINT `purchases_ibfk_2` FOREIGN KEY (`PaintingID`) REFERENCES `Painting` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Purchases`
--

LOCK TABLES `Purchases` WRITE;
/*!40000 ALTER TABLE `Purchases` DISABLE KEYS */;
INSERT INTO `Purchases` VALUES (1,10,50,7000,'2000-09-17'),(3,10,43,5550,'2002-02-14');
/*!40000 ALTER TABLE `Purchases` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Sales`
--

DROP TABLE IF EXISTS `Sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Sales` (
  `SalesID` int NOT NULL AUTO_INCREMENT,
  `CustomerID` int NOT NULL,
  `PaintingID` int NOT NULL,
  `Price` float NOT NULL,
  `Date` date NOT NULL,
  PRIMARY KEY (`SalesID`),
  UNIQUE KEY `SalesID` (`SalesID`),
  KEY `CustomerID` (`CustomerID`),
  KEY `FK` (`PaintingID`),
  CONSTRAINT `FK` FOREIGN KEY (`PaintingID`) REFERENCES `Painting` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sales_ibfk_1` FOREIGN KEY (`CustomerID`) REFERENCES `Customer` (`ID`),
  CONSTRAINT `sales_ibfk_2` FOREIGN KEY (`PaintingID`) REFERENCES `Painting` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Sales`
--

LOCK TABLES `Sales` WRITE;
/*!40000 ALTER TABLE `Sales` DISABLE KEYS */;
/*!40000 ALTER TABLE `Sales` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-26 14:30:43
