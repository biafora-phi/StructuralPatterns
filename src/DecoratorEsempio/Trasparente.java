package DecoratorEsempio;

public class Trasparente extends FiguraDecorator {

    public Trasparente(IFigura component) {
        super(component);
    }

    @Override
    public void stampa() {
        this.component.stampa();
        System.out.println("questo è il metodo strampa del concreteDecorator rappresentato da trasparente");
    }
}
