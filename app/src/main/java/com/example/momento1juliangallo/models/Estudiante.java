package com.example.momento1juliangallo.models;

public class Estudiante {
    private Double Nota;
    private String Nombre;
    private Integer id;

    public Estudiante(String nombre, Double nota) {
        Nota = nota;
        Nombre = nombre;
        this.id = id;
    }

    public Double getNota() {
        return Nota;
    }

    public void setNota(Double nota) {
        Nota = nota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "Nota=" + Nota +
                ", Nombre='" + Nombre + '\'' +
                ", id=" + id +
                '}';
    }

}

