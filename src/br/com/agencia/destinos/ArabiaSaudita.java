package br.com.agencia.destinos;

public class ArabiaSaudita implements Pais{
    @Override
    public String obterNomeMoeda() {
        return "Riyal Saudita (SAR)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Cotação atual: 1 BRL vale aproximadamente 0.74 SAR
        return valorEmReais * 0.74;
    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("- Cidade em linha reta: O país está construindo a The Line, uma cidade futurista totalmente linear com 170 km de extensão, sem carros ou ruas, cercada por espelhos no meio do deserto.");
        System.out.println("- O maior relógio do mundo: Em Meca, fica o maior mostrador de relógio do planeta; ele é 35 vezes maior que o Big Ben de Londres e pode ser visto a quilômetros de distância.");
    }
}
