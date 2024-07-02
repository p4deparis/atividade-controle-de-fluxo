

public class Contador {
    
    public static void main(String[] args) throws Exception {
        try {
            // Verifica se foram passados exatamente dois parâmetros
            if (args.length != 2) {
                throw new Exception("Exatamente dois parâmetros são necessários.");
            }

            // Converte os argumentos para inteiros
            int parametro1 = Integer.parseInt(args[0]);
            int parametro2 = Integer.parseInt(args[1]);

            // Verifica se o primeiro parâmetro é maior que o segundo
            if (parametro1 > parametro2) {
                throw new Exception("O segundo parâmetro deve ser maior ou igual ao primeiro.");
            }

            // Imprime os números no intervalo especificado
            for (int i = parametro1; i <= parametro2; i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (ParametrosInvalidosException e) {
            // Captura a exceção de parâmetros inválidos e exibe a mensagem de erro específica
            System.err.println("Erro ao processar os parâmetros: " + e.getMessage());
        } catch (NumberFormatException e) {
            // Captura a exceção de formato inválido para números e exibe uma mensagem padrão
            System.err.println("Erro ao converter os parâmetros para números inteiros.");
        }
    }
}
