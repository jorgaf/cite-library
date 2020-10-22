package ec.edu.utpl.arqapl.o20f21.semana1.model;

import ec.edu.utpl.arqapl.o20f21.semana1.cita.Citable;

public class Paper extends ObraLiteraria {
    private String doi;
    private String pages;
    private String month;

    public Paper(String titulo, int anio, String doi) {
        super(titulo, anio);
        this.doi = doi;
    }

    public String getDoi() {
        return doi;
    }

    public String getPages() {
        return pages;
    }

    public String getMonth() {
        return month;
    }

    @Override
    public String citar(Citable formatCita) {
        return formatCita.citar(this);
    }
}
