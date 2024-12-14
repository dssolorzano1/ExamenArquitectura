package com.examen.core.account.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ofi_tipo_aula")
public class OfiTipoAula implements Serializable {

    @Id
    @Column(name = "cod_tipo_aula", length = 10, nullable = false)
    private String codTipoAula;

    @NotNull
    @Column(name = "descripcion", length = 128, nullable = false)
    private String descripcion;

    @Column(name = "fecha_creacion")
    private java.sql.Date fechaCreacion;

    public OfiTipoAula() {
    }

    public OfiTipoAula(String codTipoAula) {
        this.codTipoAula = codTipoAula;
    }

    public String getCodTipoAula() {
        return codTipoAula;
    }

    public void setCodTipoAula(String codTipoAula) {
        this.codTipoAula = codTipoAula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public java.sql.Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(java.sql.Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfiTipoAula that = (OfiTipoAula) o;
        return Objects.equals(codTipoAula, that.codTipoAula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codTipoAula);
    }

    @Override
    public String toString() {
        return "OfiTipoAula{" +
                "codTipoAula='" + codTipoAula + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
