-- MySQL dump 10.13  Distrib 5.7.9, for Win32 (AMD64)
--
-- Host: localhost    Database: nomina
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleados` (
  `nssEmpleado` varchar(13) NOT NULL,
  `nomEmpleado` varchar(45) NOT NULL,
  `apeEmpleado` varchar(45) NOT NULL,
  `sexoEmpleado` varchar(12) NOT NULL,
  `cedEmpleado` varchar(13) NOT NULL,
  `telEmpleado` varchar(13) NOT NULL,
  `celEmpleado` varchar(13) NOT NULL,
  `estadoEmpleado` varchar(12) NOT NULL,
  `fechaIngreso` date NOT NULL,
  `tipoNomina` varchar(30) NOT NULL,
  `salario` double NOT NULL,
  `remuneracion` varchar(60) NOT NULL,
  `nota` varchar(120) NOT NULL,
  PRIMARY KEY (`nssEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES ('00440237-5','Amarilis','Almanzar Liriano','Femenino','001-1569886-2','789-789-7897','789-780-9780','Activo','2010-01-04','Principal',4110,'No Completo','test'),('01637412-8','Rafael','Bautista Diaz','Masculino','001-0626982-2','000-000-0000','000-000-0000','Activo','2012-01-02','Principal',4110,'notmal','test'),('11111111-1','nada','pedro','Masculino','222-2222222-2','222-222-2222','222-222-2222','Activo','2016-01-04','Principal',232,'test','test'),('13123213-2','Jose','Martinez','Masculino','323-1231231-2','343-214-3243','324-324-3243','Activo','2016-01-04','Mirador del Ozama',2400,'normal','test'),('31431243-2','marta','sanche','Femenino','341-2343243-2','324-324-3243','324-324-3243','Activo','2016-01-04','Mirador del Ozama',4000,'normal','test');
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-17 20:30:21
