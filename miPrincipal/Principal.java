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

        
    }
}