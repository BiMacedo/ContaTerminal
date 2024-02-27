import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nome;
        double saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = entrada.next();

        System.out.println("Digite sua Agencia: ");
        agencia = entrada.next();

        System.out.println("Digite o numero: ");
        numero = entrada.nextInt();

        System.out.println("Digite o saldo: ");
        saldo = entrada.nextDouble();

        System.out.println("Olá " + nome + " Obrigado por criar uma conta em nosso banco, sua agencia é  " + agencia
                + " conta " + numero + " e seu saldo já está disponivel para saque " + saldo);

    }
}
