package ControlStructures.Condicionals;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        idade = scanner.nextInt();
        if(idade <= 12) {
            System.out.println("você se enquadra na categoria criança! ");
        } else if(idade > 12 && idade <= 17) {
            System.out.println("Você se enquadra na categoria adolecente! ");

        } else if(idade > 17 && idade <= 59) {
            System.out.println("Você se enquadra na categoria adulto! ");
        } else if(idade > 59) {
            System.out.println("Você se enquadra na categoria idoso! ");
        }
        scanner.close();
        
    }
    
}
