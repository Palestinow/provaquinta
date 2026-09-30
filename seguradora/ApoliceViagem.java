package seguradora;

public class ApoliceViagem extends Apolice {

    public int diasViagem;
    public boolean internacional;
    public double coberturaAssistenciaUsd;
    public boolean temPassaporte;

    @Override
    public double calcularPremio() {
        double premio = this.diasViagem * 15.0;
        if (this.internacional) {
            premio = premio + 100.0;
        }
        return premio;
    }

    @Override
    public boolean validarCobertura() {
        if (this.internacional) {
            return this.coberturaAssistenciaUsd >= 30000 && this.temPassaporte;
        }
        return true;
    }

    @Override
    public String listarDocumentos() {
        String docs = "Itinerário de viagem";
        if (this.internacional) {
            docs = docs + ", Passaporte";
        }
        return docs;
    }
}
