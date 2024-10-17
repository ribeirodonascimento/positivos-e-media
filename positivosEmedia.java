import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int contPositivos = 0;
        double somaPositivos = 0;


        for (int i = 1; i <= 6; i++) {
            double valor = s.nextDouble();

            if (valor > 0) {
                contPositivos++;
                somaPositivos += valor;
            }
        }

        System.out.println(contPositivos + " valores positivos");

        if (contPositivos > 0) {
            double mediaPositivos = somaPositivos / contPositivos;
            System.out.printf("%.1f%n", mediaPositivos);
        }
    }
}
