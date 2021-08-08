-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Aug 08, 2021 at 10:26 PM
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
-- Table structure for table `wordbank`
--

CREATE TABLE `wordbank` (
  `Word_ID` int(11) NOT NULL,
  `Word` varchar(50) CHARACTER SET utf8 NOT NULL,
  `Characters` varchar(50) CHARACTER SET utf8 NOT NULL,
  `Clue` varchar(200) CHARACTER SET utf8 NOT NULL,
  `Length` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `wordbank`
--

INSERT INTO `wordbank` (`Word_ID`, `Word`, `Characters`, `Clue`, `Length`) VALUES
(1, 'Cat', 'C,a,t', 'Domestic Feline', 3),
(2, 'Dog', 'D,o,g', 'A mans best friend', 3),
(3, 'Pan', 'P,a,n', 'Used for cooking', 3),
(4, 'Hat', 'H,a,t', 'Head accessory', 3),
(5, 'Dig', 'D,i,g', 'Taking out dirt', 3),
(6, 'Air', 'A,i,r', 'What we breath', 3),
(7, 'Can', 'C,a,n', 'They store food', 3),
(8, 'Dam', 'D,a,m', 'Used to create energy', 3),
(9, 'Art', 'A,r,t', 'Painting is considered', 3),
(10, 'Age', 'A,g,e', 'It increases by 1 each year', 3),
(11, 'Ace', 'A,c,e', 'Best or worst card in card games', 3),
(12, 'Add', 'A,d,d', 'One of the 4 arithmetic operations', 3),
(13, 'Ice', 'I,c,e', 'It keeps things cool', 3),
(14, 'Fax', 'F,a,x', 'Old way of sending documents electronically', 3),
(15, 'Bio', 'B,i,o', 'Story of someone', 3),
(16, 'Axe', 'A,x,e', 'Used by Lumberjacks', 3),
(17, 'Sun', 'S,u,n', 'Lights up the solar system', 3),
(18, 'Bet', 'B,e,t', 'Monetary compromise', 3),
(19, 'Box', 'B,o,x', 'Used to store things', 3),
(20, 'Car', 'C,a,r', 'Main method of transportation', 3),
(21, 'Dye', 'D,y,e', 'Used to changed color', 3),
(22, 'Eat', 'E,a,t', 'We cant survive without it', 3),
(23, 'Fun', 'F,u,n', 'You play games to have', 3),
(24, 'Dad', 'D,a,d', 'Paternal parent', 3),
(25, 'Bot', 'B,o,t', 'Programming to minimize tasks', 3),
(26, 'But', 'B,u,t', 'Synonym for however', 3),
(27, 'Buy', 'B,u,y', 'Another word for puchase', 3),
(28, 'Bat', 'B,a,t', 'Flying vampire', 3),
(29, 'Rat', 'R,a,t', 'Large rodent', 3),
(30, 'Mat', 'M,a,t', 'Shoe wiping spot', 3),
(31, 'Fat', 'F,a,t', 'Opposite of skinny', 3),
(32, 'Fan', 'F,a,n', 'Cooling device', 3),
(33, 'Man', 'M,a,n', 'Male person', 3),
(34, 'Van', 'V,a,n', 'Larger than a car', 3),
(35, 'Ban', 'B,a,n', 'When something is prohibited', 3),
(36, 'Cap', 'C,a,p', 'Bottle top', 3),
(37, 'Lap', 'L,a,p', 'Once around the track', 3),
(38, 'Map', 'M,a,p', 'Area plan', 3),
(39, 'Nap', 'N,a,p', 'Brief sleep', 3),
(40, 'Tap', 'T,a,p', 'Gentle attention-getter', 3),
(41, 'Rap', 'R,a,p', 'Music genre', 3),
(42, 'Bag', 'B,a,g', 'Grocery carrier', 3),
(43, 'Rag', 'R,a,g', 'Piece of cloth', 3),
(44, 'Tag', 'T,a,g', 'Clothing label', 3),
(45, 'Jam', 'J,a,m', 'Another word for jelly', 3),
(46, 'Ram', 'R,a,m', 'Symbol of Aries', 3),
(47, 'Rig', 'R,i,g', 'Arrange in a dishonest way', 3),
(48, 'Yam', 'Y,a,m', 'Sweet potato substitute', 3),
(49, 'Ham', 'H,a,m', 'Pork product', 3),
(50, 'Run', 'R,u,m', 'Move rapidly', 3),
(51, 'Lam', 'L,a,m', 'Escape as from jail', 3),
(52, 'Lad', 'L,a,d', 'Young boy', 3),
(53, 'Pad', 'P,a,d', 'Helicopter stand', 3),
(54, 'Mad', 'M,a,d', 'Very angry', 3),
(55, 'Den', 'D,e,n', 'Man cave', 3),
(56, 'Hen', 'H,e,n', 'Female rooster', 3),
(57, 'Men', 'M,e,n', 'More than one male', 3),
(58, 'Pen', 'P,e,n', 'Writing tool', 3),
(59, 'Ten', 'T,e,n', 'Number after nine', 3),
(60, 'Jet', 'J,e,t', 'Type of aircraft', 3),
(61, 'Net', 'N,e,t', 'Fishing trap', 3),
(62, 'Pet', 'P,e,t', 'Animal companion', 3),
(63, 'Met', 'M,e,t', 'Got together', 3),
(64, 'Vet', 'V,e,t', 'Pet doctor', 3),
(65, 'Let', 'L,e,t', 'Permit; lease', 3),
(66, 'Wet', 'W,e,t', 'Opposite of dry', 3),
(67, 'Keg', 'K,e,g', 'Brewery unit', 3),
(68, 'Leg', 'L,e,g', 'Lower limb', 3),
(69, 'Peg', 'P,e,g', 'Tent stake', 3),
(70, 'Bed', 'B,e,d', 'Sleep on it', 3),
(71, 'Red', 'R,e,d', 'White or ___ wine', 3),
(72, 'Hit', 'H,i,t', 'Top 10 song', 3),
(73, 'Kit', 'K,i,t', 'Tool container', 3),
(74, 'Sit', 'S,i,t', 'Occupy a seat', 3),
(75, 'Lit', 'L,i,t', 'Something ignited', 3),
(76, 'Dip', 'D,i,p', 'Immerse briefly', 3),
(77, 'Lip', 'L,i,p', 'Mouth part', 3),
(78, 'Sip', 'S,i,p', 'Small mouthful', 3),
(79, 'Zip', 'Z,i,p', 'Kind of code', 3),
(80, 'Rip', 'R,i,p', 'Clothing tear', 3),
(81, 'Tip', 'T,i,p', 'Overbalance', 3),
(82, 'Bin', 'B,i,n', 'A container', 3),
(83, 'Pin', 'P,i,n', 'Metal fastener', 3),
(84, 'Tin', 'T,i,n', 'Metallic element', 3),
(85, 'Pig', 'P,i,g', 'Bacon source', 3),
(86, 'Wig', 'W,i,g', 'Part of a clown costume', 3),
(87, 'Big', 'B,i,g', 'Very large', 3),
(88, 'Fog', 'F,o,g', 'Thick mist', 3),
(89, 'Jog', 'J,o,g', 'Light sprint', 3),
(90, 'Log', 'L,o,g', 'Piece of wood', 3),
(91, 'Cot', 'C,o,t', 'Small bed', 3),
(92, 'Dot', 'D,o,t', 'Little point', 3),
(93, 'Hot', 'H,o,t', 'Opposite of cold', 3),
(94, 'Pot', 'P,o,t', 'Kictchen utensil', 3),
(95, 'Rot', 'R,o,t', 'To decompose or decay', 3),
(96, 'Hop', 'H,o,p', 'Small jump', 3),
(97, 'Mop', 'M,o,p', 'Cleanup aid', 3),
(98, 'Top', 'T,o,p', 'Removable cover', 3),
(99, 'Cop', 'C,o,p', 'Police officer', 3),
(100, 'Pop', 'P,o,p', 'Carbonated drink', 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `wordbank`
--
ALTER TABLE `wordbank`
  ADD PRIMARY KEY (`Word_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `wordbank`
--
ALTER TABLE `wordbank`
  MODIFY `Word_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
