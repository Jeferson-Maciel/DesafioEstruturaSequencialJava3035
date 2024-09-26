package ExercicioUm;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por Favor Informe Seu Nome Completo");
        String nome = scanner.nextLine();

        System.out.println("Por Favor Informe Sua Idade");
        String idade = scanner.nextLine();

        System.out.println("Suas Informações São : ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
