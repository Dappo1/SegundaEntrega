package com.example.segundaentrega;

public class PersonajeBO {
    private String titulo;
    private String descripcion;
    private int avatar;

    public PersonajeBO(String titulo, String descripcion, int avatar) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.avatar = avatar;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }
}
