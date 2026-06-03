package br.com.agencia.destinos;

public class Paraguai implements Pais{
    @Override
    public String obterNomeMoeda() {
        return "Guarani Paraguaio (PYG)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Supondo que 1 Real vale aproximadamente 1208.61
        return valorEmReais * 1208.61;
    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("- É um dos únicos países do mundo que possui uma bandeira com dois lados diferentes (o brasão da frente é diferente do de trás).");
        System.out.println("- O guarani é língua oficial junto com o espanhol, sendo falado por mais de 80% da população.");
    }
}
