package Bridge;

public class Lasagna implements Pasto{

    private String tipo;
    private double prezzo;
    private int numeroIngredienti;

    public Lasagna(){
        this.tipo = "Lasagna";
        this.prezzo = 7;
        this.numeroIngredienti = 8;
    }

    @Override
    public Pasto getPasto() {
        return this;
    }

    @Override
    public String toString() {
        return "Lasagna{" +
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
