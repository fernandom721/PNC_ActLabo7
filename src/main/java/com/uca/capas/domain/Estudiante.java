package com.uca.capas.domain;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity()
@Table(schema="public",name="estudiante")
public class Estudiante {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private Integer id_estudiante;

    @Column(name = "nombre")
    @NotEmpty()
    @Size(message = "El nombre no debe tener mas de 50 de caracteres", max = 50)
    private String nombre;

    @Column(name = "apellido")
    @Size(message = "El apellido no debe tener mas de 50 de caracteres", max = 50)
    @NotEmpty()
    private String apellido;

    @Column(name = "edad")
    @Size(message = "El carne debe tener exactamente 10 caracteres", max = 10 , min = 10)
    @NotEmpty()
    private int edad;

    @Column(name = "estado")
    @Size(message = "La carrera no debe tener mas de 100 de caracteres", max = 100)
    @NotEmpty()
    private Boolean estado;

    public Estudiante() { }

    public Integer getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(Integer id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}