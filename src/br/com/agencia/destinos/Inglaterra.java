package br.com.agencia.destinos;

public class Inglaterra implements Pais {

    @Override
    public String obterNomeMoeda() {
        return "Libras Esterlina (GBP)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Supondo que 1 Real vale aproximadamente 23 Vatu
        return valorEmReais * 6.75;
    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("-  Por causa da sua natureza insular, em qualquer ponto da Inglaterra você nunca estará a mais de 115 km do litoral.");
        System.out.println("-  Passear ou fazer piqueniques em cemitérios é um hábito bastante comum e tranquilo no país.");
    }
}
