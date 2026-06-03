package br.com.agencia.destinos;

public class NovaZelandia implements Pais {

    @Override
    public String obterNomeMoeda() {
        return "Dólar neozelandês da Nova Zelandia ($)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Supondo que 1 Real vale aproximadamente 23 Vatu

        return valorEmReais * 0.34;
    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("- Nenhum ponto do território da Nova Zelândia fica a mais de 128 quilômetros de distância do oceano. O país é tão estreito e cercado por água que você consegue ir das montanhas nevadas até a praia no mesmo dia");
        System.out.println("- O país tem um histórico histórico de igualdade de gênero. Em 1893, a Nova Zelândia tornou-se a primeira nação autônoma do mundo a garantir o direito de voto às mulheres.).");
    }
}
