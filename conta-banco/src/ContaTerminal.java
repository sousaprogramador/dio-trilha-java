import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int accountNumber;
        String branch;
        String clientName;
        double banlance;

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        accountNumber = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, digite o número da Agência!");
        branch = input.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente!");

        clientName = input.nextLine();

        System.out.println("Por favor, digite o Saldo da Conta!");
        banlance = Double.parseDouble(input.nextLine());

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + branch + ", conta " + accountNumber + " e seu saldo " + banlance + " já está disponível para saque");

        input.close();
    }
}