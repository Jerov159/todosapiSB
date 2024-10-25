# Proyecto Archivos API

API REST para servir diferentes tipos de archivos como imágenes, HTML, XML, JSON y PDF.

## Estructura del Proyecto

Este proyecto está organizado en una estructura donde los archivos de cada tipo se encuentran en carpetas específicas dentro del directorio `resources/static`:

- `imagenes`: Archivos de imagen (.jpg).
- `html`: Archivos HTML.
- `xml`: Archivos XML.
- `json`: Archivos JSON.
- `pdf`: Archivos PDF.

### Endpoints Disponibles

1. **Imagen**: para cargar una imagen en formato JPG, usa:
    - `GET /apiarchivos/imagen/{nombre}`
    - Ejemplo: `localhost:8080/apiarchivos/imagen/imagen3`

2. **HTML**: para cargar un archivo HTML, usa:
    - `GET /apiarchivos/html/{nombre}`
    - Ejemplo: `localhost:8080/apiarchivos/html/pagina1`

3. **XML**: para cargar un archivo XML, usa:
    - `GET /apiarchivos/xml/{nombre}`
    - Ejemplo: `localhost:8080/apiarchivos/xml/datos`

4. **JSON**: para cargar un archivo JSON, usa:
    - `GET /apiarchivos/json/{nombre}`
    - Ejemplo: `localhost:8080/apiarchivos/json/ejemplo`

5. **PDF**: para cargar un archivo PDF, usa:
    - `GET /apiarchivos/pdf/{nombre}`
    - Ejemplo: `localhost:8080/apiarchivos/pdf/documento`

### Instrucciones para Ejecutar

1. Clona este mismo repositorio.
2. Asegúrate de tener JDK 21 y Maven instalados.
3. Ejecuta el proyecto usando:
   ```bash
   mvn spring-boot:run
