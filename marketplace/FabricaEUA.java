package marketplace;

public class FabricaEUA extends FabricaCheckout {
    public String estado;
    public String codigoPostal;

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        NotaFiscalEUA doc = new NotaFiscalEUA();
        doc.estado = this.estado;
        return doc;
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoEUA();
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        EtiquetaCorreiosEUA etq = new EtiquetaCorreiosEUA();
        etq.codigoPostal = this.codigoPostal;
        return etq;
    }
}
