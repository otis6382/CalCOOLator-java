import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean executando = true;

        while (executando) {

            System.out.println("=== Calculadora do Balacubaco ===");

            System.out.println("Escolha a operacao caba safado");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Mais funcionalidades em breve, paciencia omi");
            System.out.println("0 - Vou embora");

            int operacao;

            try {
                operacao = entrada.nextInt();

            }

            catch (Exception e) {
                System.out.println("I'm sorry, nao sei ler letras so numeros!");
                entrada.nextLine();
                continue;
            }

            if (operacao == 0) {
                System.out.println("Vai com Deus.");
                executando = false;
            }

            else if (operacao == 5) {
                System.out.println("Tenha paciencia, o programador nao programa direito ainda xd");
            }

            else if (operacao < 0 || operacao > 5) {
                System.out.println("Vosmece seria analfabeto(a) ou ta se passando?");
            }

            else {

                System.out.print("Digite o primeiro numero parça: ");
                double firstDigit = entrada.nextDouble();

                System.out.print("Agora o outro bobão: ");
                double secondDigit = entrada.nextDouble();

                if (operacao == 1) {
                    double resultado = firstDigit + secondDigit;
                    System.out.println("Toma a resposta ai mizera: " + resultado);
                }

                else if (operacao == 2) {
                    double resultado = firstDigit - secondDigit;
                    System.out.println("Toma a resposta ai delulu: " + resultado);
                }

                else if (operacao == 3) {
                    double resultado = firstDigit * secondDigit;
                    System.out.println("Toma a resposta ai caba safado " + resultado);
                }

                else if (operacao == 4) {
                    if (secondDigit == 0) {
                        System.out.println("Quer endoidar o computador é, impossível homi!");
                    }

                    else {
                        double resultado = firstDigit / secondDigit;
                        System.out.println("Olha aqui sua resposta " + resultado);
                    }

                }

            }

        }

    }

}