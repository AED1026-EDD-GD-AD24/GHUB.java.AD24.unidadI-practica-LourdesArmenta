package miPrincipal;

import java.util.Scanner;

import org.junit.jupiter.engine.script.ScriptAccessor;

public class Principal {
    public String getGreeting() {
        return "Hola Mundo!";
    }

    public static void main(String[] args) throws Exception {
        //System.out.println(new Principal().getGreeting());
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println("***********************************");
            System.out.println("    TIPOS DE DATOS ABSTRACTOS");
            System.out.println("***********************************");
            System.out.println(" 1) Rational");
            System.out.println(" 2) Matriz");
            System.out.println(" 3) Cadena");
            System.out.println(" 4) Numerote");
            System.out.println(" 5) Conjunto");
            System.err.println();
            System.out.println(" 0) Salir");
            System.out.print("selecciona opción ");
            opc = consola.nextInt();
            switch (opc) {
                case 1:  
                   AppRational.menu();
                    break;

                case 2:
                case 3:
                case 4:
                case 5:
                   AppConjunto.menu();
                   break;
                case 0:
                    System.out.println("Hasta luego!");
                    break;
            
                default:
                   System.out.println("Valor incorrecto, intenta de nuevo");
                
            }

        } while (opc !=0);


    
        
        

        
    }
}