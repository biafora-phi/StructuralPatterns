package Decorator;

public class Radio2Din extends DecoratorAuto {
    public Radio2Din(Auto a) {
        super(a);
    }

    @Override
    public void stampa() {
        this.auto.stampa();
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Radio 2 din video alta risoluzione";
    }
}
