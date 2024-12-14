package com.examen.core.account.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ofi_institucion")
public class OfiInstitucion implements Serializable {

    @Id
    @Column(name = "cod_institucion", length = 20, nullable = false)
    private String codInstitucion;

    @NotNull
    @Column(name = "ruc", length = 13, nullable = false)
    private String ruc;

    @NotNull
    @Column(name = "razon_social", length = 250, nullable = false)
    private String razonSocial;

    @Column(name = "nombre_comercial", length = 250)
    private String nombreComercial;

    public OfiInstitucion() {
    }

    public OfiInstitucion(String codInstitucion) {
        this.codInstitucion = codInstitucion;
    }

    public String getCodInstitucion() {
        return codInstitucion;
    }

    public void setCodInstitucion(String codInstitucion) {
        this.codInstitucion = codInstitucion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfiInstitucion that = (OfiInstitucion) o;
        return Objects.equals(codInstitucion, that.codInstitucion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codInstitucion);
    }

    @Override
    public String toString() {
        return "OfiInstitucion{" +
                "codInstitucion='" + codInstitucion + '\'' +
                ", ruc='" + ruc + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", nombreComercial='" + nombreComercial + '\'' +
                '}';
    }
}
