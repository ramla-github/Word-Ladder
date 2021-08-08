-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Aug 09, 2021 at 12:18 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ladder`
--

-- --------------------------------------------------------

--
-- Table structure for table `words`
--

CREATE TABLE `words` (
  `Word_ID` int(11) NOT NULL,
  `word` varchar(50) NOT NULL,
  `characters` varchar(50) NOT NULL,
  `clue` varchar(50) NOT NULL,
  `length` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `words`
--

INSERT INTO `words` (`Word_ID`, `word`, `characters`, `clue`, `length`) VALUES
(1, 'Ace', 'A,c,e', 'Best or worst card in card games', 3),
(2, 'Add', 'A,d,d', 'One of the 4 arithmetic operations', 3),
(3, 'Age', 'A,g,e', 'It increases by 1 each year', 3),
(4, 'Air', 'A,i,r', 'What we breath', 3),
(5, 'Art', 'A,r,t', 'Painting is considered', 3),
(6, 'Axe', 'A,x,e', 'Used by Lumberjacks', 3),
(7, 'Bag', 'B,a,g', 'Grocery carrier', 3),
(8, 'Ban', 'B,a,n', 'When something is prohibited', 3),
(9, 'Bat', 'B,a,t', 'Flying vampire', 3),
(10, 'Bed', 'B,e,d', 'Sleep on it', 3),
(11, 'Bet', 'B,e,t', 'Monetary compromise', 3),
(12, 'Big', 'B,i,g', 'Very large', 3),
(13, 'Bin', 'B,i,n', 'A container', 3),
(14, 'Bio', 'B,i,o', 'Story of someone', 3),
(15, 'Bot', 'B,o,t', 'Programming to minimize tasks', 3),
(16, 'Box', 'B,o,x', 'Used to store things', 3),
(17, 'But', 'B,u,t', 'Synonym for however', 3),
(18, 'Buy', 'B,u,y', 'Another word for puchase', 3),
(19, 'Can', 'C,a,n', 'They store food', 3),
(20, 'Cap', 'C,a,p', 'Bottle top', 3),
(21, 'Car', 'C,a,r', 'Main method of transportation', 3),
(22, 'Cat', 'C,a,t', 'Domestic Feline', 3),
(23, 'Cop', 'C,o,p', 'Police officer', 3),
(24, 'Cot', 'C,o,t', 'Small bed', 3),
(25, 'Dad', 'D,a,d', 'Paternal parent', 3),
(26, 'Dam', 'D,a,m', 'Used to create energy', 3),
(27, 'Den', 'D,e,n', 'Man cave', 3),
(28, 'Dig', 'D,i,g', 'Taking out dirt', 3),
(29, 'Dip', 'D,i,p', 'Immerse briefly', 3),
(30, 'Dog', 'D,o,g', 'A mans best friend', 3),
(31, 'Dot', 'D,o,t', 'Little point', 3),
(32, 'Dye', 'D,y,e', 'Used to changed color', 3),
(33, 'Eat', 'E,a,t', 'We cant survive without it', 3),
(34, 'Fan', 'F,a,n', 'Cooling device', 3),
(35, 'Fat', 'F,a,t', 'Opposite of skinny', 3),
(36, 'Fax', 'F,a,x', 'Old way of sending documents electronically', 3),
(37, 'Fog', 'F,o,g', 'Thick mist', 3),
(38, 'Fun', 'F,u,n', 'You play games to have', 3),
(39, 'Ham', 'H,a,m', 'Pork product', 3),
(40, 'Hat', 'H,a,t', 'Head accessory', 3),
(41, 'Hen', 'H,e,n', 'Female rooster', 3),
(42, 'Hit', 'H,i,t', 'Top 10 song', 3),
(43, 'Hop', 'H,o,p', 'Small jump', 3),
(44, 'Hot', 'H,o,t', 'Opposite of cold', 3),
(45, 'Ice', 'I,c,e', 'It keeps things cool', 3),
(46, 'Jam', 'J,a,m', 'Another word for jelly', 3),
(47, 'Jet', 'J,e,t', 'Type of aircraft', 3),
(48, 'Jog', 'J,o,g', 'Light sprint', 3),
(49, 'Keg', 'K,e,g', 'Brewery unit', 3),
(50, 'Kit', 'K,i,t', 'Tool container', 3),
(51, 'Lad', 'L,a,d', 'Young boy', 3),
(52, 'Lam', 'L,a,m', 'Escape as from jail', 3),
(53, 'Lap', 'L,a,p', 'Once around the track', 3),
(54, 'Leg', 'L,e,g', 'Lower limb', 3),
(55, 'Let', 'L,e,t', 'Permit; lease', 3),
(56, 'Lip', 'L,i,p', 'Mouth part', 3),
(57, 'Lit', 'L,i,t', 'Something ignited', 3),
(58, 'Log', 'L,o,g', 'Piece of wood', 3),
(59, 'Mad', 'M,a,d', 'Very angry', 3),
(60, 'Man', 'M,a,n', 'Male person', 3),
(61, 'Map', 'M,a,p', 'Area plan', 3),
(62, 'Mat', 'M,a,t', 'Shoe wiping spot', 3),
(63, 'Men', 'M,e,n', 'More than one male', 3),
(64, 'Met', 'M,e,t', 'Got together', 3),
(65, 'Mop', 'M,o,p', 'Cleanup aid', 3),
(66, 'Nap', 'N,a,p', 'Brief sleep', 3),
(67, 'Net', 'N,e,t', 'Fishing trap', 3),
(68, 'Pad', 'P,a,d', 'Helicopter stand', 3),
(69, 'Pan', 'P,a,n', 'Used for cooking', 3),
(70, 'Peg', 'P,e,g', 'Tent stake', 3),
(71, 'Pen', 'P,e,n', 'Writing tool', 3),
(72, 'Pet', 'P,e,t', 'Animal companion', 3),
(73, 'Pig', 'P,i,g', 'Bacon source', 3),
(74, 'Pin', 'P,i,n', 'Metal fastener', 3),
(75, 'Pop', 'P,o,p', 'Carbonated drink', 3),
(76, 'Pot', 'P,o,t', 'Kictchen utensil', 3),
(77, 'Rag', 'R,a,g', 'Piece of cloth', 3),
(78, 'Ram', 'R,a,m', 'Symbol of Aries', 3),
(79, 'Rap', 'R,a,p', 'Music genre', 3),
(80, 'Rat', 'R,a,t', 'Large rodent', 3),
(81, 'Red', 'R,e,d', 'White or ___ wine', 3),
(82, 'Rig', 'R,i,g', 'Arrange in a dishonest way', 3),
(83, 'Rip', 'R,i,p', 'Clothing tear', 3),
(84, 'Rot', 'R,o,t', 'To decompose or decay', 3),
(85, 'Run', 'R,u,m', 'Move rapidly', 3),
(86, 'Sip', 'S,i,p', 'Small mouthful', 3),
(87, 'Sit', 'S,i,t', 'Occupy a seat', 3),
(88, 'Sun', 'S,u,n', 'Lights up the solar system', 3),
(89, 'Tag', 'T,a,g', 'Clothing label', 3),
(90, 'Tap', 'T,a,p', 'Gentle attention-getter', 3),
(91, 'Ten', 'T,e,n', 'Number after nine', 3),
(92, 'Tin', 'T,i,n', 'Metallic element', 3),
(93, 'Tip', 'T,i,p', 'Overbalance', 3),
(94, 'Top', 'T,o,p', 'Removable cover', 3),
(95, 'Van', 'V,a,n', 'Larger than a car', 3),
(96, 'Vet', 'V,e,t', 'Pet doctor', 3),
(97, 'Wet', 'W,e,t', 'Opposite of dry', 3),
(98, 'Wig', 'W,i,g', 'Part of a clown costume', 3),
(99, 'Yam', 'Y,a,m', 'Sweet potato substitute', 3),
(100, 'Zip', 'Z,i,p', 'Kind of code', 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `words`
--
ALTER TABLE `words`
  ADD PRIMARY KEY (`Word_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
