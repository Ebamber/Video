Domain:

- `Video`: The business object representing the corresponding database object for a video. Will need a method to parse 
  to and from the database object so the two entities can remain separate (so I can abstract the complexities of jooq generated classes)
  Will have the following parameters:
  - UUID `id`
  - String name 
  - Enum<VideoType> videoType 
  - Date outDate (nullable, if null then default to INT 0 instead of getting Instant)
  - Date returnDate (nullable, if null then default to INT 0 instead of getting Instant)
    
- VideoType will be an enum which will be used both to map in the DB a short String to identify the video type, and to store
  the corresponding `PriceType` for the video, we will have the following parameters in the enum:
  - String ShortName
  - Enum<PriceType> price
  - Function calculator

- PriceType will be an enum which stores the cost associated to either a premium or a basic price and will have the 
  following params:
  - Double price

Repository:

JooQ will be used to generate my Data Objects because I'm too lazy to create and annotate them myself seeing as I'll 
have the schema defined in resources anyway. The schema will be structured as follows:

CREATE TABLE Video (
    ID VARCHAR(36) NOT NULL,
    Name VARCHAR(20) NOT NULL, --a friendlier field to query the DB with than UUID
    Type VARCHAR(2) NOT NULL, --necessary so we can calculate price
    OutDate INT, --this will be an epoch, 0 means it hasn't yet been rented out
    ReturnDate INT, --this will be an epoch, 0 means it hasn't yet been returned
    PRIMARY KEY (ID)
);

Service:

This will be relatively lightweight since a lot of the functionality for price will be built into the enums. Just a single
class with a method for each endpoint in the controller where I will translate between the contract entities and the data object
for the repository.

Controller:

A controller under `/video` with 3 endpoints:
1. A POST endpoint to insert/update video records in the database using the `Video.java` entity in the contract.
2. A GET endpoint with String Path Variable `name` which will calculate the rent cost of a single video.
3. A GET endpoint which will calculate the rent costs of all videos in the database. 

Testing:

- MVC tests for the controller
- Unit tests for the service wherein I will test the translation between business object and data object
- Unit tests for the service wherein I will test the calculator in PriceType for a given Video
- An integration test wherein I will test both of the above using actual data in the DB