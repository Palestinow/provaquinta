package seguradora;

public class EmissorResidencial extends EmissorApolice {

    public double valorImovel;
    public boolean altoPadrao;
    public boolean temEscritura;

    @Override
    public Apolice criarApolice() {
        ApoliceResidencial apolice = new ApoliceResidencial();
        apolice.segurado = this.segurado;
        apolice.valorImovel = this.valorImovel;
        apolice.altoPadrao = this.altoPadrao;
        apolice.temEscritura = this.temEscritura;
        return apolice;
    }

    @Override
    public String getPrefixo() {
        return "RES-";
    }
}
