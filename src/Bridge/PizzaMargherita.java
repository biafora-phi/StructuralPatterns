package Bridge;

public class PizzaMargherita implements Pasto{

    private String tipo;
    private double prezzo;
    private int numeroIngredienti;

    public PizzaMargherita(){
        this.tipo = "Pizza Margherita";
        this.prezzo = 4.5;
        this.numeroIngredienti = 3;
    }

    @Override
    public Pasto getPasto() {
        return this;
    }

    @Override
    public String toString() {
        return "PizzaMargherita{" +
                "tipo='" + tipo + '\'' +
                ", prezzo=" + prezzo +
                ", numeroIngredienti=" + numeroIngredienti +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getNumeroIngredienti() {
        return numeroIngredienti;
    }

}
