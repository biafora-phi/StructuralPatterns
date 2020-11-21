package Decorator;

public class InterniFibbraDiCarbonio extends DecoratorAuto{
    public InterniFibbraDiCarbonio(Auto a) {
        super(a);
    }

    @Override
    public void stampa() {
        this.auto.stampa();
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Interni in fibbra di carbonio";
    }
}
