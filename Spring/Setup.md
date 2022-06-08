# Spring Framework

1. DI (Dependency Injection)
    - XML
    - Annotation

2. AOP (Aspect Oriented Programming)
    - XML
    - Annotation
    
3. Spring + Mybatis
    - pom.xml에 mybatis driver setting
      
        ```xml
        <dependency>
        		<groupId>mysql</groupId>
        		<artifactId>mysql-connector-java</artifactId>
        		<version>8.0.17</version>
        </dependency>
        ```
        
    - spring.xml에 database 및 mybatis 관련 setting
    - mybatis.xml setting

1. Spring MVC → 

<**html** xmlns:th=*"http://www.thymeleaf.org"*>

<script src="[https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js](https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js)"></script>



**1. pom.xml에 library 추가**

- servlet, tomcat, json

  ```java
      <!-- @Inject -->
  		<dependency>
  			<groupId>javax.inject</groupId>
  			<artifactId>javax.inject</artifactId>
  			<version>1</version>
  		</dependency>
  		<!-- Servlet -->
  
  		<dependency>
  			<groupId>org.apache.tomcat.embed</groupId>
  			<artifactId>tomcat-embed-jasper</artifactId>
  			<scope>provided</scope>
  		</dependency>
  
  
  		<dependency>
  			<groupId>javax.servlet</groupId>
  			<artifactId>javax.servlet-api</artifactId>
  			<version>3.0.1</version>
  			<scope>provided</scope>
  		</dependency>
  		<dependency>
  			<groupId>javax.servlet</groupId>
  			<artifactId>jstl</artifactId>
  			<version>1.2</version>
  		</dependency>
  		
  		<!-- json request -->   
  
  		<dependency>
  			<groupId>com.googlecode.json-simple</groupId>
  			<artifactId>json-simple</artifactId>
  			<version>1.1</version>
    		</dependency>
  ```

  

  **2. application.properties 수정** 

  - port 정보
  - Mysql 정보
  - Mybatis 정보

  ``` server.port=80
  spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
  spring.datasource.url=jdbc:mysql://127.0.0.1:3306/shopdb?serverTimezone=Asia/Seoul
  
  spring.datasource.username=admin1
  spring.datasource.password=Luke22240@
  
  mybatis.type-aliases-package=com.multi.vo
  mybatis.mapper-locations=com/multi/mybatis/*.xml
  ```

  

  
