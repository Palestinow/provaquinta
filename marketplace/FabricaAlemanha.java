package marketplace;

public class FabricaAlemanha extends FabricaCheckout {
    public boolean produtoEssencial;
    public String codigoPostal;

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        NotaFiscalAlemanha doc = new NotaFiscalAlemanha();
        doc.produtoEssencial = this.produtoEssencial;
        return doc;
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoAlemanha();
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        EtiquetaCorreiosAlemanha etq = new EtiquetaCorreiosAlemanha();
        etq.codigoPostal = this.codigoPostal;
        return etq;
    }
}
