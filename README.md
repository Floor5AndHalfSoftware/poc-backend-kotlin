# PoC API REST con Spring Boot y Kotlin

Swagger (Local) -> http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config

## Variables de entorno para pruebas

Crea un archivo `.env` en la raíz del proyecto con las siguientes variables:

```env
PROFILE_ACTIVE=h2
DB_URL=jdbc:h2:mem:demo_db;MODE=PostgreSQL
DB_USER=root
DB_PASSWORD=12345
```
Con esto ya puedes ejecutar la aplicación con el 
perfil `h2` y la base de datos en memoria H2.