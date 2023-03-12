package com.complexivo.hospital.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Usuario {
    private Long idUsuario;

    private String usu_tipo_documento;

    private String usu_nro_documento;

    private String usu_apellidos;

    private String usu_nombres;

    private String usu_email;

    private String usu_password;

    private String usu_telefono;

    private String usu_direccion;

    private String usu_ciudad_residencia;

    private String usu_fecha_nacimiento;

    private Integer usu_edad;

    private String usu_genero;

    private Boolean usu_estado;

    private Set<Rol> roles = new HashSet<>();

    private Set<Medico>  medicos = new HashSet<>();

    private Set<Paciente>  pacientes = new HashSet<>();

    private Set<PersonalAdministrativo> personalAdministrativo   = new HashSet<>();



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idUsuario.equals(usuario.idUsuario) && Objects.equals(usu_tipo_documento, usuario.usu_tipo_documento) && Objects.equals(usu_nro_documento, usuario.usu_nro_documento) && Objects.equals(usu_apellidos, usuario.usu_apellidos) && Objects.equals(usu_nombres, usuario.usu_nombres) && Objects.equals(usu_email, usuario.usu_email) && Objects.equals(usu_password, usuario.usu_password) && Objects.equals(usu_telefono, usuario.usu_telefono) && Objects.equals(usu_direccion, usuario.usu_direccion) && Objects.equals(usu_ciudad_residencia, usuario.usu_ciudad_residencia) && Objects.equals(usu_fecha_nacimiento, usuario.usu_fecha_nacimiento) && Objects.equals(usu_edad, usuario.usu_edad) && Objects.equals(usu_genero, usuario.usu_genero) && Objects.equals(usu_estado, usuario.usu_estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, usu_tipo_documento, usu_nro_documento, usu_apellidos, usu_nombres, usu_email, usu_password, usu_telefono, usu_direccion, usu_ciudad_residencia, usu_fecha_nacimiento, usu_edad, usu_genero, usu_estado);
    }

    public Usuario() {
    }

    public Usuario(String usu_email, String usu_password) {
        this.usu_email = usu_email;
        this.usu_password = usu_password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", usu_tipo_documento='" + usu_tipo_documento + '\'' +
                ", usu_nro_documento='" + usu_nro_documento + '\'' +
                ", usu_apellidos='" + usu_apellidos + '\'' +
                ", usu_nombres='" + usu_nombres + '\'' +
                ", usu_email='" + usu_email + '\'' +
                ", usu_password='" + usu_password + '\'' +
                ", usu_telefono='" + usu_telefono + '\'' +
                ", usu_direccion='" + usu_direccion + '\'' +
                ", usu_ciudad_residencia='" + usu_ciudad_residencia + '\'' +
                ", usu_fecha_nacimiento='" + usu_fecha_nacimiento + '\'' +
                ", usu_edad=" + usu_edad +
                ", usu_genero='" + usu_genero + '\'' +
                ", usu_estado=" + usu_estado +
                '}';
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsu_tipo_documento() {
        return usu_tipo_documento;
    }

    public void setUsu_tipo_documento(String usu_tipo_documento) {
        this.usu_tipo_documento = usu_tipo_documento;
    }

    public String getUsu_nro_documento() {
        return usu_nro_documento;
    }

    public void setUsu_nro_documento(String usu_nro_documento) {
        this.usu_nro_documento = usu_nro_documento;
    }

    public String getUsu_apellidos() {
        return usu_apellidos;
    }

    public void setUsu_apellidos(String usu_apellidos) {
        this.usu_apellidos = usu_apellidos;
    }

    public String getUsu_nombres() {
        return usu_nombres;
    }

    public void setUsu_nombres(String usu_nombres) {
        this.usu_nombres = usu_nombres;
    }

    public String getUsu_email() {
        return usu_email;
    }

    public void setUsu_email(String usu_email) {
        this.usu_email = usu_email;
    }

    public String getUsu_password() {
        return usu_password;
    }

    public void setUsu_password(String usu_password) {
        this.usu_password = usu_password;
    }

    public String getUsu_telefono() {
        return usu_telefono;
    }

    public void setUsu_telefono(String usu_telefono) {
        this.usu_telefono = usu_telefono;
    }

    public String getUsu_direccion() {
        return usu_direccion;
    }

    public void setUsu_direccion(String usu_direccion) {
        this.usu_direccion = usu_direccion;
    }

    public String getUsu_ciudad_residencia() {
        return usu_ciudad_residencia;
    }

    public void setUsu_ciudad_residencia(String usu_ciudad_residencia) {
        this.usu_ciudad_residencia = usu_ciudad_residencia;
    }

    public String getUsu_fecha_nacimiento() {
        return usu_fecha_nacimiento;
    }

    public void setUsu_fecha_nacimiento(String usu_fecha_nacimiento) {
        this.usu_fecha_nacimiento = usu_fecha_nacimiento;
    }

    public Integer getUsu_edad() {
        return usu_edad;
    }

    public void setUsu_edad(Integer usu_edad) {
        this.usu_edad = usu_edad;
    }

    public String getUsu_genero() {
        return usu_genero;
    }

    public void setUsu_genero(String usu_genero) {
        this.usu_genero = usu_genero;
    }

    public Boolean getUsu_estado() {
        return usu_estado;
    }

    public void setUsu_estado(Boolean usu_estado) {
        this.usu_estado = usu_estado;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }




    public Set<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(Set<Medico> medicos) {
        this.medicos = medicos;
    }

    public Set<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(Set<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public Set<PersonalAdministrativo> getPersonalAdministrativo() {
        return personalAdministrativo;
    }

    public void setPersonalAdministrativo(Set<PersonalAdministrativo> personalAdministrativo) {
        this.personalAdministrativo = personalAdministrativo;
    }
}
