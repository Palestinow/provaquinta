package provadeles;

public class apoliceAuto extends apolice {
    public double valorVeiculo;

       public double calcularPremio() {
        double premioAnual = this.valorVeiculo * 0.08;
        return premioAnual / 12;
    }

    @Override
    public String listarDocumentos() {
        return "CNH e CRLV";
    }
    
}
