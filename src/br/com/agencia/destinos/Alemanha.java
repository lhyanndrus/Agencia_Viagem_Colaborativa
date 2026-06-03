package br.com.agencia.destinos;

public class Alemanha implements Pais {

    @Override
    public String obterNomeMoeda() {
        return "Euro (€)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        return valorEmReais * 0.17;
    }

    @Override
    public void exibirDicaCultural() {

        System.out.println("- Na região da Baviera, a cerveja é tão enraizada na cultura que é oficialmente classificada pelo governo como um alimento (e não apenas uma bebida).");
        System.out.println("- Mais de 400 zoológicos e parques de animais registrados operam na Alemanha, que se acredita ser o maior número em qualquer país do mundo.");
    }
}