
package sueldooperario;

import java.util.Scanner;
        
public class SueldoOperario {

    public static void main(String[] args) {
 
        Scanner teclado =new Scanner(System.in);
        
        int horasTrabajadas = 0;
        float costoHora;
        float sueldo;
        
    System.out.print("Ingrese la cantidad de horas trabajadas por el empleado: ");
        
            int horasTrabajas = teclado.nextInt();
        
            System.out.print("Ingrese el valor de la hora: ");
            
            costoHora=teclado.nextFloat();
            
            sueldo=horasTrabajas*costoHora;
            
            System.out.print("El empleado debe cobrar: ");
                    System.out.print(sueldo);
            
            
            
    }
    
}
