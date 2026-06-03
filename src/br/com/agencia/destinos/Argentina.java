package br.com.agencia.destinos;

public class Argentina implements Pais {
    @Override
    public String obterNomeMoeda() {
        return "Peso Argentino (ARS)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        return valorEmReais * 283.24;
    }

    @Override
    public void exibirDicaCultural() {
        System.out.println("combina a partilha do chimarrão, a paixão pelo futebol e o hábito de saborear o tradicional " +
                "churrasco ou empanadas em conversas que se estendem até a madrugada.");
    }
}
