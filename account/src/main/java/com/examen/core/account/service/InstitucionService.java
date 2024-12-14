package com.examen.core.account.service;

import com.examen.core.account.model.OfiInstitucion;

import java.util.List;
import java.util.Optional;

public interface InstitucionService {

    List<OfiInstitucion> getAllInstituciones();

    Optional<OfiInstitucion> getInstitucionById(String codInstitucion);

    OfiInstitucion createInstitucion(OfiInstitucion institucion);

    OfiInstitucion updateInstitucion(String codInstitucion, OfiInstitucion institucion);

    void deleteInstitucion(String codInstitucion);

    Integer calcularCapacidadEdificio(String codSede, String codEdificio);
}
