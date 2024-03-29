# spring-jwt-realization
In this project I realize full mechanism of user login and registration. Also Implement Role Based Action Control.

To implement it, I used `Spring Boot`, `Spring Data JPA` and `Postgres` to store data, `Spring Security 5` to implement security issues, `JWT` to communicate between `Server` and `Client`. 

# Running
To run the application enter in the command line: `mvn spring-boot:run`

After project running, schema in the Database created. First of all, you need some `Roles`:

```
INSERT INTO roles(name) VALUES('ROLE_IS_1_1');
INSERT INTO roles(name) VALUES('ROLE_IS2');
INSERT INTO roles(name) VALUES('ROLE_IS3');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR_IS_1_1');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR_IS2');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR_IS3');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
```

# Signup
`POST localhost:8080/api/auth/signup`
```
{
    "username": "admin221121",
    "password": "123",
    "groups":"41ks", // no null
    "roles": ["admin"]
}
```

# Get JWT Token
`POST localhost:8080/api/auth/signin`
```
{
    "username": "admin",
    "password": "1234"
}
```

# Make Request to Secure API
`localhost:8080/api/test/admin`

```Bearer {jwt}```

# Make Request to Public API
`localhost:8080/api/test/all`
