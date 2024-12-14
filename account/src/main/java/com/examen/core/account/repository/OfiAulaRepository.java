package com.examen.core.account.repository;

import com.examen.core.account.model.OfiAula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OfiAulaRepository extends JpaRepository<OfiAula, String> {

    @Query("SELECT a FROM OfiAula a WHERE a.edificio.codEdificio = :codEdificio AND a.edificio.sede.codSede = :codSede")
    List<OfiAula> findBySedeAndEdificio(@Param("codSede") String codSede, @Param("codEdificio") String codEdificio);
}
