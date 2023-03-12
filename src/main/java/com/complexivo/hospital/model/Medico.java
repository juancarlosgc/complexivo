package com.complexivo.hospital.model;

import java.util.Objects;

public class Medico {

    private Long idMedico;

    private Long idUsuario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medico medico = (Medico) o;
        return idMedico.equals(medico.idMedico) && Objects.equals(idUsuario, medico.idUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMedico, idUsuario);
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
}
