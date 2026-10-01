package provadeles;

public class apoliceResidencial extends apolice {
    public double valorImovel;

    @Override
    public double calcularPremio() {
        double premioAnual = this.valorImovel * 0.015;
        return premioAnual / 12;
    }

    @Override
    public String listarDocumentos() {
        return "Escritura ou Contrato de locação";
    }

}
