package marketplace;

public class PagamentoEUA extends ProcessadorPagamento {

    @Override
    public String processar() {
        return "Pagamento com Cartão de Crédito (com verificação de endereço)";
    }
}
