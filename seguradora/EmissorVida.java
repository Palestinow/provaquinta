package seguradora;

public class EmissorVida extends EmissorApolice {

    public int idadeSegurado;
    public double capitalSegurado;
    public boolean fumante;
    public boolean temAtestadoMedico;

    @Override
    public Apolice criarApolice() {
        ApoliceVida apolice = new ApoliceVida();
        apolice.segurado = this.segurado;
        apolice.idadeSegurado = this.idadeSegurado;
        apolice.capitalSegurado = this.capitalSegurado;
        apolice.fumante = this.fumante;
        apolice.temAtestadoMedico = this.temAtestadoMedico;
        return apolice;
    }

    @Override
    public String getPrefixo() {
        return "VID-";
    }
}
