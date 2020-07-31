#springLearning
Spring code

## Steps to deploy war using tomcat server.

* Copy our WAR file from target/project.war to the tomcat/webapps/ folder
* From a terminal navigate to tomcat/bin folder and execute
* catalina.bat run (on Windows)
* catalina.sh run (on Unix-based systems)
* Go to 
```sh
http://localhost:8080/mvc
```

## URL for MVC + Hibernate project
```sh
http://localhost:7001/spring-web-customer-tracker-all-java-config
```

## Issues

##### 1) Hibernate validation was not working while creating project in Intellij idea.
##### Solution 
 - Add the following entry, just before <<context:component>>. It could actually appear anywhere in the file ... just placing it here for now.
> <<mvc:annotation-driven/>>
>
 - You will also need to update your XML namespace to support the "context" namespace.

> <beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:mvc="http://www.springframework.org/schema/mvc"
	xsi:schemaLocation="
		http://www.springframework.org/schema/beans
    	http://www.springframework.org/schema/beans/spring-beans.xsd
    	http://www.springframework.org/schema/context
    	http://www.springframework.org/schema/context/spring-context.xsd
    	http://www.springframework.org/schema/mvc
        http://www.springframework.org/schema/mvc/spring-mvc.xsd">
>