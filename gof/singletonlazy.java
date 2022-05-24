
package gof;

public class singletonlazy{

    private static singletonlazy instancia;

    private singletonlazy(){
        super();
    }

    public static singletonlazy getInstancia(){
        if (instancia == null){
            instancia = new singletonlazy();
        }
        return instancia;
    }
}