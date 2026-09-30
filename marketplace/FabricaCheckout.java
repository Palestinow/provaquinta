package marketplace;

public abstract class FabricaCheckout {

    public abstract DocumentoFiscal criarDocumentoFiscal();
    public abstract ProcessadorPagamento criarProcessadorPagamento();
    public abstract EtiquetaEnvio criarEtiquetaEnvio();

    public String processarPedido() {
        DocumentoFiscal documento = criarDocumentoFiscal();
        ProcessadorPagamento pagamento = criarProcessadorPagamento();
        EtiquetaEnvio etiqueta = criarEtiquetaEnvio();

        return "=== RELATÓRIO DO PEDIDO ===\n"
             + "Documento Fiscal : " + documento.gerar() + "\n"
             + "Pagamento        : " + pagamento.processar() + "\n"
             + "Etiqueta de Envio: " + etiqueta.gerar();
    }
}
