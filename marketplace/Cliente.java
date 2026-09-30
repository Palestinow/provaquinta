package marketplace;

public class Cliente {

    public FabricaCheckout solicitar(String pais) {
        if (pais.equals("BRASIL")) {
            return new FabricaBrasil();
        }
        if (pais.equals("EUA")) {
            return new FabricaEUA();
        }
        if (pais.equals("ALEMANHA")) {
            return new FabricaAlemanha();
        }
        return null;
    }
}
