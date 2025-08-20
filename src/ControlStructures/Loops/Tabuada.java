package ControlStructures.Loops;

public class Tabuada {
    public static void main(String[] Args) {
        for(int i = 10; i >= 1; i--) {
            System.out.println("TABUADA DE "+i);
            System.out.println();
            for(int j = 1; j <= 10; j++) {
                System.out.println(i*j);
            }
        }
    }
}
