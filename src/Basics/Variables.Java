package Basics;
import java.util.scanner;

public class Variables {
    public static void main(String[] args) {
        int idade;
        float altura;
        String nome;
        Scanner scanner = new Scanner(System.in);
        idade = scanner.nextInt();
        altura = scanner.nextFloat();
        scanner.nextLine();
        nome = scanner.nextLine();
        System.out.println("Seu nome é: "+nome+ " Sua idade é: ",+idade+" Sua altura é: "+altura);
        scanner.close();
    }
}