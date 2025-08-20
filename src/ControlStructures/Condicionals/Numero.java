package ControlStructures.Condicionals;
import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if(num > 0) {
            System.out.println("positivo");
        } else if(num < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("é zero");
            scanner.close();
        }
    }    
}
