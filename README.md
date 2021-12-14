# taxi-service

This is simple program for taxi service. Program has next functions:
- track all available cars and working drivers
- register new drivers
- add new cars and their manufacturers
- delete cars, drivers and manufacturers
- add drivers to cars
- track your cars as a driver
___
## 3-layer architecture
1. DAO - Data access layer
2. Service - Application layer
3. Controllers - Presentation layer
___
## Technologies
- Java 11
- Tomcat - version 9.0.50
- MySQL 
- JDBC
- Servlet
- JSTL
- JSP
- HTML, CSS
---
## Data Base Diagram of project

![][logo]

[logo]: https://mate-academy-images.s3.eu-central-1.amazonaws.com/car_diagram_db_2_4f50942103.png

---
## How to start the program
1. Configure Apache Tomcat for your IDE
2. Install MySQL and MySQL Workbench
3. Use resources/init_db.sql for creating a Schema and tables
4. Configure /util/ConnectionUtil.java with your URL, USERNAME, PASSWORD, JDBC_DRIVER
5. In the src/main/resources/log4j2.xml at line File name = "File" fileName = "logs\app.log" you need to change "logs\app.log" with absolute path to .log file
6. Сonfigure the tomcat library path in the startup settings
7. Enjoy!)