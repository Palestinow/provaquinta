package seguradora;

public class Cliente {

    public EmissorApolice solicitar(String tipo) {
        if (tipo.equals("AUTO")) {
            return new EmissorAuto();
        }
        if (tipo.equals("RESIDENCIAL")) {
            return new EmissorResidencial();
        }
        if (tipo.equals("VIDA")) {
            return new EmissorVida();
        }
        if (tipo.equals("VIAGEM")) {
            return new EmissorViagem();
        }
        return null;
    }
}
