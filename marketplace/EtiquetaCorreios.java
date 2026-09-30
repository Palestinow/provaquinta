package marketplace;

public class EtiquetaCorreios extends EtiquetaEnvio {

    public String cep;

    @Override
    public String gerar() {
        return "Etiqueta dos Correios | CEP: " + cep;
    }
}
