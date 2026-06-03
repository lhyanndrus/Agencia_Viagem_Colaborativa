package br.com.agencia.destinos;

public class Vanuatu implements Pais {

    @Override
    public String obterNomeMoeda() {
        return "Vatu de Vanuatu (VUV)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Supondo que 1 Real vale aproximadamente 23 Vatu
        return valorEmReais * 23.00;
    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("- é um arquipélago com 83 ilhas formado por vulcões ativos..");
        System.out.println("- Eleito um dos países mais felizes do mundo, destaca-se por sua altíssima diversidade cultural (com mais de 100 línguas nativas).");
    }
}
