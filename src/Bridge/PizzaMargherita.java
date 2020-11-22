package Bridge;

public class PizzaMargherita implements Pasto{

    private String tipo;
    private double prezzo;
    private int numeroIngredienti;

    public PizzaMargherita(){
        this.tipo = "Pizza Margherita";
        this.prezzo = 0;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setNumeroIngredienti(int numeroIngredienti) {
        this.numeroIngredienti = numeroIngredienti;
    }
}
