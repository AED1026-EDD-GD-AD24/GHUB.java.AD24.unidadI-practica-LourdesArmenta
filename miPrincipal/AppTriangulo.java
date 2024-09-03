package miPrincipal;

public class AppTriangulo {
    public static void menu(){
        System.out.println("=======================================");
        System.out.println("        OPERACIONES CON TRIANGULO      ");
        System.out.println("=======================================");
        Punto v1 = new Punto(2,1);
        Punto v2 = new Punto(2,3);
        Punto v3 = new Punto(4,2);
        double lados[];
        Triangulo t1 = new Triangulo(v1,v2,v3);
        lados = t1.longitudes();
        System.out.println("Lado 1: "+lados[0]);
        System.out.println("Lado 2:"+lados[1]);
        System.out.println("Lado 3:"+lados[2]);

    }

    
}
