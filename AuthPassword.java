import java.util.Scanner;

public class AuthPassword {
    public static void main(String args[]) {
        // Declacaração de variaveis e do Scanner
        String password;
        String pass;
        String opcao;
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        // Criação de Senha
        System.out.print("Crie sua senha: ");
        password = scanner.nextLine();
        System.out.println("Senha criada com sucesso!");

        // Confirmação de senha
        System.out.print("Digite a senha: ");
        pass = scanner.nextLine();

        Boolean check = pass.equals(password);

        if (check == true) {
            System.out.println("Sucesso!");
        } else {
            // Tente novamente até 3x a senha
            while (i != 3) {
                System.out.print("Digite a senha novamente: ");
                pass = scanner.nextLine();
                check = pass.equals(password);
                if (check == true) {
                    // Aqui poderia chamar uma função que so eh acessada com a senha 
                    break;
                } else {
                    System.out.println("Erro! Senha incorreta.");
                    i++;
                }

            }
            if (check == true) {
                System.out.println("Sucesso!");
            } else {
                System.out.print("Esqueceu a senha? deseja redefinir (S) ou (N): ");
                opcao = scanner.nextLine().toUpperCase();
    
                switch (opcao) {
                    case ("S"): {
                        System.out.println("""
    
                            Vamos comecar o procedimento de redenificao de senha:
    
                            1. Crie uma pergunta para autenticar que eh voce mesmo.
                            2. Crie a resposta para a pergunta e NAO PERCA ESTA RESPOSTA
                            - Em caso de redefinicao de senha futura, tera que ser autenticado com
                            a resposta correta da pergunta definida por voce mesmo.
                            - (ATENCAO!!!) Em caso de esquecimento da resposta correta, 
                              NAO SERA MAIS POSSIVEL RECUPERAR A SENHA.
    
                            Entao vamo comecar:
    
                            EXEMPLO: Q: Qual eh o nome do seu bichinho de estimacao?
                                     A: Sherlock Holmes
    
                            """);
                            // Autenticador de 2 fatores (Question and answer)
                            System.out.print("Crie uma Pergunta: ");
                            String question = scanner.nextLine();
    
                            System.out.print("Insira a resposta da pergunta: ");
                            String answer = scanner.nextLine();
    
                            System.out.println("Autenticador inserido com sucesso!");
    
                            // Redefinição da senha
                            System.out.print("Crie sua senha nova: ");
                            password = scanner.nextLine();
    
                            System.out.println("Senha redefinida com sucesso!");
                        break;
                    }
                    case ("N"): {
                        break;
                    }
                }
            }
            
        }
    }
}
