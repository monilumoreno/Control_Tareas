package com.Control_Tareas.api.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import com.Control_Tareas.api.model.acudiente;

public interface acudienteRepositorio extends JpaRepository<acudiente, Long> {

List<acudiente> findByNombres(@Param("nombres") String nombres); //Crera lista del tipo persona.....  con un parametro name y usando una funcion buscar por nombre

}
