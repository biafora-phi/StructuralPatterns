package Bridge;

public class Carbonara implements Pasto{
    private String tipo;
    private double prezzo;
    private int numeroIngredienti;

    public Carbonara(){
        this.tipo = "Carbonara";
        this.prezzo = 6.5;
        this.numeroIngredienti = 5;
    }

    @Override
    public Pasto getPasto() {
        return this;
    }

    @Override
    public String toString() {
        return "Carbonara{" +
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
