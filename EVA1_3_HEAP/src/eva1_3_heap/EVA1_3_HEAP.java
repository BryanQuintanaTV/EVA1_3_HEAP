/*
 * "Practica 3
 * "EVA1_3_HEAP
 */
package eva1_3_heap;

/**
 *
 * @author Quintana Juarez Bryan Alexis
 */
public class EVA1_3_HEAP {

    public static void main(String[] args) {
        int x = 10; 
//      Obj y obj2 guardan REFERENCIAS
        Prueba obj = new Prueba();
        Prueba obj2 = new Prueba();
        System.out.println(x);
        System.out.println(obj.valor);
        System.out.println(obj2);
    } 
}


class Prueba{
   public int valor = 100;
}