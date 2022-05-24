package gof;

public class teste {
    
     public static void main(String[] args) {

        singletonlazy lazy = singletonlazy.getInstancia();
        System.out.println(lazy);
        singletonlazyholder holder = singletonlazyholder.getInstancia();
        System.out.println(holder);
        singletoneager eager = singletoneager.getInstancia();
        System.out.println(eager);
    }

}
