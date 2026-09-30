package seguradora;

public abstract class Apolice {

    public String segurado;
    public String numeroApolice;
    public double premio;

    public abstract double calcularPremio();
    public abstract boolean validarCobertura();
    public abstract String listarDocumentos();

    public String gerarResumo() {
        return "Apólice: " + this.numeroApolice + "\n"
             + "Segurado: " + this.segurado + "\n"
             + "Prêmio: R$ " + String.format("%.2f", this.premio) + "\n"
             + "Documentos: " + this.listarDocumentos();
    }
}
