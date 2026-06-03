package br.com.agencia.destinos;

public class Franca implements Pais{

    @Override
    public String obterNomeMoeda() {
        return "Euro (EUR)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Supondo que 1 Real vale aproximadamente 23 Vatu
        return valorEmReais / 5.90;
    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("- Devido aos seus territórios ultramarinos espalhados pelo globo, a França possui 13 fusos horários diferentes");
        System.out.println("- Franca possui diversas guianas e faz divisa com o Brasil.");
    }
}

