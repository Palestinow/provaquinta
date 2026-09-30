package seguradora;

public class ApoliceResidencial extends Apolice {

    public double valorImovel;
    public boolean altoPadrao;
    public boolean temEscritura;

    @Override
    public double calcularPremio() {
        double premioAnual = this.valorImovel * 0.015;
        if (this.altoPadrao) {
            premioAnual = premioAnual * 1.25;
        }
        return premioAnual / 12;
    }

    @Override
    public boolean validarCobertura() {
        return this.temEscritura;
    }

    @Override
    public String listarDocumentos() {
        return "Escritura ou contrato de locação, Comprovante de residência";
    }
}
