package seguradora;

public abstract class EmissorApolice {

    private static int contador = 0;
    public String segurado;

    public abstract Apolice criarApolice();
    public abstract String getPrefixo();

    public String processarContratacao() {
        Apolice apolice = this.criarApolice();

        if (!apolice.validarCobertura()) {
            return "Contratação REJEITADA: cobertura ou documentação insuficiente.";
        }

        contador = contador + 1;
        apolice.numeroApolice = this.getPrefixo() + contador;
        apolice.premio = apolice.calcularPremio();

        return apolice.gerarResumo();
    }
}
