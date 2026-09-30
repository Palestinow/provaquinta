package marketplace;

public class PagamentoBrasil extends ProcessadorPagamento {

    public boolean usarPix;

    @Override
    public String processar() {
        if (usarPix) {
            return "Pagamento via Pix (desconto de 5%)";
        }
        return "Pagamento via Boleto (compensação em 3 dias úteis)";
    }
}
