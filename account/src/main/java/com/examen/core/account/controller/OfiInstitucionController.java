package com.examen.core.account.controller;

import com.examen.core.account.model.OfiInstitucion;
import com.examen.core.account.repository.OfiInstitucionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/instituciones")
public class OfiInstitucionController {

    @Autowired
    private OfiInstitucionRepository institucionRepository;

    // Obtener todas
    @GetMapping
    public List<OfiInstitucion> getAllInstituciones() {
        return institucionRepository.findAll();
    }

    // Obtener
    @GetMapping("/{id}")
    public ResponseEntity<OfiInstitucion> getInstitucionById(@PathVariable("id") String codInstitucion) {
        Optional<OfiInstitucion> institucion = institucionRepository.findById(codInstitucion);
        if (institucion.isPresent()) {
            return ResponseEntity.ok(institucion.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Crear
    @PostMapping
    public ResponseEntity<OfiInstitucion> createInstitucion(@RequestBody OfiInstitucion newInstitucion) {
        OfiInstitucion savedInstitucion = institucionRepository.save(newInstitucion);
        return ResponseEntity.ok(savedInstitucion);
    }

    // Actualizar
    @PutMapping("/{id}")
    public ResponseEntity<OfiInstitucion> updateInstitucion(
            @PathVariable("id") String codInstitucion,
            @RequestBody OfiInstitucion updatedInstitucion) {
        Optional<OfiInstitucion> existingInstitucion = institucionRepository.findById(codInstitucion);
        if (existingInstitucion.isPresent()) {
            updatedInstitucion.setCodInstitucion(codInstitucion);
            OfiInstitucion savedInstitucion = institucionRepository.save(updatedInstitucion);
            return ResponseEntity.ok(savedInstitucion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInstitucion(@PathVariable("id") String codInstitucion) {
        Optional<OfiInstitucion> existingInstitucion = institucionRepository.findById(codInstitucion);
        if (existingInstitucion.isPresent()) {
            institucionRepository.deleteById(codInstitucion);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
