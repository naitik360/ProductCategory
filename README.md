# 🛒 Product Catalog API

A simple yet robust **Product Catalog REST API** built using **Java Spring Boot**. This project demonstrates clean code architecture with **DTOs**, **service layers**, and **CRUD + search functionality**.

---

## 📦 Features

- ✅ Add new products  
- 🔍 Get all products  
- 🔗 Get product by ID  
- ❌ Delete product by ID  
- 🔎 Search products by name  

---

## 📁 Project Structure
src/
├── controller
│ └── ProductController.java
├── dto
│ └── ProductDTO.java
├── entity
│ └── Product.java
├── repository
│ └── ProductRepository.java
├── service
│ ├── ProductService.java
│ └── ProductServiceImpl.java
└── main
└── ProductCatalogApplication.java



---

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/products` | Add a new product |
| `GET`  | `/api/products` | Get all products |
| `GET`  | `/api/products/{id}` | Get product by ID |
| `DELETE` | `/api/products/{id}` | Delete product by ID |
| `GET`  | `/api/products/search?name=value` | Search products by name |

---

## 📥 Sample Request: Add Product

**POST** `/api/products`

```json
{
  "name": "iPhone 15",
  "description": "Latest Apple smartphone",
  "price": 999.99
}


---

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/api/products` | Add a new product |
| `GET`  | `/api/products` | Get all products |
| `GET`  | `/api/products/{id}` | Get product by ID |
| `DELETE` | `/api/products/{id}` | Delete product by ID |
| `GET`  | `/api/products/search?name=value` | Search products by name |

---

## 📥 Sample Request: Add Product

**POST** `/api/products`

```json
{
  "name": "iPhone 15",
  "description": "Latest Apple smartphone",
  "price": 999.99
}

# Clone the repo
git clone https://github.com/your-username/product-catalog-api.git

# Go into the project folder
cd product-catalog-api

# Run the application
./mvnw spring-boot:run

