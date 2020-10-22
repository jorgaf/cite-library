package ec.edu.utpl.arqapl.o20f21.semana1.model;

import ec.edu.utpl.arqapl.o20f21.semana1.cita.Citable;

public class Libro extends ObraLiteraria{
    private String isbn;
    private Editorial editorial;

    public Libro(String titulo, int anio, String isbn) {
        super(titulo, anio);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String citar(Citable formatCita) {
        return formatCita.citar(this);
    }
}
