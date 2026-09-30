package seguradora;

public class EmissorAuto extends EmissorApolice {

    public double valorFipe;
    public int idadeCondutor;
    public int anosHabilitacao;
    public double coberturaTerceiros;

    @Override
    public Apolice criarApolice() {
        ApoliceAuto apolice = new ApoliceAuto();
        apolice.segurado = this.segurado;
        apolice.valorFipe = this.valorFipe;
        apolice.idadeCondutor = this.idadeCondutor;
        apolice.anosHabilitacao = this.anosHabilitacao;
        apolice.coberturaTerceiros = this.coberturaTerceiros;
        return apolice;
    }

    @Override
    public String getPrefixo() {
        return "AUTO-";
    }
}
