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