package DecoratorEsempio;

/**
 * rappresenta il concretecomponent e implementa l'interfaccia ifigura
 */
public class Figura implements IFigura{
    @Override
    public void stampa() {
        System.out.println("Questo è il metodostampa del concreteComponent(Figura)");

    }
}
