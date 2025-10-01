user-service/                 
│── pom.xml                   # Maven dependencies  
│── src/  
│   ├── main/  
│   │   ├── java/com/nishant/  
│   │   │   ├── UserServiceApplication.java   # Main Spring Boot Application  
│   │   │   ├── controller/  
│   │   │   │     └── UserController.java     # REST Controller  
│   │   │   ├── modal/  
│   │   │   │     └── User.java               # JPA Entity (User table)  
│   │   │   └── repository/  
│   │   │         └── UserRepository.java     # JPA Repository  
│   │   └── resources/  
│   │       ├── application.properties        # DB Configuration  
│   │       ├── static/                       # Static assets (optional)  
│   │       └── templates/                    # Thymeleaf templates (optional)  
│   └── test/java/                            # Unit Tests  
