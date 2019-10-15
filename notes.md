* Write classes in Java
* Create objects of those classes

``` java
class Account {
	double balance;
	long accountNumber;
	
	void withdraw(amount) {}
	void deposit(amount) {}
	void transferFund(to, amount) {}

}
```

* Maintain a pool of Account objects __Object Pooling__
* __Transaction__ service for __transferFund__
* __Security__ for __withdraw and transferFund__

* JEE
* Use my API
* This API will provide the neccessary services for your code

``` java
interface AccountHome extends Home {}
interface Account {}
class AccountBean implements EntityBean {
	double balance;
	long accountNumber;
	
	void withdraw(amount) {}
	void deposit(amount) {}
	void transferFund(to, amount) {}

}
//your class should not have constructors
//should not have final variables
//should not have static methods
//should not extend any other class
```

* ejb-jar.xml file 
* You configure what is your bean class and what services it requires
* Create a JAR file
* Install a EJB container (JBOss, WL, Web Sphere)
* Drop your jar file in it


### Spring

* POJO framework
* Light weight container
* Dependency Injection
* 5.x

### Spring Boot

* An abstraction of Spring framework
* Extremely light weight and agile
* fastest way in Java Ecosystem(right now) to create production-ready applications
* Still provides all the functionalities of Spring
* 2.x
























