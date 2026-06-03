package br.com.agencia.destinos;

public class Japao implements Pais{
    @Override
    public String obterNomeMoeda(){
        return "Iene do Japão (¥)";
    }
    @Override
    public double converterParaMoedaLocal(double valorEmReais){
        return valorEmReais * 31.62;
    }
    @Override
    public void exibirDicaCultural(){
        System.out.println("Ao visitar o Japão, nunca espete os palitinhos (hashi) verticalmente na tigela de arroz, pois esse gesto imita um ritual fúnebre budista; em vez disso, apoie-os sempre horizontalmente sobre o suporte apropriado (hashioki).");
        System.out.println("\nCURIOSIDADE: No Japão, o conceito de Kintsugi (金継ぎ) consiste em consertar cerâmicas quebradas com ouro líquido, transformando as cicatrizes do objeto em sua parte mais bela e valiosa.");
    }
}
