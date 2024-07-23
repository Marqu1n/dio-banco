import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal
 {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in).useLocale(new Locale("en","US"))) {
            
            System.out.println("Por favor, digite o número da Agência !");
            String agencia = sc.nextLine();

            System.out.println("Por favor, digite o número da conta !");
            int numeroConta = sc.nextInt();

            System.out.println("Por favor, digite o seu nome!");
            sc.nextLine();
            String nomeCliente = sc.nextLine();

            System.out.println("Por favor, digite o número seu Saldo !");
            double saldo = sc.nextDouble();

            System.out.println(
                String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                 nomeCliente, agencia, numeroConta, saldo)
                );
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        

    }
}
