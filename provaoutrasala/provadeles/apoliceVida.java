package provadeles;

public class apoliceVida extends apolice {
    public double valorCobertura;

    @Override
    public double calcularPremio() {
        double premioAnual = this.valorCobertura * 0.03;
        return premioAnual / 12;
    }

    @Override
    public String listarDocumentos() {
        return "documento de Identidade e CPF";
    }

}
