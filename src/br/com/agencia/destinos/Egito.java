package br.com.agencia.destinos;

public class Egito implements Pais {

    @Override
    public String obterNomeMoeda() {
        return "Egi de Egito (EGI)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Supondo que 1 Real vale aproximadamente 23 Vatu
        return valorEmReais * 10.23;
    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("-O país guarda mistérios arquitetônicos");
        System.out.println("- O seu maior rio é o Nilo.");
    }
}
