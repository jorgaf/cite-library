package ec.edu.utpl.arqapl.o20f21.semana1.model;

import ec.edu.utpl.arqapl.o20f21.semana1.cita.Citable;

import java.util.ArrayList;
import java.util.List;

public abstract class ObraLiteraria {
    private String titulo;
    private int anio;
    private List<Autor> autores;

    public ObraLiteraria(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
        autores = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void addAutor(Autor autor) {
        autores.add(autor);
    }

    public abstract String citar(Citable formatCita);

}
