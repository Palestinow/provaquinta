package marketplace;

public class NotaFiscalEUA extends DocumentoFiscal {

    public String estado;

    @Override
    public String gerar() {
        double imposto;
        if (estado.equals("CA")) {
            imposto = 7.25;
        } else if (estado.equals("TX")) {
            imposto = 6.25;
        } else {
            imposto = 0.0;
        }
        return "Nota Fiscal dos EUA | Imposto sobre vendas " + imposto + "% | Identificação do vendedor: 12-3456789";
    }
}
