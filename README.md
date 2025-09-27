user-service/                 
│── pom.xml                   
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── nishant/
│   │   │           ├── UserServiceApplication.java   <-- main class (Spring Boot starter)
│   │   │           ├── controller/
│   │   │           │     └── UserController.java     <-- your REST controller
│   │   │           ├── modal/
│   │   │           │     └── User.java               <-- your JPA entity
│   │   │           └── repository/
│   │   │                 └── UserRepository.java     <-- your JPA repository
│   │   └── resources/
│   │       ├── application.properties                <-- DB config goes here
│   │       └── static/                               <-- frontend assets (if any)
│   │       └── templates/                            <-- Thymeleaf (if used)
│   └── test/
│       └── java/                                     <-- test cases

// new created
UserRepository.java → inside com.nishant.repository
// updates
User.java → inside com.nishant.modal
Your JPA entity class.
UserController.java → inside com.nishant.controller
edit your application.properties
