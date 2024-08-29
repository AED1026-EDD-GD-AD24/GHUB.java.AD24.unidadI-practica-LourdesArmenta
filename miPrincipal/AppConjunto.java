package miPrincipal;

import java.util.Scanner;

public class AppConjunto {
    public static void menu(){
        System.out.println("=======================================");
        System.out.println("      OPERACIONES CON CONJUNTOS");
        System.out.println("=======================================");
        Scanner consola = new Scanner(System.in);
        Conjunto A = new Conjunto();
        if(A.esVacio())
            System.out.println("El conjunto esta vacio");
        
        else
           System.out.println("El comjunto No esta vacio");

        //añadir elementos al conjunto
        Integer ele = 4;
        A.añadir(ele);
        ele = 7;
        A.añadir(ele);
        ele =2;
        A.añadir(ele);
        ele =5;
        A.añadir(ele);
        System.out.println("El conjunto A tiene "+A.getCardinal()+" elementos");
        ele = 4;
        A.añadir(ele);
        System.out.println("El conjunto A tiene "+A.getCardinal()+" elementos");
        //creamos otro conjunto
        Conjunto B = new Conjunto();
        ele = 6;
        B.añadir(ele);
        ele=3;
        B.añadir(ele);
        System.out.println("El conjunto B tiene "+B.getCardinal()+" elementos");

        Conjunto C=A.union(B);
        System.out.println("El conjunto C tiene "+C.getCardinal()+" elementos");




        


        





    }  
}
