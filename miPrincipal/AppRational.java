package miPrincipal;

import java.util.Scanner;

public class AppRational {
    public static void menu() throws Exception{
        System.out.println("=======================================");
        System.out.println("   OPERACIONES CON NUMEROS RACIONALES");
        System.out.println("=======================================");
        Scanner consola = new Scanner(System.in);
        Rational r1 = new Rational(5,3);
        Rational r2 = new Rational(2,3);
        Rational r3 = new Rational();
        r3 = r1.add(r1, r2); // r1.add(r2);
        System.out.println("Resultado de suma:"+r3);

        Rational r4 = new Rational();
        r4 = r1.mult(r1, r2);
        r4 = r1.mult(r2);
        System.out.println("El resultado de la multiplicacion:"+r4);

        Rational r5 = new Rational(7,3);

        System.out.println("El resultado de la comparacion de  "+
                           r3+" y "+r5 +" es "+r5.equal(r3, r5));

        System.out.println("El resultado de la comparacion de  "+
                           r3+" y "+r5 +" es "+r3.equal(r5));

        //Probar un raciona con denominador cero
        Rational r6 = new Rational(5,0); //esto lanza una excepcion
        System.out.println("Valor del Racional ="+r6.toString());
        


    }
    
}
