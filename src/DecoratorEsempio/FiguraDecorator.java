package DecoratorEsempio;

/**
 * questa classe astratta rappresenta il decorator
 * implementa IFigura
 *
 */

public abstract class FiguraDecorator implements IFigura {

    protected IFigura component;

    public FiguraDecorator(IFigura component){
        this.component = component;
    }


    @Override
    public abstract void stampa();
}
