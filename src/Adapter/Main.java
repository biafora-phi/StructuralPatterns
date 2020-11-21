package Adapter;

public class Main {
    public static void main(String[] args) {
        Impiegato imp = new Impiegato();
        imp.setCognome("Rossi");
        System.out.println(imp.getCognome());
        AdattaEmployer emp = new AdattaEmployer();
        emp.setCognome("Verdi");
        System.out.println(emp.getCognome());
    }
}
