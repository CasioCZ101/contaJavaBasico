import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //System.out.println("String");
        //TO DO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o user
        //Obter pela scanner os valoeres digitados no terminal
        //Exibir a mesagem conta criada
        var scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência:");
        int ag = scanner.nextInt();
        System.out.println("Por favor, digite o número da Conta:");
        String conta = scanner.next();
        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.next();
        System.out.println("Por favor, digite o seu saldo:");
        float saldo = scanner.nextFloat();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, \nSua agência é %s, Conta %s e seu saldo %s já está disponível para saque.\n", nome, ag, conta, saldo);

    }
}
