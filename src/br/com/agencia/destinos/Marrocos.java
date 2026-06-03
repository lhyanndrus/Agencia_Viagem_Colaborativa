package br.com.agencia.destinos;

public class Marrocos implements Pais {

    @Override
    public String obterNomeMoeda() {
        return "Dirham marroquino (DH)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Supondo que 1 Real vale aproximadamente 1,28 Dirham
        return valorEmReais * 1.81;
    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("- Ao invés do tradicional coração eles se referenciam ao fígado para relações de afeto, por exemplo: \"Você oucupa meu fígado\" seria o mesmo que \"Você mora no meu coração\"");
        System.out.println("- Eles possuem a Universidade de Al Quaraouiyine, a universidade mais antiga do mundo ainda em funcionamento. Ela foi fundada por Fátima al-Fihri em 859 d.C.");
    }
}

