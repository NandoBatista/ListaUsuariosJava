import java.util.ArrayList;
import java.util.Scanner;

public class AddUsers {

    public static void main(String[] args) {
        ArrayList<User> lista = new ArrayList<User>();
        Scanner scan = new Scanner(System.in);
        String controller;

        do {
            System.out.println("Digite o seu nome: ");
            String nome = scan.next();
            System.out.println("Digite a sua idade: ");
            int idade = scan.nextInt();
            System.out.println("Digite o seu time do coração: ");
            String time = scan.next();
            User pessoa = new User(nome, idade, time);
            lista.add(pessoa);
            System.out.println("Você deseja cadastrar um novo usuário? ");
            controller = scan.next();

        } while (controller.equals("sim"));

        for (User i: lista) {
            System.out.println(i);
        }
    }
}
