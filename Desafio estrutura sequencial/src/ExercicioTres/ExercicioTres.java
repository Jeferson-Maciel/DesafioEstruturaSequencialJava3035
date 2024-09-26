package ExercicioTres;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu salário: ");
        double salario = scanner.nextDouble();

        System.out.printf("Seu salário é: R$ %.2f%n", salario);
        
        scanner.close();
    }
}
