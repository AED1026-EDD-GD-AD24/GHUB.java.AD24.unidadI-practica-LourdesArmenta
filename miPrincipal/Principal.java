package miPrincipal;

public class Principal {
    public String getGreeting() {
        return "Hola Mundo!";
    }

    public static void main(String[] args) {
        //System.out.println(new Principal().getGreeting());
        //Probar mi clase Rational
        Rational r1 = new Rational(5,3);
        Rational r2 = new Rational(2,3);
        Rational r3 = new Rational();
        r3 = r1.add(r1, r2);
        System.out.println("Resultado de suma:"+r3);

        Rational r4 = new Rational();
        r4 = r1.mult(r1, r2);
        System.out.println("El resultado de la multiplicacion:"+r4);

        Rational r5 = new Rational(7,3);

        System.out.println("El resultado de la comparacion de  "+
                           r3+" y "+r5 +" es "+r5.equal(r3, r5));

        
    }
}