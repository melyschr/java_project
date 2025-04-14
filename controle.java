import java.util.Locale;
import java.util.Scanner;   // Biblioteca Scanner para entrada de dados

public class controle{
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int x = sc.nextInt();

        System.out.print("Digite um numero decimal: ");
        double y = sc.nextDouble();

        System.out.print("Digite a letra inicial do seu nome: ");
        char z = sc.next().charAt(0);

        System.out.print("Agora digite seu nome completo: ");
        String s = sc.nextLine(); // ler um texto até a quebra de linha e fazer a limpeza de buffer

        sc.close();
    }
}