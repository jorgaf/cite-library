package ec.edu.utpl.arqapl.o20f21.semana1;

import ec.edu.utpl.arqapl.o20f21.semana1.cita.APA;
import ec.edu.utpl.arqapl.o20f21.semana1.cita.ISO690;
import ec.edu.utpl.arqapl.o20f21.semana1.cita.MLA;
import ec.edu.utpl.arqapl.o20f21.semana1.model.Autor;
import ec.edu.utpl.arqapl.o20f21.semana1.model.Editorial;
import ec.edu.utpl.arqapl.o20f21.semana1.model.Libro;
import ec.edu.utpl.arqapl.o20f21.semana1.model.ObraLiteraria;

public class Runner {
    public static void main(String[] args) {

    }

    public static void exec1() {
        Libro cleanArch = new Libro("Clean Architectura", 2018, "123-321-456");
        Autor martinR = new Autor("Martin", "Robert");
        Editorial editorial = new Editorial("Prentice Hall", "México");
        cleanArch.addAutor(martinR);
        cleanArch.setEditorial(editorial);
        APA apaStyle = new APA();
        System.out.println(cleanArch.citar(apaStyle));
        MLA mlaStyle = new MLA();
        System.out.println(cleanArch.citar(mlaStyle));
    }

    public static void exec2() {
        Libro firstCourseNS = new Libro("A First Course in Network Science", 2020, "978-1-108-47113-8");
        Editorial editorial = new Editorial("Cambridge Press", "Cambridge");
        firstCourseNS.addAutor(new Autor("Menczer", "Filippo"));
        firstCourseNS.addAutor(new Autor("Fortunato", "Santo"));
        firstCourseNS.addAutor(new Autor("Davis", "Clayton"));
        firstCourseNS.setEditorial(editorial);
        APA apaStyle = new APA();
        System.out.println(firstCourseNS.citar(apaStyle));
    }
}
