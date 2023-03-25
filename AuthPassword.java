import java.util.Scanner;

public class AuthPassword {
    public static void main(String args[]) {
        String password;
        String pass;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Crie sua senha: ");
        password = scanner.nextLine();
        System.out.println("Senha criada com sucesso!");

        System.out.print("Digite a senha: ");
        pass = scanner.nextLine();

        Boolean check = pass.equals(password);
        if (check == true) {
            System.out.println("Sucess!");
        } else {
            System.out.println("Wrong password.");
        }
    }
}
