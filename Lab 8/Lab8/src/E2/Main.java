package E2;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        double poblacion, tasa;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Poblacion: ");
        poblacion = sc.nextDouble();
        
        System.out.print("Tasa: ");
        tasa = sc.nextDouble();
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Luego de " + i + " anhos la poblacion sera de ");
            poblacion = poblacion + poblacion * (tasa/100);
            System.out.println(poblacion);
        }
    }
}
