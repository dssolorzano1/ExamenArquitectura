package com.examen.core.account.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ofi_aula")
public class OfiAula implements Serializable {

    @Id
    @Column(name = "cod_aula", length = 8, nullable = false)
    private String codAula;

    @ManyToOne
    @JoinColumn(name = "cod_edificio", nullable = false)
    @NotNull
    private OfiEdificio edificio;

    @ManyToOne
    @JoinColumn(name = "cod_tipo_aula", nullable = false)
    @NotNull
    private OfiTipoAula tipoAula;

    @Column(name = "capacidad")
    private Integer capacidad;

    @Column(name = "piso")
    private Integer piso;

    @Column(name = "fecha_creacion")
    private java.sql.Date fechaCreacion;

    @Column(name = "fecha_ult_actualizacion")
    private java.sql.Timestamp fechaUltActualizacion;

    public OfiAula() {
    }

    public OfiAula(String codAula) {
        this.codAula = codAula;
    }

    public String getCodAula() {
        return codAula;
    }

    public void setCodAula(String codAula) {
        this.codAula = codAula;
    }

    public OfiEdificio getEdificio() {
        return edificio;
    }

    public void setEdificio(OfiEdificio edificio) {
        this.edificio = edificio;
    }

    public OfiTipoAula getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(OfiTipoAula tipoAula) {
        this.tipoAula = tipoAula;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public java.sql.Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(java.sql.Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public java.sql.Timestamp getFechaUltActualizacion() {
        return fechaUltActualizacion;
    }

    public void setFechaUltActualizacion(java.sql.Timestamp fechaUltActualizacion) {
        this.fechaUltActualizacion = fechaUltActualizacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfiAula ofiAula = (OfiAula) o;
        return Objects.equals(codAula, ofiAula.codAula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codAula);
    }

    @Override
    public String toString() {
        return "OfiAula{" +
                "codAula='" + codAula + '\'' +
                ", edificio=" + edificio +
                ", tipoAula=" + tipoAula +
                ", capacidad=" + capacidad +
                ", piso=" + piso +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaUltActualizacion=" + fechaUltActualizacion +
                '}';
    }
}
