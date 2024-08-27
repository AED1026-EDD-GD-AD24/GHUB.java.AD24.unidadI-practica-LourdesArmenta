package miPrincipal;

public class Conjunto {
    static int M = 20;
    private Object cto[];
    private int cardinal;
    private int capacidad;
    //Operaciones
    public Conjunto(){
        cto = new Object[M];
        cardinal = 0;
        capacidad = M;

    }
    //determinar si el conjunto es vacio
    public boolean esVacio()
    {
        return (cardinal == 0);
    }
    //busca si el elemento pertenece al conjunto
    public boolean pertenece(Object elemento){
        int k=0;
        boolean encontrado = false;
        while(k<cardinal && !encontrado){
            encontrado = cto[k].equals(elemento);
            k++;
        }
        return encontrado;

    }


    //añadir un elemento si no esta en el conjunto
    public void añadir(Object elemento){

    }

    
}
