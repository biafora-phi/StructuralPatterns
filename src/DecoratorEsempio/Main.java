package DecoratorEsempio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Benvenut");
        Figura f = new Figura();
        //f.stampa();
        Trasparente t = new Trasparente(f);
        Opaca o = new Opaca(t);
        o.stampa();
    }
}
