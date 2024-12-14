package com.examen.core.account.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ofi_sede")
public class OfiSede implements Serializable {

    @Id
    @Column(name = "cod_sede", length = 20, nullable = false)
    private String codSede;

    @ManyToOne
    @JoinColumn(name = "cod_institucion", nullable = false)
    @NotNull
    private OfiInstitucion institucion;

    @NotNull
    @Column(name = "nombre", length = 128, nullable = false)
    private String nombre;

    @Column(name = "direccion", length = 256)
    private String direccion;

    public OfiSede() {
    }

    public OfiSede(String codSede) {
        this.codSede = codSede;
    }

    // Getters y Setters
    public String getCodSede() {
        return codSede;
    }

    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }

    public OfiInstitucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(OfiInstitucion institucion) {
        this.institucion = institucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfiSede ofiSede = (OfiSede) o;
        return Objects.equals(codSede, ofiSede.codSede);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codSede);
    }

    @Override
    public String toString() {
        return "OfiSede{" +
                "codSede='" + codSede + '\'' +
                ", institucion=" + institucion +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
