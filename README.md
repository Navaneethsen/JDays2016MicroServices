# JDays 2016 MicroServices

These are the source code modules used in my JDays 2016 presentation comparing the micro service platforms
* Spring Boot
* Payara Micro
* WildFly Swarm

To build you need to have a maven version greater than 3.2.1 for the WildFly Swarm example to build.

All the examples implement the same code which is a microservice application that can populate a MySQL database using Details of Roadworks on the UK Road network from data obtained here https://data.gov.uk/dataset/highways_agency_planned_roadworks 

Each example accesses a MySQL database running on the default port and localhost using username test and password test.

For each application to populate the database download an XML file from the UK Government

The run the Dataloader servlet using;

http://localhost:8080/DataLoader?fle=/path/to/yout/uk/xml/file. This will populate the database.
