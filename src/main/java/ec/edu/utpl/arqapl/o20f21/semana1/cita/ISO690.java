package ec.edu.utpl.arqapl.o20f21.semana1.cita;

import ec.edu.utpl.arqapl.o20f21.semana1.model.ObraLiteraria;

public class ISO690 implements Citable {
    @Override
    public String citar(ObraLiteraria obra) {
        return "ISO690 style";
    }
}
