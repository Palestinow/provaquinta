package marketplace;

public class NotaFiscalAlemanha extends DocumentoFiscal {

    public boolean produtoEssencial;

    @Override
    public String gerar() {
        double imposto = 19.0;
        if (produtoEssencial) {
            imposto = 7.0;
        }
        return "Nota Fiscal da Alemanha | Imposto sobre valor agregado " + imposto + "% | Identificação fiscal: DE123456789";
    }
}
