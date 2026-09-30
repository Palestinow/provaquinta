package seguradora;

public class ApoliceVida extends Apolice {

    public int idadeSegurado;
    public double capitalSegurado;
    public boolean fumante;
    public boolean temAtestadoMedico;

    @Override
    public double calcularPremio() {
        double premioMensal = (this.idadeSegurado * 12) + (this.capitalSegurado * 0.002);
        if (this.fumante) {
            premioMensal = premioMensal * 1.5;
        }
        return premioMensal;
    }

    @Override
    public boolean validarCobertura() {
        if (this.capitalSegurado > 500000 && !this.temAtestadoMedico) {
            return false;
        }
        return true;
    }

    @Override
    public String listarDocumentos() {
        String docs = "Documento de identidade, CPF";
        if (this.capitalSegurado > 500000) {
            docs = docs + ", Atestado médico";
        }
        return docs;
    }
}
