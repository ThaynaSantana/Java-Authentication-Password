import java.util.Scanner;

public class AuthPassword {
    public static void main(String args[]) {
        String password = "123456";
        System.out.print("Digite a senha: ");
        
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        System.out.println(pass.equals(password));
    }
}
