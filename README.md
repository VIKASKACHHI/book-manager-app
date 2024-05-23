# book-manager-app
# Book Management Application

## Prerequisites
- Java Development Kit (JDK)
- Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or NetBeans
- Maven

## Steps

1. **Install JDK:**
   Download and install the latest version of JDK from [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html).

2. **Install an IDE:**
   Download and install an IDE. IntelliJ IDEA, Eclipse, and NetBeans are popular choices.

3. **Install Maven:**
   Download and install Maven from [Maven's website](https://maven.apache.org/).

4. **Create a New Spring Boot Project:**
   - Go to [Spring Initializr](https://start.spring.io/).
   - Choose "Maven Project," "Java," and your preferred Spring Boot version.
   - Add dependencies: Spring Web, Spring Boot DevTools, Spring Data JPA, H2 Database, Spring Security.
   - Generate the project and download the ZIP file.
   - Extract the ZIP file and open the project in your IDE.

5. **Run the Application:**
   - In your IDE, run the `BookManagerApplication` class or use the command `mvn spring-boot:run`.
   - Open your browser and go to `http://localhost:8080/`.

6. **H2 Console:**
   - Open your browser and go to `http://localhost:8080/h2-console`.
   - Use the default settings to connect to the H2 database and manage your data.

## REST API Endpoints

- `GET /books` - Retrieve all books
- `GET /books/{id}` - Retrieve a book by ID
- `POST /books` - Create a new book
- `PUT /books/{id}` - Update an existing book
- `DELETE /books/{id}` - Delete a book
