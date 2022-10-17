# Spring Boot and Spring Security with JWT including Access and Refresh Tokens

## How to start

### PostgreSQL

```shell
$ docker pull postgres
docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -d -p 5432:5432 postgres
```

### Spring Boot application

```shell
mvn spring-boot:run
```

## Default DB users

```json
[
    {
        "name": "Vladislav Byrgazov",
        "username": "ex4ample",
        "password": "qwert",
        "roles": ["ROLE_USER", "ROLE_ADMIN", "ROLE_SUPER_ADMIN"]
    },
    {
        "name": "Anna Byrgazova",
        "username": "insendio",
        "password": "qwert",
        "roles": ["ROLE_USER", "ROLE_ADMIN"]
    },
    {
        "name": "Evgeniy Semenov",
        "username": "fallen_azgard",
        "password": "qwert",
        "roles": ["ROLE_USER", "ROLE_MANAGER"]
    },
    {
        "name": "Natasha Melnik",
        "username": "profcom",
        "password": "qwert",
        "roles": ["ROLE_USER"]
    }
]
```
