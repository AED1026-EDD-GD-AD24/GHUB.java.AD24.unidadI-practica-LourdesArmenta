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
        if ( !pertenece(elemento)){
            /*
             * Verificar si hay posiciones libres
             * en caso contrario ampliar el conjunto
             */
            if(cardinal == capacidad){
                Object nuevoCto[];
                nuevoCto = new Object[capacidad+M];
                for (int k=0;k<capacidad;k++){
                    nuevoCto[k]= cto[k];
                }
                capacidad = capacidad+ M;
                cto = nuevoCto;

            }
            cto[cardinal++]=elemento;
            
        }

    }
    //quita el elemento del comjunto
    public void retirar(Object elemento){
        if(pertenece(elemento)){
            //localizar el elemento a retirar
            int k=0;
            while(!cto[k].equals(elemento))
                k++;
            /*
             * desde el elemento k hasta la ultima
             * posicion mover los elementos
             * a la izquierda
             */
            for(;k<cardinal;k++){
                cto[k]=cto[k+1];

            }
            cardinal--; //cardinal = cardinal -1;

        }
    }

    //devuelva le número de elementos
    public int getCardinal(){
        return this.cardinal;
    }

    //Operacion de union de dos conjuntos
    public Conjunto union(Conjunto c2){
        Conjunto u = new Conjunto();
        //primero copio el primer conjunto de a union
        for(int k=0; k<cardinal;k++){
            u.cto[k]=this.cto[k];

        }
        u.cardinal=this.cardinal;
        //añadir los elementos de c2 no incluidos
        for (int k=0;k<c2.cardinal;k++){
            u.añadir(c2.cto[k]);
        }
        return u;

    }
    @Override
    public String toString() {
        String s ="{";
            for(int k=0;k<cardinal;k++)
               s+=cto[k].toString()+",";
            if(cardinal>0)
               s=s.substring(0,s.length()-1);
            s+="}";
            return s;

   
    }



    
}
