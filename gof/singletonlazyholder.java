package gof;

public class singletonlazyholder {
    
    private static class instanceholder{
        public static singletonlazyholder instancia = new singletonlazyholder();
    }

    private singletonlazyholder(){
        super();
    }

    public static singletonlazyholder getInstancia(){
        return instanceholder.instancia;
    }
}
