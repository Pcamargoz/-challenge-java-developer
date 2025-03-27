import java.util.Scanner;

// Classe principal
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in); // Scanner para entrada de dados

        // Solicitando os dois parâmetros ao usuário
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        terminal.close(); // Fechando o Scanner após o uso
        
        //criando uma exceção para o erro se caso o primeiro parametro for maior que o segundo
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) { 
            System.out.println("O segundo parâmetro deve ser maior do que o primeiro");
        }
    }

    // Método que realiza a contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior que o segundo e lança a exceção
        if (parametroUm > parametroDois) {
            System.out.println("O segundo parâmetro deve ser maior do que o primeiro");
        }

        int contagem = parametroDois - parametroUm; // Calculando a quantidade de interações

        // Loop para imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

// Classe para exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}