package com.complexivo.hospital.model;

import java.sql.Time;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Cita {

    private Long idCita;

    private String cit_fecha;

    private Time cit_hora;

    private Integer edad;

    private String especialidad;

    private Boolean fueAtendido;

    private Boolean cit_estado;


    private Paciente paciente;
    private PersonalAdministrativo persona;


    public Cita() {
    }

    public Cita(String cit_fecha, Time cit_hora, Integer edad, String especialidad, Boolean fueAtendido, Boolean cit_estado) {
        this.cit_fecha = cit_fecha;
        this.cit_hora = cit_hora;
        this.edad = edad;
        this.especialidad = especialidad;
        this.fueAtendido = fueAtendido;
        this.cit_estado = cit_estado;
    }


    @Override
    public String toString() {
        return "Cita{" +
                "idCita=" + idCita +
                ", cit_fecha='" + cit_fecha + '\'' +
                ", cit_hora=" + cit_hora +
                ", edad=" + edad +
                ", especialidad='" + especialidad + '\'' +
                ", fueAtendido=" + fueAtendido +
                ", cit_estado=" + cit_estado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cita cita = (Cita) o;
        return idCita.equals(cita.idCita) && Objects.equals(cit_fecha, cita.cit_fecha) && Objects.equals(cit_hora, cita.cit_hora) && Objects.equals(edad, cita.edad) && Objects.equals(especialidad, cita.especialidad) && Objects.equals(fueAtendido, cita.fueAtendido) && Objects.equals(cit_estado, cita.cit_estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCita, cit_fecha, cit_hora, edad, especialidad, fueAtendido, cit_estado);
    }

    public Long getIdCita() {
        return idCita;
    }

    public void setIdCita(Long idCita) {
        this.idCita = idCita;
    }

    public String getCit_fecha() {
        return cit_fecha;
    }

    public void setCit_fecha(String cit_fecha) {
        this.cit_fecha = cit_fecha;
    }

    public Time getCit_hora() {
        return cit_hora;
    }

    public void setCit_hora(Time cit_hora) {
        this.cit_hora = cit_hora;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getFueAtendido() {
        return fueAtendido;
    }

    public void setFueAtendido(Boolean fueAtendido) {
        this.fueAtendido = fueAtendido;
    }

    public Boolean getCit_estado() {
        return cit_estado;
    }

    public void setCit_estado(Boolean cit_estado) {
        this.cit_estado = cit_estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public PersonalAdministrativo getPersona() {
        return persona;
    }

    public void setPersona(PersonalAdministrativo persona) {
        this.persona = persona;
    }
}
