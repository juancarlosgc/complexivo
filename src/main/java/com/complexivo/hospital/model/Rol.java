package com.complexivo.hospital.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Rol {

    private Long idRol;

    private String rol_descripcion;

    private Set<Usuario> usuarios = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rol rol = (Rol) o;
        return idRol.equals(rol.idRol) && Objects.equals(rol_descripcion, rol.rol_descripcion);
    }

    public Rol() {
    }

    public Rol(Long idRol, String rol_descripcion) {
        this.idRol = idRol;
        this.rol_descripcion = rol_descripcion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRol, rol_descripcion);
    }

    @Override
    public String toString() {
        return "Rol{" +
                "idRol=" + idRol +
                ", rol_descripcion='" + rol_descripcion + '\'' +
                '}';
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getRol_descripcion() {
        return rol_descripcion;
    }

    public void setRol_descripcion(String rol_descripcion) {
        this.rol_descripcion = rol_descripcion;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
