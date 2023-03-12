package com.complexivo.hospital.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PersonalAdministrativo {

    private Long idPersonalAdministrativo;

    private Long idUsuario;

    private Set<Cita> citas = new HashSet<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalAdministrativo that = (PersonalAdministrativo) o;
        return idPersonalAdministrativo.equals(that.idPersonalAdministrativo) && Objects.equals(idUsuario, that.idUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPersonalAdministrativo, idUsuario);
    }

    @Override
    public String toString() {
        return "PersonalAdministrativo{" +
                "idPersonalAdministrativo=" + idPersonalAdministrativo +
                ", idUsuario=" + idUsuario +
                '}';
    }

    public PersonalAdministrativo() {
    }

    public PersonalAdministrativo(Long idUsuario, Usuario usuario) {
        this.idUsuario = idUsuario;

    }

    public Long getIdPersonalAdministrativo() {
        return idPersonalAdministrativo;
    }

    public void setIdPersonalAdministrativo(Long idPersonalAdministrativo) {
        this.idPersonalAdministrativo = idPersonalAdministrativo;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Set<Cita> getCitas() {
        return citas;
    }

    public void setCitas(Set<Cita> citas) {
        this.citas = citas;
    }


}
