package br.com.agencia.destinos;

public class PaisFactory {
    public static Pais obterDestino(String comando) {
        try {
            // Mapeia o comando de 3 letras para o nome da Classe que o aluno vai criar
            String nomeClasse = switch (comando.toLowerCase()) {
                // América do Sul
                case "arg" -> "Argentina";
                case "chi" -> "Chile";
                case "col" -> "Colombia";
                case "uru" -> "Uruguai";
                case "par" -> "Paraguai";

                // América do Norte / Central
                case "usa" -> "EstadosUnidos";
                case "can" -> "Canada";
                case "mex" -> "Mexico";

                // Europa
                case "ing" -> "Inglaterra";
                case "fra" -> "Franca";
                case "ita" -> "Italia";
                case "ale" -> "Alemanha";
                case "por" -> "Portugal";
                case "esp" -> "Espanha";

                // Ásia / Oceania
                case "jap" -> "Japao";
                case "chn" -> "China";
                case "cor" -> "CoreiaDoSul";
                case "aus" -> "Australia";
                case "nzl" -> "NovaZelandia";
                case "ind" -> "India";
                case "van" -> "Vanuatu";

                // África / Oriente Médio
                case "afr" -> "AfricaDoSul";
                case "egi" -> "Egito";
                case "mar" -> "Marrocos";
                case "ara" -> "ArabiaSaudita";
                case "eua" -> "EmiradosArabes";

                default -> null;
            };

            if (nomeClasse == null) return null;

            // Busca dinamicamente a classe criada pelo aluno
            return (Pais) Class.forName("br.com.agencia.destinos." + nomeClasse)
                    .getDeclaredConstructor()
                    .newInstance();
        } catch (ClassNotFoundException e) {
            // Se o aluno ainda não enviou a classe via branch, retorna null silenciosamente
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
