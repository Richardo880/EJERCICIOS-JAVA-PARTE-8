package E2;
import java.util.Scanner;

public class ejerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero entre 0 y 10: ");
        numero = sc.nextInt();
        
        assert(numero >= 0 && numero <= 10) : String.format("Numero fuera del rango (%d)", numero);
        
        System.out.printf("Numero correcto (%d)\n",numero);
    }
    
}
