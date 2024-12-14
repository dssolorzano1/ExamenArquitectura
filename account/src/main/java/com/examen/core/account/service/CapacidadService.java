package com.examen.core.account.service;

import com.examen.core.account.model.OfiAula;
import com.examen.core.account.model.OfiInstitucion;
import com.examen.core.account.repository.OfiAulaRepository;
import com.examen.core.account.repository.OfiInstitucionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CapacidadService implements InstitucionService {

    @Autowired
    private OfiInstitucionRepository institucionRepository;

    @Autowired
    private OfiAulaRepository aulaRepository;

    @Override
    public List<OfiInstitucion> getAllInstituciones() {
        return institucionRepository.findAll();
    }

    @Override
    public Optional<OfiInstitucion> getInstitucionById(String codInstitucion) {
        return institucionRepository.findById(codInstitucion);
    }

    @Override
    public OfiInstitucion createInstitucion(OfiInstitucion institucion) {
        return institucionRepository.save(institucion);
    }

    @Override
    public OfiInstitucion updateInstitucion(String codInstitucion, OfiInstitucion institucion) {
        Optional<OfiInstitucion> existingInstitucion = institucionRepository.findById(codInstitucion);
        if (existingInstitucion.isPresent()) {
            institucion.setCodInstitucion(codInstitucion);
            return institucionRepository.save(institucion);
        } else {
            throw new RuntimeException("Institución no encontrada con el código: " + codInstitucion);
        }
    }

    @Override
    public void deleteInstitucion(String codInstitucion) {
        if (institucionRepository.existsById(codInstitucion)) {
            institucionRepository.deleteById(codInstitucion);
        } else {
            throw new RuntimeException("Institución no encontrada con el código: " + codInstitucion);
        }
    }

    @Override
    public Integer calcularCapacidadEdificio(String codSede, String codEdificio) {
        List<OfiAula> aulas = aulaRepository.findBySedeAndEdificio(codSede, codEdificio);
        return aulas.stream()
                .map(OfiAula::getCapacidad)
                .filter(capacidad -> capacidad != null)
                .reduce(0, Integer::sum);
    }
}
