# Projeto MongoDB com Spring Boot

# Sobre o projeto
É um projeto desenvolvido com Spring Boot e MongoDB, e minha primeira experiência de acesso a dados em um banco de dados NoSQL.
Esse projeto também foi desenvolvido durante o curso Java Completo Programação Orientada a Objetos + Projetos
da [Udemy](https://www.udemy.com/course/java-curso-completo), e tem os seguintes objetivos:
- Compreender as principais diferenças entre paradigma orientado a documentos e relacional
- Implementar operações de CRUD
- Refletir sobre decisões de design para um banco de dados orientado a documentos
- Implementar associações entre objetos

    -Objetos aninhados

     -Referências
- Realizar consultas com Spring Data e MongoRepository

## Modelo conceitual

![Modelo Conceitual](https://github.com/GabrielSilva2310/Assets/blob/main/Images%20workshop-spring-boot-mongodb/Modelo%20Conceitual.png)

## Diagrama de objetos 
![Diagrama de Objetos](https://github.com/GabrielSilva2310/Assets/blob/main/Images%20workshop-spring-boot-mongodb/Diagrama%20de%20Objetos.png)

# Tecnologias utilizadas
- Java 17 
- Spring Boot 3
- Maven
- Spring Data MongoDB
- MongoDB
- MongoDB Compass
- Postman


# Como executar o projeto

Pré-requisitos: Java 17, MongoDB e MongoDB Compass

```Prompt de Comando
#Subir o MongoDB
mongod
```

Usando o MongoDB Compass:
- Criar base de dados: workshop_mongo
- Criar coleção: user

```bash
# clonar repositório
git clone https://github.com/GabrielSilva2310/workshop-spring-boot-mongodb.git

# entrar na pasta do projeto
cd workshop-spring-boot-mongodb

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Gabriel Da Silva 

www.linkedin.com/in/gabriel-da-silva-457039193
