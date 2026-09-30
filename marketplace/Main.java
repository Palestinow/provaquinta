package marketplace;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        FabricaBrasil fabricaBR = (FabricaBrasil) cliente.solicitar("BRASIL");
        fabricaBR.interestadual = true;
        fabricaBR.usarPix = true;
        fabricaBR.cep = "01310-100";
        System.out.println(fabricaBR.processarPedido());
        System.out.println();

        FabricaEUA fabricaUS = (FabricaEUA) cliente.solicitar("EUA");
        fabricaUS.estado = "CA";
        fabricaUS.codigoPostal = "90210-1234";
        System.out.println(fabricaUS.processarPedido());
        System.out.println();

        FabricaAlemanha fabricaDE = (FabricaAlemanha) cliente.solicitar("ALEMANHA");
        fabricaDE.produtoEssencial = false;
        fabricaDE.codigoPostal = "10115";
        System.out.println(fabricaDE.processarPedido());
    }
}
