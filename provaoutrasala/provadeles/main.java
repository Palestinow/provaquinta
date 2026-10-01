package provadeles;
public class main {
    public static void main(String[] args) {
        
        apoliceVida vida = new apoliceVida();
        vida.segurado = "João";
        vida.tipoApolice = "Vida";
        vida.valorCobertura = 100000;
        vida.premioMensal = vida.calcularPremio();

            System.out.println(vida.gerarResumo());


        apoliceResidencial residencial = new apoliceResidencial();
        residencial.segurado = "Maria";
        residencial.tipoApolice = "Residencial";
        residencial.valorImovel = 500000;
        residencial.premioMensal = residencial.calcularPremio();

            System.out.println(residencial.gerarResumo());


        apoliceAuto auto = new apoliceAuto();
        auto.segurado = "Carlos";
        auto.tipoApolice = "Auto";
        auto.valorVeiculo = 30000;
        auto.premioMensal = auto.calcularPremio();

            System.out.println(auto.gerarResumo());
    }
}
