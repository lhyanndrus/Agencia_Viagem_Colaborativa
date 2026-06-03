package br.com.agencia.destinos;

public class Chile implements Pais{
    @Override
    public String obterNomeMoeda() {
        return "Peso Chileno - CLP";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        return valorEmReais * 176.78;
    }

    @Override
    public void exibirDicaCultural() {
        System.out.println("É o país mais longo do mundo (4.270 km) e abriga o Atacama, o deserto mais seco do planeta.");
        System.out.println("Vinho Carmenère: Uma uva francesa extinta na Europa que \"sobreviveu\" e redescberta no Chile, tornando-se o símbolo do vinho chileno.");
    }
}
