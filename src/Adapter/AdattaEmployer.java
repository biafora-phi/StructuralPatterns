package Adapter;

public class AdattaEmployer extends Employer implements InterfaceEmployer, InterfacciaImpiegato {

    @Override
    public String getCognome() {
        return getLasName();
    }

    @Override
    public void setCognome(String cognome) {
       setLastName(cognome);
    }
}
