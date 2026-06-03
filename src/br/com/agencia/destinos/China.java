package br.com.agencia.destinos;

public class China implements Pais{

    @Override
    public String obterNomeMoeda() {
        return "Renminbi (RMB)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        // Exemplo de cotação fictícia ou real pesquisar no site
        // Supondo que 1 Real vale aproximadamente 23 Vatu
        return valorEmReais * 1.33;    }

    @Override
    public void exibirDicaCultural() {

        // Pesquisar 2 curiosidades do pais
        System.out.println("- A China inteira tem só um fuso horário. No oeste do país, o sol nasce às 10h da manhã.");
        System.out.println("- A Grande Muralha foi colada com uma mistura de cal e arroz grudento, o que evitou desabamentos por séculos.");
    }
}