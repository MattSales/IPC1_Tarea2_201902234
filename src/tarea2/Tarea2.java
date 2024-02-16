
package tarea2;

import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        double a;
        double b;
        boolean flag=true;
        
        do{
            System.out.println("----- Calculadora basica de dos numeros -----");
            System.out.println("Selecione la operacion que desea realizar");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir " + "\n");
            
            select = sc.nextInt();
            
            switch (select) {
                case 1:
                    System.out.println("----- SUMA -----");
                    System.out.println("Ingrese el valor de a");
                    a = sc.nextDouble();
                    System.out.println("Ingrese el valor de b");
                    b = sc.nextDouble();
                    System.out.println("El resultado de la suma es: " + suma(a,b));
                    break;
                    
                case 2:
                    System.out.println("----- RESTA -----");
                    System.out.println("Ingrese el valor de a");
                    a = sc.nextDouble();
                    System.out.println("Ingrese el valor de b");
                    b = sc.nextDouble();
                    System.out.println("El resultado de la resta es: " + resta(a,b));
                    break;
                    
                case 3:
                    System.out.println("----- MULTIPLICACION -----");
                    System.out.println("Ingrese el valor de a");
                    a = sc.nextDouble();
                    System.out.println("Ingrese el valor de b");
                    b = sc.nextDouble();
                    System.out.println("El resultado de la multiplicacion es: " + multiplicacion(a,b));
                    break;
                    
                case 4:
                    System.out.println("----- DIVISION -----");
                    System.out.println("Ingrese el valor de a");
                    a = sc.nextDouble();
                    System.out.println("Ingrese el valor de b");
                    b = sc.nextDouble();
                    if(b==0){
                        System.err.println("No se puede dividir entre 0");
                    }else{
                        System.out.println("El resultado de la division es: " + division(a,b));
                    }
                    break;
                    
                case 5:
                    flag = false;
                    break;

            }
       
        }while(flag==true);
        
        
        
  
    }
    
    public static double suma(double a, double b){
        return a+b;
    }
    public static double resta(double a, double b){
        return a-b;
    }
    public static double multiplicacion(double a, double b){
        return a*b;
    }
    public static double division(double a, double b){
        return a/b;
    }
    
    
}
