package seguradora;

public class EmissorViagem extends EmissorApolice {

    public int diasViagem;
    public boolean internacional;
    public double coberturaAssistenciaUsd;
    public boolean temPassaporte;

    @Override
    public Apolice criarApolice() {
        ApoliceViagem apolice = new ApoliceViagem();
        apolice.segurado = this.segurado;
        apolice.diasViagem = this.diasViagem;
        apolice.internacional = this.internacional;
        apolice.coberturaAssistenciaUsd = this.coberturaAssistenciaUsd;
        apolice.temPassaporte = this.temPassaporte;
        return apolice;
    }

    @Override
    public String getPrefixo() {
        return "VIA-";
    }
}
