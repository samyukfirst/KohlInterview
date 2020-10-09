
CREATE TABLE IF NOT EXISTS `Item` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `portfolioName` varchar(36) NOT NULL,
  `side` varchar(36) NOT NULL,
  `securityId` varchar(36) NOT NULL,
  `accountName` varchar(36) NOT NULL,
  `sodPosition` int NOT NULL,
  `positionFilled` int NOT NULL,
  `currentPosition` int NOT NULL,
  `closePrice` double NOT NULL,
  `currentPrice` double NOT NULL,
  PRIMARY KEY (`id`)
);

insert into Item (portfolioName, side,securityId,accountName,sodPosition, positionFilled, currentPosition,closePrice,currentPrice)
values ('Portfolio 1','Long','AEO','10001',203121,0,203121,0,13.835);

Select * from Item;