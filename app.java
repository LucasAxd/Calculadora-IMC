import java.util.Scanner;

/**
 * app
 */
public class app {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu peso: ");

        double peso = ler.nextDouble();

        System.out.println("Digite seu altura: ");

        double altura = ler.nextDouble();

        double imc = 0;

        
        ler.close();


        imc = peso / (altura * altura);

        System.out.println(imc);

    }
}