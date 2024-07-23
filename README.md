## Project Overview

Introducing Budget Buddy, your ultimate companion for managing personal finances easily and confidently. Designed to simplify budgeting and financial planning, Budget Buddy helps you track expenses, set savings goals, and monitor your progress in real-time. With intuitive charts and personalized insights, you can make informed decisions and stay on top of your financial health. Whether you're saving for a big purchase or just trying to keep within your monthly budget, Budget Buddy provides the tools and support you need. Join the community of savvy savers and take control of your finances with Budget Buddy today! We are excited to help you!

## Setup Used

- Java 11
- Javascript
- HTML
- CSS
- MySql
- Apache Tomcat


### Running application
 Run the following scripts in setup/db/ folder:
 
    database_schema.sql 
	inserts.sql

 Set configuration settings in support/HOME/config/
    
    application.properties 
    
For running application from IDE set environment variables

    SPRING_CONFIG_LOCATION=/PATH_TO/HOME/config/
    SPRING_CONFIG_NAME=application

For running application from command line

    java -jar personalfinances.jar --spring.config.location=/PATH_TO/HOME/config/ --spring.config.name=application
    
Or copy setup/personalfinances.conf to directory where the personalfinances.jar is located, change LOG_FOLDER,CONF_FOLDER,LOG_FILENAME,RUN_ARGS arguments in file personalfinances.conf
and run command

    ./personalfinances.jar   

You can access personalfinances at http://localhost:8080/personalfinances/

    Users 
    admin role - admin/admin
    user role - user/user

For adding transactions at first create categories, accounts, contacts from Settings menu.
Sample categories:

    Car
    Clothes
    Entertainment
    Food
    Gift
    Other
    Payments
    Shopping
    Transport

![picture](doc/settings.png)

![picture](doc/home.png)


