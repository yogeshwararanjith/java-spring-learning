# Product Service (Spring Boot Learning)

This is a beginner-friendly REST API project built while learning Spring Boot basics.

## What this project covers

- Dependency Injection (DI) and IoC through Spring-managed beans
- Layered structure: Controller -> Service -> Repository
- CRUD APIs using:
  - `@RestController`
  - `@RequestMapping`
  - `@GetMapping`
  - `@PostMapping`
  - `@PutMapping`
  - `@DeleteMapping`
- Path variable handling with `@PathVariable`
- Request body handling with `@RequestBody`
- HTTP responses using `ResponseEntity`
- Basic validation using `@Valid` and bean validation annotations

## Tech stack

- Java 17
- Spring Boot
- Maven

## Project structure

- `Model` - Product model class
- `Repository` - in-memory product store (uses `Map<Integer, Product>`)
- `Service` - business/service layer
- `Controller` - REST endpoints

## API endpoints

Base URL: `/api/products`

- `GET /api/products` - fetch all products
- `GET /api/products/{id}` - fetch product by id
- `POST /api/products` - create product
- `PUT /api/products/{id}` - update product
- `DELETE /api/products/{id}` - delete product

## Sample JSON (POST/PUT)

```json
{
  "title": "Wireless Mouse",
  "category": "electronics",
  "price": 29.99,
  "rating": 4.3
}
```

## Run the app

From the `product-service` folder:

```bash
./mvnw spring-boot:run
```

On Windows PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

If needed, set `JAVA_HOME` to your JDK path before running.

## Learning note

This version intentionally keeps the code simple (no DTOs/global exception handler yet) for easier understanding while learning core Spring REST development.
