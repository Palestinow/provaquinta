package marketplace;

public class EtiquetaCorreiosAlemanha extends EtiquetaEnvio {

    public String codigoPostal;

    @Override
    public String gerar() {
        return "Etiqueta dos Correios Alemães | Código Postal: " + codigoPostal;
    }
}
