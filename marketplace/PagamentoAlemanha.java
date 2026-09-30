package marketplace;

public class PagamentoAlemanha extends ProcessadorPagamento {

    @Override
    public String processar() {
        return "Pagamento via Débito Direto Europeu";
    }
}
