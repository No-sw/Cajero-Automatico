/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocajeroautomatico;
import java.util.Scanner;
/**
 *
 * @author Toshiba
 */
public class EjercicioCajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner entrada = new Scanner(System.in); 
        int ingreso;
        float contador;
        int contadorBilletes;
        int billetes[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int cantidadMaxima[] = {10, 2, 1, 1, 2, 3, 2, 3, 5};
        System.out.print("Ingrese lo que necesite: ");
        ingreso = entrada.nextInt();
        //Estructura de decision con arreglos
        for(int i=0; i < billetes.length; i++){
            contadorBilletes = ingreso / billetes[i];
            if(contadorBilletes > cantidadMaxima[i]){
                contadorBilletes = cantidadMaxima[i];
            }
            if(contadorBilletes == 0){
                continue;
            } else{
                System.out.println("cantidad de billetes de "+billetes[i]+": "+contadorBilletes);
            }
            contador = contadorBilletes * billetes[i];
            ingreso -= contador;
            if(ingreso <= 0){
                break;
            }
        }
        if(ingreso > 0){
            System.out.println("Dinero pendiente: "+ingreso);
        }
    }   
}
