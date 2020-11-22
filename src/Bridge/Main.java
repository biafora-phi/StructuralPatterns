package Bridge;

public class Main {
    public static void main(String[] args) {
        Cameriere c1 = new CameriereRistoranteUno();
        Cameriere c2 = new CameriereRistoranteDue();
        System.out.println(c1.getPasto(new PizzaDiavola()));
        System.out.println(c2.getPasto(new PizzaDiavola()));
        System.out.println(new PizzaDiavola());
    }
}
