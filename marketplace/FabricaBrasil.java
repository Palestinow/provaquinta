package marketplace;

public class FabricaBrasil extends FabricaCheckout {
    public boolean interestadual;
    public boolean usarPix;
    public String cep;

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        NotaFiscalBrasil doc = new NotaFiscalBrasil();
        doc.interestadual = this.interestadual;
        return doc;
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        PagamentoBrasil pag = new PagamentoBrasil();
        pag.usarPix = this.usarPix;
        return pag;
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        EtiquetaCorreios etq = new EtiquetaCorreios();
        etq.cep = this.cep;
        return etq;
    }
}
