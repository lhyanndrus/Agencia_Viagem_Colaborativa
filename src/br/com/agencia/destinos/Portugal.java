package br.com.agencia.destinos;

public class Portugal implements Pais{

    @Override
    public String obterNomeMoeda() {

        return "Euro(€)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Supondo que 1 Real vale aproximadamente 23 Vatu
        return valorEmReais * 0,16666666666666666666666666666667;
    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("- 1. O país mais antigo da EuropaPortugal tem as mesmas fronteiras definidas desde o ano de 1139 [1]. Isso faz dele o Estado-nação mais antigo de todo o continente europeu.");
        System.out.println("2. O chá das cinco é uma invenção portuguesaA tradição britânica do chá das cinco nasceu por causa de uma portuguesa. A Princesa Catarina de Bragança introduziu o hábito na corte inglesa em 1662 ao se casar com o Rei Carlos II.");
    }
}
