# lab-springboot-enum

Created this project to see what value gets stored in the database when a property is set to an enum type.

Enum.class

```java
public class Enum {
    public enum Status{
        ENROLLED,
        WITHDRAW,
        SUSPENDED,
        GRADUATED,
        TRANSFERRED
    }
}
```

Student.class

```java
@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String passportNumber;

    @Enumerated(EnumType.STRING)
    private Enum.Status status;
 }   
```

By default the "status" field will be create as an int in the database.

The @Enumerated annotation tells Jpa to create the field as a character field.

## Spring Boot

Project generated at http://start.spring.io  using Spring Initialzr

## Maven Dependencies

Project was created with the following maven dependencies:

- JPA
- REST
- Hal
- HATEOS
- H2