-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Aug 13, 2021 at 02:08 AM
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
(9, 'Bane', 'B,a,n,e', 'A poison', 4),
(10, 'Bat', 'B,a,t', 'Flying vampire', 3),
(11, 'Bate', 'B,a,t,e', 'To restrain', 4),
(12, 'Bed', 'B,e,d', 'Sleep on it', 3),
(13, 'Bet', 'B,e,t', 'Monetary compromise', 3),
(14, 'Beta', 'B,e,t,a', 'Second greek letter', 4),
(15, 'Big', 'B,i,g', 'Very large', 3),
(16, 'Bin', 'B,i,n', 'A container', 3),
(17, 'Bine', 'B,i,n,e', 'Stem of plants', 4),
(18, 'Bio', 'B,i,o', 'Story of someone', 3),
(19, 'Bite', 'B,i,t,e', 'Cut with teeth', 4),
(20, 'Bone', 'B,o,n,e', 'Under your skin', 4),
(21, 'Bony', 'B,o,n,y', 'Without much fat', 4),
(22, 'Bot', 'B,o,t', 'Programming to minimize tasks', 3),
(23, 'Box', 'B,o,x', 'Used to store things', 3),
(24, 'But', 'B,u,t', 'Synonym for however', 3),
(25, 'Buy', 'B,u,y', 'Another word for purchase', 3),
(26, 'Byte', 'B,y,t,e', 'PC storage unit', 4),
(27, 'Can', 'C,a,n', 'They store food', 3),
(28, 'Cap', 'C,a,p', 'Bottle top', 3),
(29, 'Car', 'C,a,r', 'Main method of transportation', 3),
(30, 'Cat', 'C,a,t', 'Domestic Feline', 3),
(31, 'Cop', 'C,o,p', 'Police officer', 3),
(32, 'Cot', 'C,o,t', 'Small bed', 3),
(33, 'Dad', 'D,a,d', 'Paternal parent', 3),
(34, 'Dam', 'D,a,m', 'Used to create energy', 3),
(35, 'Dane', 'D,a,n,e', 'Great dog', 4),
(36, 'Den', 'D,e,n', 'Man cave', 3),
(37, 'Dig', 'D,i,g', 'Taking out dirt', 3),
(38, 'Dine', 'D,i,n,e', 'Have a meal', 4),
(39, 'Dino', 'D,i,n,o', 'Flintstones pet', 4),
(40, 'Dip', 'D,i,p', 'Immerse briefly', 3),
(41, 'Dog', 'D,o,g', 'A mans best friend', 3),
(42, 'Done', 'D,o,n,e', 'To finish up', 4),
(43, 'Dot', 'D,o,t', 'Little point', 3),
(44, 'Dune', 'D,u,n,e', 'Sandy hill', 4),
(45, 'Dye', 'D,y,e', 'Used to changed color', 3),
(46, 'Dyne', 'D,y,n,e', 'Unit of force', 4),
(47, 'Eat', 'E,a,t', 'We need this to survive', 3),
(48, 'Fan', 'F,a,n', 'Cooling device', 3),
(49, 'Fat', 'F,a,t', 'Opposite of skinny', 3),
(50, 'Fax', 'F,a,x', 'Old way of sending documents electronically', 3),
(51, 'Fog', 'F,o,g', 'Thick mist', 3),
(52, 'Fun', 'F,u,n', 'You play games to have', 3),
(53, 'Ham', 'H,a,m', 'Pork product', 3),
(54, 'Hat', 'H,a,t', 'Head accessory', 3),
(55, 'Hen', 'H,e,n', 'Female rooster', 3),
(56, 'Hit', 'H,i,t', 'Top 10 song', 3),
(57, 'Hop', 'H,o,p', 'Small jump', 3),
(58, 'Hot', 'H,o,t', 'Opposite of cold', 3),
(59, 'Ice', 'I,c,e', 'It keeps things cool', 3),
(60, 'Jam', 'J,a,m', 'Another word for jelly', 3),
(61, 'Jet', 'J,e,t', 'Type of aircraft', 3),
(62, 'Jog', 'J,o,g', 'Light sprint', 3),
(63, 'Keg', 'K,e,g', 'Brewery unit', 3),
(64, 'Kit', 'K,i,t', 'Tool container', 3),
(65, 'Lad', 'L,a,d', 'Young boy', 3),
(66, 'Lam', 'L,a,m', 'Escape as from jail', 3),
(67, 'Lap', 'L,a,p', 'Once around the track', 3),
(68, 'Leg', 'L,e,g', 'Lower limb', 3),
(69, 'Let', 'L,e,t', 'Permit; lease', 3),
(70, 'Lip', 'L,i,p', 'Mouth part', 3),
(71, 'Lit', 'L,i,t', 'Something ignited', 3),
(72, 'Log', 'L,o,g', 'Piece of wood', 3),
(73, 'Mad', 'M,a,d', 'Very angry', 3),
(74, 'Man', 'M,a,n', 'Male person', 3),
(75, 'Mane', 'M,a,n,e', 'Hair on a lion', 4),
(76, 'Mani', 'M,a,n,i', 'Short for manicure', 4),
(77, 'Mano', 'M,a,n,o', 'Another word for hand', 4),
(78, 'Many', 'M,a,n,y', 'More than a couple', 4),
(79, 'Map', 'M,a,p', 'Area plan', 3),
(80, 'Mat', 'M,a,t', 'Shoe wiping spot', 3),
(81, 'Men', 'M,e,n', 'More than one male', 3),
(82, 'Menu', 'M,e,n,u', 'List of available dishes', 4),
(83, 'Met', 'M,e,t', 'Got together', 3),
(84, 'Mina', 'M,i.n,a', 'A monetary unit in Ancient Greece', 4),
(85, 'Mine', 'M,i.n,e', 'Belonging to me', 4),
(86, 'Mini', 'M,i.n,i', 'Small version', 4),
(87, 'Mona', 'M,o.n,a', 'First name of famous art piece', 4),
(88, 'Mop', 'M,o,p', 'Cleanup aid', 3),
(89, 'Muni', 'M,u.n,i', 'Tax exempt bond, for short', 4),
(90, 'Nap', 'N,a,p', 'Brief sleep', 3),
(91, 'Net', 'N,e,t', 'Fishing trap', 3),
(92, 'Pad', 'P,a,d', 'Helicopter stand', 3),
(93, 'Pan', 'P,a,n', 'Used for cooking', 3),
(94, 'Peg', 'P,e,g', 'Tent stake', 3),
(95, 'Pen', 'P,e,n', 'Writing tool', 3),
(96, 'Pet', 'P,e,t', 'Animal companion', 3),
(97, 'Pig', 'P,i,g', 'Bacon source', 3),
(98, 'Pin', 'P,i,n', 'Metal fastener', 3),
(99, 'Pop', 'P,o,p', 'Carbonated drink', 3),
(100, 'Pot', 'P,o,t', 'Kitchen utensil', 3),
(101, 'Rag', 'R,a,g', 'Piece of cloth', 3),
(102, 'Ram', 'R,a,m', 'Symbol of Aries', 3),
(103, 'Rap', 'R,a,p', 'Music genre', 3),
(104, 'Rat', 'R,a,t', 'Large rodent', 3),
(105, 'Red', 'R,e,d', 'White or ___ wine', 3),
(106, 'Rig', 'R,i,g', 'Arrange in a dishonest way', 3),
(107, 'Rip', 'R,i,p', 'Clothing tear', 3),
(108, 'Rot', 'R,o,t', 'To decompose or decay', 3),
(109, 'Run', 'R,u,m', 'Move rapidly', 3),
(110, 'Sip', 'S,i,p', 'Small mouthful', 3),
(111, 'Sit', 'S,i,t', 'Occupy a seat', 3),
(112, 'Sun', 'S,u,n', 'Lights up the solar system', 3),
(113, 'Tag', 'T,a,g', 'Clothing label', 3),
(114, 'Tap', 'T,a,p', 'Gentle attention-getter', 3),
(115, 'Ten', 'T,e,n', 'Number after nine', 3),
(116, 'Tin', 'T,i,n', 'Metallic element', 3),
(117, 'Tip', 'T,i,p', 'Overbalance', 3),
(118, 'Top', 'T,o,p', 'Removable cover', 3),
(119, 'Van', 'V,a,n', 'Larger than a car', 3),
(120, 'Vet', 'V,e,t', 'Pet doctor', 3),
(121, 'Wet', 'W,e,t', 'Opposite of dry', 3),
(122, 'Wig', 'W,i,g', 'Part of a clown costume', 3),
(123, 'Yam', 'Y,a,m', 'Sweet potato substitute', 3),
(124, 'Zip', 'Z,i,p', 'Kind of code', 3);

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
