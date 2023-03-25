import java.util.Scanner;

public class AuthPassword {
    public static void main(String args[]) {
        String password = "123456";
        String pass;

        System.out.print("Digite a senha: ");
        Scanner scanner = new Scanner(System.in);
        pass = scanner.nextLine();

        Boolean check = pass.equals(password);
        if (check == true) {
            System.out.println("Sucess!");
        } else {
            System.out.println("Wrong password.");
        }
    }
}
