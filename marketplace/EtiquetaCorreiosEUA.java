package marketplace;

public class EtiquetaCorreiosEUA extends EtiquetaEnvio {

    public String codigoPostal;

    @Override
    public String gerar() {
        return "Etiqueta dos Correios Americanos | Código Postal: " + codigoPostal;
    }
}
