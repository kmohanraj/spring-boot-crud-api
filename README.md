#### Spring Boot 2 JPA MySQL CRUD Example
we will develop a CRUD RESTFul APIs using Spring Boot 2,  JPA  and MySQL as a database.

##### Create Project
![Screenshot](createProject.png)

##### Pom.xml File

````
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.4.5</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.example</groupId>
	<artifactId>spring-boot2-jpa-crud</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>spring-boot2-jpa-crud</name>
	<description>Demo project for Spring Boot</description>
	<properties>
		<java.version>11</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-validation</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>
````

##### Create Packages
we have created four packages is,
- controller
- exception
- model
- repository

![Screenshot](packages.png)

##### Create Class
Create a folder `model` inside `src/main/java/com.example.springboot2jpacrud/`

THEN Create Employee class, 

![Screenshot](createClass.png)


THEN Name like is,

![Screenshoy](className.png)

##### Create Interface


![Screenshot](createInterface.png)


##### Run Maven Packages

``
mvn package
``
##### Run Maven Application

http://localhost:8080

``
mvn spring-boot:run
``


