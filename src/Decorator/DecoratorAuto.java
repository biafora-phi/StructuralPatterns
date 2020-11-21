package Decorator;

public abstract class DecoratorAuto implements Auto {
    protected Auto auto;

    public DecoratorAuto(Auto a){
        this.auto = a;
    }

   public abstract void stampa();
}
