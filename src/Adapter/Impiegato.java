package Adapter;

public class Impiegato implements InterfacciaImpiegato{

    private String cognome = null;

    @Override
    public String getCognome() {
        return cognome;
    }

    @Override
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
