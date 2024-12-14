package com.examen.core.account.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ofi_edificio")
public class OfiEdificio implements Serializable {

    @Id
    @Column(name = "cod_edificio", length = 8, nullable = false)
    private String codEdificio;

    @ManyToOne
    @JoinColumn(name = "cod_sede", nullable = false)
    @NotNull
    private OfiSede sede;

    @NotNull
    @Column(name = "nombre", length = 128, nullable = false)
    private String nombre;

    @Column(name = "cod_alterno", length = 8)
    private String codAlterno;

    @Column(name = "descripcion", length = 1000)
    private String descripcion;

    @Column(name = "direccion", length = 256)
    private String direccion;

    @Column(name = "maneja_bloques")
    private Boolean manejaBloques;

    @Column(name = "posee_aulas")
    private Boolean poseeAulas;

    @Column(name = "pisos")
    private Integer pisos;

    public OfiEdificio() {
    }

    public OfiEdificio(String codEdificio) {
        this.codEdificio = codEdificio;
    }

    public String getCodEdificio() {
        return codEdificio;
    }

    public void setCodEdificio(String codEdificio) {
        this.codEdificio = codEdificio;
    }

    public OfiSede getSede() {
        return sede;
    }

    public void setSede(OfiSede sede) {
        this.sede = sede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodAlterno() {
        return codAlterno;
    }

    public void setCodAlterno(String codAlterno) {
        this.codAlterno = codAlterno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getManejaBloques() {
        return manejaBloques;
    }

    public void setManejaBloques(Boolean manejaBloques) {
        this.manejaBloques = manejaBloques;
    }

    public Boolean getPoseeAulas() {
        return poseeAulas;
    }

    public void setPoseeAulas(Boolean poseeAulas) {
        this.poseeAulas = poseeAulas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfiEdificio that = (OfiEdificio) o;
        return Objects.equals(codEdificio, that.codEdificio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEdificio);
    }

    @Override
    public String toString() {
        return "OfiEdificio{" +
                "codEdificio='" + codEdificio + '\'' +
                ", sede=" + sede +
                ", nombre='" + nombre + '\'' +
                ", codAlterno='" + codAlterno + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", manejaBloques=" + manejaBloques +
                ", poseeAulas=" + poseeAulas +
                ", pisos=" + pisos +
                '}';
    }
}
