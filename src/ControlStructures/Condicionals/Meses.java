package ControlStructures.Condicionals;
import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        int dias;
        switch(opcao) {
            case 1:
            dias = 31;
            System.out.println("Janeiro");
            System.out.println("Verão");
            System.out.println(dias);
            break;

            case 2:
            dias = 28;
            System.out.println("Fevereiro");
            System.out.println("Verão");
            System.out.println(dias);
            break;
            
            case 3:
            dias = 31;
            System.out.println("Março");
            System.out.println("Outono");
            System.out.println(dias);
            break;

            case 4:
            dias = 30;
            System.out.println("Abril");
            System.out.println("Outono");
            System.out.println(dias);
            break;

            case 5:
            dias = 31;
            System.out.println("Maio");
            System.out.println("Outono");
            System.out.println(dias);
            break;

            case 6:
            dias = 30;
            System.out.println("Junho");
            System.out.println("Inverno");
            System.out.println(dias);
            break;

            case 7:
            dias = 31;
            System.out.println("Julho");
            System.out.println("Inverno");
            System.out.println(dias);
            break;

            case 8: 
            dias = 31;
            System.out.println("Agosto");
            System.out.println("Inverno");
            System.out.println(dias);
            break;

            case 9:
            dias = 30;
            System.out.println("Setembro");
            System.out.println("Primavera");
            System.out.println(dias);
            break;

            case 10:
            dias = 31;
            System.out.println("Outubro");
            System.out.println("Primavera");
            System.out.println(dias);
            break;

            case 11:
            dias = 30;
            System.out.println("Novembro");
            System.out.println("Primavera");
            System.out.println(dias);
            break;

            case 12:
            dias = 31;
            System.out.println("Dezembro");
            System.out.println("Primavera");
            System.out.println(dias);
            break;
        }
        scanner.close();
    }    
}
