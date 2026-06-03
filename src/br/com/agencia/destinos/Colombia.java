package br.com.agencia.destinos;

public class Colombia implements Pais {
    @Override
    public String obterNomeMoeda() {
        return "Peso colombiano - Colômbia";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        return valorEmReais * 704.39;
    }

    @Override
    public void exibirDicaCultural() {
        System.out.println("-> País mais biodiverso por metro quadrado: A Colômbia abriga cerca de 10% da biodiversidade do planeta e possui o maior número de espécies de aves e orquídeas do mundo.");
        System.out.println("-> Hino nacional obrigatório por lei: Todas as estações de rádio e canais de televisão públicos do país são obrigados por lei a tocar o hino nacional diariamente às 6h e às 18h.");
    }
}
