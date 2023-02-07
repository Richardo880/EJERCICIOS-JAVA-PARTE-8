package E4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class pruebaEjer4 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cantTrabajador = 0,i;
        
        System.out.print("Ingrese la cantidad de Trabajadores: ");
        cantTrabajador = sc.nextInt();
        
        empleados [] tr = new empleados[cantTrabajador];
        String nombre;
        int horas;
        double tarifa;
        
        for(i = 0; i < cantTrabajador; i++){
            System.out.print("\nIngrese el nombre del Trabajador:");
            nombre = br.readLine();
            System.out.print("Ingrese las horas trabajadas: ");
            horas = sc.nextInt();
            System.out.print("Ingrese la tarifa por horas del Trabajador: ");
            tarifa = sc.nextDouble();
            
            tr[i] = new empleados(nombre,horas,tarifa);
        }
        
        System.out.println("\nSueldo Bruto de cada Trabajador:\n");
        for(i = 0; i < cantTrabajador; i++){
            System.out.println(tr[i].toString());
        }
    }  
}
