# Proyecto Archivos API

API REST para servir diferentes tipos de archivos como imágenes, HTML, XML, y PDF.

## Estructura del Proyecto

Este proyecto está organizado en una estructura donde los archivos de cada tipo se encuentran en carpetas específicas dentro del directorio `resources/static`:

- `imagenes`: Archivos de imagen (.jpg).
- `html`: Archivos HTML.
- `xml`: Archivos XML.
- `pdf`: Archivos PDF.
 ** NOTA: TENER EN CUENTA QUE HAY GET DE HTTP DE JSON EN ESTE CASO ESTAN PERO NO SE USARAN, SOLO SERVIRAN LOS 4 ANTERIORES.**
### Endpoints Disponibles

1. **Imagen**: para cargar una imagen en formato JPG, usa:
    - `GET /apiarchivos/imagen/{nombre}`
    - Ejemplo: `localhost:8081/apiarchivos/imagen/mariobros`

2. **HTML**: para cargar un archivo HTML, usa:
    - `GET /apiarchivos/html/{nombre}`
    - Ejemplo: `localhost:8080/apiarchivos/html/pagina1`

3. **XML**: para cargar un archivo XML, usa:
    - `GET /apiarchivos/xml/{nombre}`
    - Ejemplo: `localhost:8081/todosapi/xml/hiworld`

5. **PDF**: para cargar un archivo PDF, usa:
    - `GET /apiarchivos/pdf/{nombre}`
    - Ejemplo: `localhost:8081/todosapi/pdf/documento`

### Instrucciones para Ejecutar

1. Clona este mismo repositorio.
2. Asegúrate de tener JDK 21 y Maven instalados.
3. Ejecuta el proyecto usando:
   ```bash
   mvn spring-boot:run
