package com.Control_Tareas.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudiante") //Se crean las tablas de la bases de datos y se asignan como entidades en Java....

public class persona implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
long id_estudiante;
private Long numero_documento, numero_telefono, acudiente_id_acudiente, curso_idcurso;
private String tipo_documento, nombres, apellidos, usuario;

public persona(long id_estudiante, long numero_documento, long numero_telefono, long acudiente_id_acudiente,
        long curso_idcurso, String tipo_documento, String nombres, String apellidos, String usuario) {
    this.id_estudiante = id_estudiante;
    this.numero_documento = numero_documento;
    this.numero_telefono = numero_telefono;
    this.acudiente_id_acudiente = acudiente_id_acudiente;
    this.curso_idcurso = curso_idcurso;
    this.tipo_documento = tipo_documento;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.usuario = usuario;
}

public persona() {
}

@Override
public String toString() {
    return "persona [acudiente_id_acudiente=" + acudiente_id_acudiente + ", apellidos=" + apellidos + ", curso_idcurso="
            + curso_idcurso + ", id_estudiante=" + id_estudiante + ", nombres=" + nombres + ", numero_documento="
            + numero_documento + ", numero_telefono=" + numero_telefono + ", tipo_documento=" + tipo_documento
            + ", usuario=" + usuario + "]";
}

public long getIdestudiante() {
    return id_estudiante;
}

public void setIdestudiante(long idestudiante) {
    this.id_estudiante = idestudiante;
}

public long getNumero_documento() {
    return numero_documento;
}

public void setNumero_documento(long numero_documento) {
    this.numero_documento = numero_documento;
}

public long getNumero_telefono() {
    return numero_telefono;
}

public void setNumero_telefono(long numero_telefono) {
    this.numero_telefono = numero_telefono;
}

public long getAcudiente_id_acudiente() {
    return acudiente_id_acudiente;
}

public void setAcudiente_id_acudiente(long acudiente_id_acudiente) {
    this.acudiente_id_acudiente = acudiente_id_acudiente;
}

public long getCurso_idcurso() {
    return curso_idcurso;
}

public void setCurso_idcurso(long curso_idcurso) {
    this.curso_idcurso = curso_idcurso;
}

public String getTipo_documento() {
    return tipo_documento;
}

public void setTipo_documento(String tipo_documento) {
    this.tipo_documento = tipo_documento;
}

public String getNombres() {
    return nombres;
}

public void setNombres(String nombres) {
    this.nombres = nombres;
}

public String getApellidos() {
    return apellidos;
}

public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}

public String getUsuario() {
    return usuario;
}

public void setUsuario(String usuario) {
    this.usuario = usuario;
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (acudiente_id_acudiente ^ (acudiente_id_acudiente >>> 32));
    result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
    result = prime * result + (int) (curso_idcurso ^ (curso_idcurso >>> 32));
    result = prime * result + (int) (id_estudiante ^ (id_estudiante >>> 32));
    result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
    result = prime * result + (int) (numero_documento ^ (numero_documento >>> 32));
    result = prime * result + (int) (numero_telefono ^ (numero_telefono >>> 32));
    result = prime * result + ((tipo_documento == null) ? 0 : tipo_documento.hashCode());
    result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    persona other = (persona) obj;
    if (acudiente_id_acudiente != other.acudiente_id_acudiente)
        return false;
    if (apellidos == null) {
        if (other.apellidos != null)
            return false;
    } else if (!apellidos.equals(other.apellidos))
        return false;
    if (curso_idcurso != other.curso_idcurso)
        return false;
    if (id_estudiante != other.id_estudiante)
        return false;
    if (nombres == null) {
        if (other.nombres != null)
            return false;
    } else if (!nombres.equals(other.nombres))
        return false;
    if (numero_documento != other.numero_documento)
        return false;
    if (numero_telefono != other.numero_telefono)
        return false;
    if (tipo_documento == null) {
        if (other.tipo_documento != null)
            return false;
    } else if (!tipo_documento.equals(other.tipo_documento))
        return false;
    if (usuario == null) {
        if (other.usuario != null)
            return false;
    } else if (!usuario.equals(other.usuario))
        return false;
    return true;
}



}
