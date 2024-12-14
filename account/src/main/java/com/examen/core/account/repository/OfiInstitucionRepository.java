package com.examen.core.account.repository;

import com.examen.core.account.model.OfiInstitucion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfiInstitucionRepository extends JpaRepository<OfiInstitucion, String> {
    // Métodos personalizados, si es necesario, se pueden definir aquí.
}
