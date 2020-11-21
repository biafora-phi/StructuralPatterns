package Decorator;

public class AutomobileInVendita implements Auto{

    private String modello = "Avendator";
    private String marca = "Lamborghini";

    @Override
    public void stampa() {
        System.out.println("Sono in compponente coincreto");
    }

    @Override
    public String toString() {
        return "AutomobileInVendita{" +
                "modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
