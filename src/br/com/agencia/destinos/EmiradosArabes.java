package br.com.agencia.destinos;

public class EmiradosArabes implements Pais {

    @Override
    public String obterNomeMoeda() {
        return "Dirham dos Emirados Árabes Unidos (AED ou )";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Supondo que 1 Real vale aproximadamente 23 Vatu
        return valorEmReais * 1.38;
    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("- Pontos de ônibus com ar-condicionado: Devido ao calor extremo do deserto, as paradas públicas são fechadas e climatizadas...");
        System.out.println("- População majoritariamente estrangeira: Cerca de 85% das pessoas que moram no país são imigrantes, não cidadãos locais...");
    }
}