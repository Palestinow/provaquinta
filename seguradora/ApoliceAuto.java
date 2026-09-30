package seguradora;

public class ApoliceAuto extends Apolice {

    public double valorFipe;
    public int idadeCondutor;
    public int anosHabilitacao;
    public double coberturaTerceiros;

    @Override
    public double calcularPremio() {
        double premioAnual = this.valorFipe * 0.08;
        if (this.idadeCondutor < 25) {
            premioAnual = premioAnual * 1.3;
        }
        if (this.anosHabilitacao < 2) {
            premioAnual = premioAnual * 1.2;
        }
        return premioAnual / 12;
    }

    @Override
    public boolean validarCobertura() {
        return this.coberturaTerceiros >= 50000;
    }

    @Override
    public String listarDocumentos() {
        return "CNH, CRLV, Comprovante de residência";
    }
}
