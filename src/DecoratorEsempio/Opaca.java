package DecoratorEsempio;

public class Opaca extends FiguraDecorator{
    public Opaca(IFigura component) {
        super(component);
    }

    @Override
    public void stampa() {
        this.component.stampa();
        System.out.println("questo è il metodos tampa del concretedcorateor dell'opaca");
    }
}
