package seguradora;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        EmissorAuto emissorAuto = (EmissorAuto) cliente.solicitar("AUTO");
        emissorAuto.segurado = "João Pereira";
        emissorAuto.valorFipe = 60000;
        emissorAuto.idadeCondutor = 22;
        emissorAuto.anosHabilitacao = 1;
        emissorAuto.coberturaTerceiros = 50000;
        System.out.println(emissorAuto.processarContratacao());
        System.out.println();

        EmissorResidencial emissorResidencial = (EmissorResidencial) cliente.solicitar("RESIDENCIAL");
        emissorResidencial.segurado = "Maria Souza";
        emissorResidencial.valorImovel = 800000;
        emissorResidencial.altoPadrao = true;
        emissorResidencial.temEscritura = true;
        System.out.println(emissorResidencial.processarContratacao());
        System.out.println();

        EmissorVida emissorVida = (EmissorVida) cliente.solicitar("VIDA");
        emissorVida.segurado = "Carlos Lima";
        emissorVida.idadeSegurado = 40;
        emissorVida.capitalSegurado = 600000;
        emissorVida.fumante = false;
        emissorVida.temAtestadoMedico = true;
        System.out.println(emissorVida.processarContratacao());
        System.out.println();

        EmissorViagem emissorViagem = (EmissorViagem) cliente.solicitar("VIAGEM");
        emissorViagem.segurado = "Ana Torres";
        emissorViagem.diasViagem = 10;
        emissorViagem.internacional = true;
        emissorViagem.coberturaAssistenciaUsd = 35000;
        emissorViagem.temPassaporte = true;
        System.out.println(emissorViagem.processarContratacao());
        System.out.println();

        EmissorViagem emissorViagemRejeitada = (EmissorViagem) cliente.solicitar("VIAGEM");
        emissorViagemRejeitada.segurado = "Pedro Alves";
        emissorViagemRejeitada.diasViagem = 5;
        emissorViagemRejeitada.internacional = true;
        emissorViagemRejeitada.coberturaAssistenciaUsd = 35000;
        emissorViagemRejeitada.temPassaporte = false;
        System.out.println(emissorViagemRejeitada.processarContratacao());
    }
}
