The Video Rental Backend is fuelled by REST and JooQ on an H2 backend. There are 4 endpoints of note:

- GET /video/{name} : returns all entries in the DB having the specified name.
- GET /video : returns all entries in the DB.
- GET /video/calculate/{id} : returns the rental cost for the video with the specified id.
- POST /video : insert or update a video record in the DB. 

I was very particular about making the repository method for the POST endpoint an upsert, the query is a bit heavier as 
a result, but it also means that the endpoint itself is a one size fits all solution for all create and update requests for the DB. 
This also means that if the user wants to pass less data to this backend to only update one field, they only need to create the endpoint,
get the record by ID, set the parameter they want to change, and call the same upsert function.

On the backend I'm using JooQ rather than JPA, 2 reasons:

- I'm slightly lazy and creating POJOs is mindless work better suited to a code generator
- My last job introduced me to JooQ, and I liked the concept enough to want to experiment with it

As a result, all of my DAOs are generated, all I need to do is define the schema (which I'd have to do to create the DB anyway)

There is a lot of functionality in my enums. Rather than creating a service just for the sake of switching VideoTypes and
calculating their corresponding price, I integrated that functionality into the enums themselves. Each Video object coming in
will therefore inherently have price calculation without needing to make changes to a separate service.

I have full test coverage for everything in this microservice:

- CalculatorTest contains unit tests for the calculator in each PriceType enum
- VideoRepositoryIT contains integration tests for the database and all of my repository methods
- VideoRentalControllerTest contains MVC tests for all of my endpoints

Just be sure to build the project before running the integration tests as they cannot run without the schema or initial data
created during the maven initialize phase

I've also included a postman collection in the project with all the endpoints as requests.