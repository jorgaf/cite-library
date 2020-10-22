package ec.edu.utpl.arqapl.o20f21.semana1.cita;

import ec.edu.utpl.arqapl.o20f21.semana1.model.Autor;
import ec.edu.utpl.arqapl.o20f21.semana1.model.Libro;
import ec.edu.utpl.arqapl.o20f21.semana1.model.ObraLiteraria;
import ec.edu.utpl.arqapl.o20f21.semana1.model.Paper;

import java.util.List;
import java.util.stream.Collectors;

//Consulte: Patrones de diseño: Strategy
public class APA implements Citable {
    @Override
    public String citar(ObraLiteraria obra) {
        if( obra instanceof Libro ) {
            Libro libro = (Libro)obra;
            String autores = libro.getAutores().stream()
                    .map(Autor::obtenerNSimplificado)
                    .collect(Collectors.joining(", "));
            return String.format("%s (%d). %s. %s",
                    autores,
                    libro.getAnio(),
                    libro.getTitulo(),
                    libro.getEditorial().getNombre());
        } else if ( obra instanceof Paper) {
            //Generar cita de paper
            return "Paper, APA style";
        }

        return "NO found";
    }
}
