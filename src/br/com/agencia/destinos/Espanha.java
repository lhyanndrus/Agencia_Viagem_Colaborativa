package br.com.agencia.destinos;

public class Espanha implements Pais {

    @Override
    public String obterNomeMoeda() {
        return "Euro(€)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Supondo que 1 Real vale aproximadamente 23 Vatu
        return valorEmReais / 5.85;
    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("- É o único país da Europa que possui fronteiras terrestres diretas com o continente africano.");
        System.out.println("- Tem o festival de comida mais famoso do mundo, onde as pessoas atiram toneladas de tomates.");
    }
}
