package dam.isi.frsf.utn.edu.ar.lab03;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import dam.isi.frsf.utn.edu.ar.lab03.Trabajo;

public class Categoria implements Serializable {
    private Integer id;
    private String descripcion;
    private List<Trabajo> trabajos;

    public Categoria(){
        this.trabajos=new ArrayList<>();
    }

    public Categoria(Integer id,String desc){
        this();
        this.id = id;
        this.descripcion = desc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Trabajo> getTrabajo() {
        return trabajos;
    }

    public void setTrabajo(List<Trabajo> trabajos) {
        this.trabajos = trabajos;
    }

    public void addTrabajo(Trabajo t){
        this.trabajos.add(t);
    }

    @Override
    public String toString() {
        return descripcion;
    }

    public static final Categoria[] CATEGORIAS_MOCK= new Categoria[]{
            new Categoria(1,"Arquitecto"),
            new Categoria(2,"Desarrollador"),
            new Categoria(3, "Tester"),
            new Categoria(4,"Analista"),
            new Categoria(5,"Mobile Developer")
    };

}
