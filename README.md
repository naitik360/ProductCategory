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
Sure! Here's a clean and markdown-friendly **code structure block** you can include in your README file. This will help readers quickly understand the folder and package organization of your Spring Boot project:

---

### 📁 Project Structure

<pre>
src/
└── main/
    └── java/
        └── com/
            └── productCatalog/
                └── productCatalog/
                    ├── controller/
                    │   └── ProductController.java
                    ├── dto/
                    │   └── ProductDTO.java
                    ├── entity/
                    │   └── Product.java
                    ├── repository/
                    │   └── ProductRepository.java
                    ├── service/
                    │   ├── ProductService.java
                    │   └── ProductServiceImpl.java
                    └── ProductCatalogApplication.java
    └── resources/
        ├── application.properties
        └── static/ (optional)
</pre>

You can paste this under the **"📁 Project Structure"** section in the README. Let me know if you want to include `test/` structure or external files like `pom.xml`, Postman collection, etc.




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

