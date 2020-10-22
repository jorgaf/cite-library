package ec.edu.utpl.arqapl.o20f21.semana1.model;

public class Editorial {
    private String nombre;
    private String ciudad;

    public Editorial(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
}
