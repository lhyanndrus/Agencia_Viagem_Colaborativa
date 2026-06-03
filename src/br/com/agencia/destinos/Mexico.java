package br.com.agencia.destinos;

public class Mexico implements Pais {

    @Override
    public String obterNomeMoeda() {
        return "Peso mexicano (Mex$)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Supondo que 1 Real vale aproximadamente 3.41 Pesos mexicanos
        return valorEmReais * 3.41;
    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("- Abriga a maior pirâmide do planeta (em volume) em Cholula.");
        System.out.println("- Embora o espanhol seja a língua predominante, o país não possui um idioma oficial, reconhecendo 68 línguas nativas.");
    }
}
