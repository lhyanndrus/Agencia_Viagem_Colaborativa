package br.com.agencia.destinos;

public class Australia implements Pais{
    @Override
    public String obterNomeMoeda() {
        return "Dólar Australiano (AUD)";
    }

    @Override
    public double converterParaMoedaLocal(double valorEmReais) {
        return valorEmReais / 3.63;
    }

    @Override
    public void exibirDicaCultural() {
        System.out.println("- Existem cerca de 50 milhões de cangurus espalhados pelo país, enquanto a população humana é de aproximadamente 26 milhões.");
        System.out.println("- O litoral australiano é tão vasto que possui mais de 10.000 praias.");
    }
}