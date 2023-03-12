package com.complexivo.hospital.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Paciente {
    private Long idPaciente;

    private Long idUsuario;

    private Set<Cita> citas = new HashSet<>();


    public Paciente() {
    }

    public Paciente(Long idUsuario, Usuario usuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return idPaciente.equals(paciente.idPaciente) && Objects.equals(idUsuario, paciente.idUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPaciente, idUsuario);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente +
                ", idUsuario=" + idUsuario +
                '}';
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
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
