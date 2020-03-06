package tallers;

import java.util.Scanner;

/**
 *
 * @author s112e2
 */
public class TallerS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("Ingrese número");
        int numero= 0;
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        int contador=0;
        int [] arregloprimos=new int [19];
        int posicion=0;
        while(contador<=20){
           
            if(esPrimo(numero)==true){
                contador= contador +1;
                numero ++;
                arregloprimos[posicion]=numero;
                posicion ++;
                System.out.println(posicion);
                System.out.println("primo");
                System.out.println(contador);
                System.out.println(numero);
               
            }else if (esPrimo(numero)==false){
                numero++;
             System.out.println("no primo");
                System.out.println(contador);
                System.out.println(numero);
             
            }
       
        }
       
        for (int i = 0; i < 20; i++) {
            System.out.println(arregloprimos[i]);
        }
       
    }
   
    public static boolean esPrimo(int numero){
      int contador = 2;
      boolean primo=true;
      while ((primo) && (contador!=numero)){
         if (numero % contador == 0)
            primo = false;
            contador++;
        }
    return primo;
}
}