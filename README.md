This is the rate Limit Solution API

This basically restricts the API call based on the threshold configured against combination of
user and API.

Step to execute the application.

1.Download the zip file.
2.Unzip the file as rateLimt.
3.go to rateLimt.
4.open command prompt and go to the location of rateLimit folder.
5. run mvn clean install.
6.go to target folder
7.run java -jar rate.limit-0.0.1-SNAPSHOT.jar
8.This will start spring boot application.

Note:
1.Below url will open Swagger documentation to refer Rest APIs
http://localhost:9090/swagger-ui.html

2.Below URL contains all the APIs with sample data
https://www.getpostman.com/collections/b55eb1f28ffd59fad282
Import this url in your postman.

3.Use below URL to login to H2 console
http://localhost:9090/h2-console/login.do?jsessionid=24bf33546732cf7b0e0698856e192da5

4.Use below query to check the data in H2
select * from users;
select * from developer;
select * from organization;
 
