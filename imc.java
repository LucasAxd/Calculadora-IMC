import java.util.Scanner;

/**
 * app
 */
public class imc {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu peso: ");

        double peso = ler.nextDouble();

        System.out.print("Digite seu altura: ");

        double altura = ler.nextDouble();

        double imc = 0;

        ler.close();

        imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Magreza");
        }
        if (imc > 18.5 & imc < 24.9) {
            System.out.println("Peso normal");
        }

        if (imc > 25 & imc < 29.9) {
            System.out.println("Sobrepeso");
        }

        if (imc > 30 & imc < 34.9) {
            System.out.println("Obesidade grau I");
        }

        if (imc > 35 & imc < 40) {
            System.out.println("Obesidade grau II");
        }

        if (imc > 40) {
            System.out.println("Obesidade grau III");
        }

    }
}