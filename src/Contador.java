import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Informe o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroDois > parametroUm) {
            int subtracao = parametroDois - parametroUm;
            for(int contador = 0; contador < subtracao; contador++ ) {
                System.out.println("Imprimindo o número " + (contador + 1));
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }

}