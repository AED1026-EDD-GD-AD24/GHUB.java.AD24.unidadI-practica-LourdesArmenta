package miPrincipal;

public class Principal {
    public String getGreeting() {
        return "Hola Mundo!";
    }

    public static void main(String[] args) {
        System.out.println(new Principal().getGreeting());
    }
}