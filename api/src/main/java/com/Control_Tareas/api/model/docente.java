package com.Control_Tareas.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="docente") //Se crean las tablas de la bases de datos y se asignan como entidades en Java....

public class docente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
long id_docente;
private Long numero_telefono;
private String nombres, apellidos, usuario;

public docente(long id_docente, Long numero_telefono, String nombres, String apellidos, String usuario) {
    this.id_docente = id_docente;
    this.numero_telefono = numero_telefono;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.usuario = usuario;
}

public docente() {
}

@Override
public String toString() {
    return "docente [apellidos=" + apellidos + ", id_docente=" + id_docente + ", nombres=" + nombres
            + ", numero_telefono=" + numero_telefono + ", usuario=" + usuario + "]";
}

public long getId_docente() {
    return id_docente;
}

public void setId_docente(long id_docente) {
    this.id_docente = id_docente;
}

public Long getNumero_telefono() {
    return numero_telefono;
}

public void setNumero_telefono(Long numero_telefono) {
    this.numero_telefono = numero_telefono;
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
    result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
    result = prime * result + (int) (id_docente ^ (id_docente >>> 32));
    result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
    result = prime * result + ((numero_telefono == null) ? 0 : numero_telefono.hashCode());
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
    docente other = (docente) obj;
    if (apellidos == null) {
        if (other.apellidos != null)
            return false;
    } else if (!apellidos.equals(other.apellidos))
        return false;
    if (id_docente != other.id_docente)
        return false;
    if (nombres == null) {
        if (other.nombres != null)
            return false;
    } else if (!nombres.equals(other.nombres))
        return false;
    if (numero_telefono == null) {
        if (other.numero_telefono != null)
            return false;
    } else if (!numero_telefono.equals(other.numero_telefono))
        return false;
    if (usuario == null) {
        if (other.usuario != null)
            return false;
    } else if (!usuario.equals(other.usuario))
        return false;
    return true;
}





}
