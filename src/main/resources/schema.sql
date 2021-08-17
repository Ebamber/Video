DROP TABLE IF EXISTS `Video`;

CREATE TABLE IF NOT EXISTS `Video` (
    `ID` VARCHAR(36) PRIMARY KEY,
    `Name` VARCHAR(20) NOT NULL, --a friendlier field to query the DB with than UUID
    `Type` VARCHAR(2) NOT NULL, --necessary so we can calculate price
    `OutDate` BIGINT, --this will be an epoch, 0 means it hasn't yet been rented out
    `ReturnDate` BIGINT --this will be an epoch, 0 means it hasn't yet been returned
);