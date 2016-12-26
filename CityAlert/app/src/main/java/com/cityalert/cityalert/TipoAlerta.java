package com.cityalert.cityalert;

/**
 * Created by john on 23/12/2016.
 */
public class TipoAlerta {
    private int id;
    private String nombre;
    private int foto;

    public TipoAlerta(int id, String nombre, int foto) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }


}
