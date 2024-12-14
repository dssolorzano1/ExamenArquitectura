package com.examen.core.account.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ofi_edificio_bloque")
public class OfiEdificioBloque implements Serializable {

    @Id
    @Column(name = "cod_edificio_bloque", length = 8, nullable = false)
    private String codEdificioBloque;

    @ManyToOne
    @JoinColumn(name = "cod_edificio", nullable = false)
    @NotNull
    private OfiEdificio edificio;

    @NotNull
    @Column(name = "nombre_bloque", length = 128, nullable = false)
    private String nombreBloque;

    @Column(name = "descripcion", length = 500)
    private String descripcion;

    public OfiEdificioBloque() {
    }

    public OfiEdificioBloque(String codEdificioBloque) {
        this.codEdificioBloque = codEdificioBloque;
    }

    public String getCodEdificioBloque() {
        return codEdificioBloque;
    }

    public void setCodEdificioBloque(String codEdificioBloque) {
        this.codEdificioBloque = codEdificioBloque;
    }

    public OfiEdificio getEdificio() {
        return edificio;
    }

    public void setEdificio(OfiEdificio edificio) {
        this.edificio = edificio;
    }

    public String getNombreBloque() {
        return nombreBloque;
    }

    public void setNombreBloque(String nombreBloque) {
        this.nombreBloque = nombreBloque;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfiEdificioBloque that = (OfiEdificioBloque) o;
        return Objects.equals(codEdificioBloque, that.codEdificioBloque);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codEdificioBloque);
    }

    @Override
    public String toString() {
        return "OfiEdificioBloque{" +
                "codEdificioBloque='" + codEdificioBloque + '\'' +
                ", edificio=" + edificio +
                ", nombreBloque='" + nombreBloque + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
