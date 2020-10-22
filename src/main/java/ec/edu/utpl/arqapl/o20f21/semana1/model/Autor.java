package ec.edu.utpl.arqapl.o20f21.semana1.model;

public class Autor {
    private String apellido;
    private String nombre;

    public Autor(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String obtenerNCompleto() {
        return String.format("%s, %s.", apellido, nombre);
    }

    public String obtenerNSimplificado(){
        return String.format("%s, %s.",
                apellido,
                nombre.charAt(0));
    }
}
