package provadeles;

public abstract class apolice {

    public String segurado;
    public String tipoApolice;
    public double premioMensal;
    public String documentos;


    public abstract double calcularPremio();
    public abstract String listarDocumentos();

    public String gerarResumo() {
        return "Apólice: " + this.tipoApolice + "\n"
             + "Segurado: " + this.segurado + "\n"
             + "Prêmio mensal: R$ " + String.format("%.2f", this.premioMensal) + "\n"
             + "Documentos: " + this.listarDocumentos();
    }
}