/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciooperacionesrepositorio;

import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Ejerciciooperacionesrepositorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entra=new Scanner(System.in);
    int seleccion;
    float resultado=0;
    do{
        System.out.println("selecciona una opcion\n1: suma\n2: resta\n3: multiplicacion\n4: division\n5: potenciacion\n6: radicacion");
        
        seleccion= entra.nextInt();
        
        
        switch(seleccion){
            
            
            case 1:
                System.out.println("elegiste suma");
                System.out.println("escribe 2 numeros");
                int a= entra.nextInt();
                int b= entra.nextInt();
                resultado=a+b;
                System.out.println("la suma es: "+resultado);
                break;
                
                
            case 2:
                System.out.println("elegiste resta");
                System.out.println("escribe 2 numeros");
                int c= entra.nextInt();
        int d= entra.nextInt();
                resultado=c-d;
                System.out.println("la resta es: "+resultado);
                break;
                
                
            case 3:
                System.out.println("elegiste multiplicacion");
                System.out.println("escribe 2 numeros");
                int e= entra.nextInt();
        int f= entra.nextInt();
                resultado=e*f;
                System.out.println("la multiplicacion es: "+resultado);
                break;
                
                
            case 4:
                System.out.println("elegiste division");
                System.out.println("escribe 2 numeros");
                float g= entra.nextFloat();
        float h= entra.nextFloat();
                resultado=g/h;
                System.out.println("la division es: "+resultado);
                break;

                
            case 5:
                System.out.println("elegiste potenciacion");
                System.out.println("ingresa un numero base y un numero exponente");
                float i= entra.nextFloat();
                float j= entra.nextFloat();
                resultado=(float) Math.pow(i, j);
                System.out.println("la multiplicacion es: "+resultado);
                break;
                
                
            case 6:
                System.out.println("elegiste radicacion");
                System.out.println("ingresa un radicando");
                float k=entra.nextFloat();
                resultado=(float) Math.sqrt(k);
                System.out.println("la multiplicacion es: "+resultado);
                break;
                
                
                default:
                System.out.println("opcion no valida");
                break;

        }
    }while(seleccion<1||seleccion>6);
    }
    
}
