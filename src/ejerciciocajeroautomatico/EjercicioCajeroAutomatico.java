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
        System.out.print("Ingrese el numero de transacciones a realizar: ");
        int numerotransacciones = entrada.nextInt();       
        String [] transaccion = new String[numerotransacciones];
        int [] monto = new int[numerotransacciones];
        int ingreso;
        int contador, contadortransacciones=0;
        final int BILLETES[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int cantidadMaxima[] = {10, 2, 1, 1, 2, 3, 2, 3, 5};
        int contadorBilletes[] = new int[BILLETES.length];
        int sobrante[] = new int[BILLETES.length];
        do{
           System.out.print("Ingrese detalle su transaccion: ");
           transaccion[contadortransacciones] = entrada.next();
           System.out.print("Ingrese el monto de su transaccion: ");
           monto[contadortransacciones] = entrada.nextInt();
           ingreso = monto[contadortransacciones];
           for(int i=0; i < BILLETES.length; i++){
               contadorBilletes[i] = ingreso / BILLETES[i];
               if(contadorBilletes[i] > cantidadMaxima[i]){
                  contadorBilletes[i] = cantidadMaxima[i];
                }
                cantidadMaxima[i] -= contadorBilletes[i];
                if(contadorBilletes[i] == 0){
                   continue;
                }
                contador = contadorBilletes[i] * BILLETES[i];
                ingreso -= contador;
                if(ingreso <= 0){
                   break;
                }
            }
            for(int x=0; x<BILLETES.length; x++){
                if(contadorBilletes[x] == 0){
                   continue;
                }
                else{
                   System.out.println("Cantidad de billetes de "+BILLETES[x]+": "+contadorBilletes[x]);
                }
            }
            if(ingreso > 0){
               System.out.println("Dinero pendiente: "+ingreso);
               for(int y=0; y < BILLETES.length; y++){
                   sobrante[y] = ingreso / BILLETES[y];
                   if(sobrante[y] == 0){
                      continue;
                    } else{
                      System.out.println("Pendiente billetes de "+BILLETES[y]+": "+sobrante[y]);
                    }
                    contador = sobrante[y] * BILLETES[y];
                    ingreso -= contador;
                    if(ingreso <= 0){
                       break;
                    }
                }
            }
            contadortransacciones++;
        } while(contadortransacciones < numerotransacciones);
        System.out.println("Nombre de transaccion\tMonto de transaccion");
        for(int n=0; n < numerotransacciones; n++){
            System.out.print(transaccion[n]);
            System.out.print("\t\t\t");
            System.out.print(monto[n]);
            System.out.print("\n");
        }
    }   
}
