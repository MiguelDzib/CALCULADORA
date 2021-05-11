
package calculadora;
import java.util.Scanner;

public class Calculadora {
    public int numero;
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        operaciones calc= new operaciones();
        calc.setResultado(0);
        System.out.println("Esta calculadora inicia desde 0");
        System.out.println("presione 1.- Sumar, 2.- Restar, 3.- Multiplicar, 4.-Dividir, 5.-Parar, 6.-Revertir");
        System.out.println("Ingresa la opcion");
        int valor=entrada.nextInt();
        int n=1000;
        for (int i=0;i<n;i++){ 
        switch(valor){
            case 1: 
                System.out.println("Que numero desea sumar");
                int numero=entrada.nextInt();
                calc.suma(numero);
                System.out.println(calc.toString());
                System.out.println("presione 1.- Sumar, 2.- Restar, 3.- Multiplicar, 4.-Dividir, 5.-Parar, 6.-Revertir");
                System.out.println("Ingresa la opcion");
                valor=entrada.nextInt();
                break;
            case 2:
                System.out.println("Que numero deseas restar");
                numero=entrada.nextInt();
                calc.resta(numero);
                System.out.println(calc.toString());
                System.out.println("presione 1.- Sumar, 2.- Restar, 3.- Multiplicar, 4.-Dividir, 5.-Parar, 6.-Revertir");
                System.out.println("Ingresa la opcion");
                valor=entrada.nextInt();
                break;
            case 3:
                System.out.println("Que numero deseas multiplicar");
                numero=entrada.nextInt();
                calc.multi(numero);
                System.out.println(calc.toString());
                System.out.println("presione 1.- Sumar, 2.- Restar, 3.- Multiplicar, 4.-Dividir, 5.-Parar, 6.-Revertir");
                System.out.println("Ingresa la opcion");
                valor=entrada.nextInt();
                break;
            case 4:
                System.out.println("Que numero deseas dividir");
                numero=entrada.nextInt();
                calc.div(numero);
                System.out.println(calc.toString());
                System.out.println("presione 1.- Sumar, 2.- Restar, 3.- Multiplicar, 4.-Dividir, 5.-Parar, 6.-Revertir");
                System.out.println("Ingresa la opcion");
                valor=entrada.nextInt();
                break;
            case 5:
                System.out.println("Fin");
                    i=1000;    
            
                break;
            case 6:
                System.out.println("Revertir");    
                calc.revertir(valor);
                System.out.println(calc.toString());
                System.out.println("presione 1.- Sumar, 2.- Restar, 3.- Multiplicar, 4.-Dividir, 5.-Parar, 6.-Revertir");
                System.out.println("Ingresa la opcion");
                valor=entrada.nextInt();
                
                break;
                
            default:
                System.out.println("ERROR"); 
                break;
        }
        }
                
        
        
        
        }

        
    }
    

