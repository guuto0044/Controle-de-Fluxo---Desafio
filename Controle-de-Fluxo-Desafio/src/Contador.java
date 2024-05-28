import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o valor 1: ");
        int valor1 = scanner.nextInt();

        System.out.print("Informe o valor 2: ");
        int valor2 = scanner.nextInt();

        try {
            contar(valor1,valor2);

        } catch (ParametrosInvalidosException e) {
            
            System.err.println(e.getMessage());
        }

    }

    static void contar(int valor1, int valor2) throws ParametrosInvalidosException {

        if (valor1>valor2) {
            
            throw new ParametrosInvalidosException("O valor 2 tem que ser maior que o valor 1.");
        }
        
        for(int contagem = 1; contagem <= (valor2 - valor1); contagem ++){
            System.out.println("Imprimindo o valor: " + contagem);
        }

    }


}