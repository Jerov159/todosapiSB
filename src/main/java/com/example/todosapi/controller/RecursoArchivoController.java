package com.example.todosapi.controller;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/todosapi")
public class RecursoArchivoController {

        // Endpoint para imágenes (jpg o png)
        @GetMapping("/imagen/{nombre}")
        public ResponseEntity<Resource> obtenerImagen(@PathVariable String nombre) throws IOException {
            return cargarArchivo("static/imagenes/" + nombre + ".jpg", MediaType.IMAGE_JPEG);
        }

        // Endpoint para archivos HTML
        @GetMapping("/html/{nombre}")
        public ResponseEntity<Resource> obtenerHtml(@PathVariable String nombre) throws IOException {
            return cargarArchivo("static/html/" + nombre + ".html", MediaType.TEXT_HTML);
        }

        // Endpoint para archivos XML
        @GetMapping("/xml/{nombre}")
        public ResponseEntity<Resource> obtenerXml(@PathVariable String nombre) throws IOException {
            return cargarArchivo("static/xml/" + nombre + ".xml", MediaType.APPLICATION_XML);
        }

        // Endpoint para archivos JSON
        @GetMapping("/json/{nombre}")
        public ResponseEntity<Resource> obtenerJson(@PathVariable String nombre) throws IOException {
            return cargarArchivo("static/json/" + nombre + ".json", MediaType.APPLICATION_JSON);
        }

        // Endpoint para archivos PDF
        @GetMapping("/pdf/{nombre}")
        public ResponseEntity<Resource> obtenerPdf(@PathVariable String nombre) throws IOException {
            return cargarArchivo("static/pdf/" + nombre + ".pdf", MediaType.APPLICATION_PDF);
        }

        // Método para cargar archivo y devolverlo en el response
        private ResponseEntity<Resource> cargarArchivo(String ruta, MediaType mediaType) throws IOException {
            Resource resource = new ClassPathResource(ruta);
            if (!resource.exists()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(mediaType);
            return new ResponseEntity<>(resource, headers, HttpStatus.OK);
        }
    }
