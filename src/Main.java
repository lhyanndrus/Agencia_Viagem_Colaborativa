import br.com.agencia.destinos.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        System.out.println("=================================================");
        System.out.println("     SISTEMA INTERNACIONAL DE VIAGENS v1.0       ");
        System.out.println("=================================================");

        while (executando) {
            System.out.println("\nDigite o código de 3 letras do destino (ex: usa, jap, fra, arg) ou 'sair':");
            System.out.print("Destino desejado: ");
            String comando = scanner.next();

            if (comando.equalsIgnoreCase("sair")) {
                executando = false;
                System.out.println("\nObrigado por usar nossa agência. Boa viagem!");
                break;
            }

            // Tenta carregar o destino via Factory (Reflection)
            Pais destino = PaisFactory.obterDestino(comando);

            if (destino != null) {
                System.out.print("Digite a quantidade de dinheiro em Reais (R$) para simular a viagem: ");
                double reais = scanner.nextDouble();

                System.out.println("\n-------------------------------------------------");
                System.out.println("✈️ INFORMAÇÕES DO DESTINO:");
                System.out.println("Moeda Local: " + destino.obterNomeMoeda());

                double valorConvertido = destino.converterParaMoedaLocal(reais);
                System.out.printf("Cotação Simulada: R$ %.2f equivalem a %.2f em %s\n",
                        reais, valorConvertido, destino.obterNomeMoeda());

                System.out.println("\n💡 DICA CULTURAL/TURÍSTICA:");
                destino.exibirDicaCultural();
                System.out.println("-------------------------------------------------");
            } else {
                System.out.println("\n[AVISO]: Destino indisponível ou pacote de viagem ainda não implementado!");
            }
        }
        scanner.close();
    }
}