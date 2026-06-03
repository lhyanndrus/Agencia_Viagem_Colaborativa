package br.com.agencia.destinos;

public class India implements Pais{

    @Override
    public String obterNomeMoeda() {
        return "Rupia indiana (INR)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Supondo que 1 Real vale aproximadamente 23 Vatu
        return valorEmReais * .053;
    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("- é a nação mais populosa e a quinta maior economia do mundo, localizada no sul da Ásia.");
        System.out.println("- Famosa por sua grande diversidade cultural, religiosa e linguística, destaca-se globalmente tanto como um polo de tecnologia e crescimento econômico quanto pelo rico legado de civilizações milenares.");
    }
}
