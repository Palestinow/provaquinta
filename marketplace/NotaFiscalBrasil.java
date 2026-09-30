package marketplace;

public class NotaFiscalBrasil extends DocumentoFiscal {

    public boolean interestadual;

    @Override
    public String gerar() {
        String cfop = "5.102";
        double icms = 18.0;
        if (interestadual) {
            cfop = "6.102";
            icms = 12.0;
        }
        String chave = "35250912345678901234567890123456789012345678";
        return "Nota Fiscal Eletrônica | CFOP " + cfop + " | ICMS " + icms + "% | Chave: " + chave;
    }
}
