package miPrincipal;


public class AppPunto {
     public static void menu(){
        System.out.println("=======================================");
        System.out.println("        OPERACIONES CON PUNTO          ");
        System.out.println("=======================================");

        Punto p1 = new Punto(2,1);
        Punto p2 = new Punto(2,3);
        Punto p3 = new Punto(4,1);

        System.out.println("Valor de x en punto1: "+p1.getX());
        System.out.println("Valor de y en punto1: "+p1.getY());

        System.out.println("Valor de x en punto2: "+p2.getX());
        System.out.println("Valor de y en punto2: "+p2.getY());

        System.out.println("Valor de x en punto3: "+p3.getX());
        System.out.println("Valor de y en punto3: "+p3.getY());


        
     }

    
}
