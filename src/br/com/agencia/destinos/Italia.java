package br.com.agencia.destinos;

public class Italia implements Pais {

    @Override
    public String obterNomeMoeda() {
        return "Euro (€)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Supondo que 1 Real vale aproximadamente 23 Vatu
        return valorEmReais / 5.9;
    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("- Abriga o menor estado independente do mundo (o Vaticano, encravado em Roma)");
        System.out.println("- Possui os únicos vulcões ativos da Europa continental (Etna, Stromboli e Vesúvio).");
    }
}
