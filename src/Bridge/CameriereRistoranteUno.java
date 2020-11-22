package Bridge;

public class CameriereRistoranteUno extends Cameriere {

    @Override
    public Pasto getPasto(Pasto p) {
        if(p instanceof PizzaDiavola){
            ((PizzaDiavola) p).setTipo("Pizza Diavola Ristorante Uno");
            ((PizzaDiavola) p).setNumeroIngredienti(5);
            ((PizzaDiavola) p).setPrezzo(4.0);
        }
        if(p instanceof PizzaMargherita){
            ((PizzaMargherita) p).setTipo("Pizza Margherita Ristorante Uno");
            ((PizzaMargherita) p).setPrezzo(3);
            ((PizzaMargherita) p).setNumeroIngredienti(4);
        }
        return p;
    }
    /*@Override
    public Pasto getPasto(String p) {
        Pasto pasto = null;
        switch (p){
            case "Pizza Margherita":
                pasto = new PizzaMargherita();
            break;
            case "Pizza Diavola":
                pasto = new PizzaDiavola();
                break;
            default:
                System.out.println("Pizza non disponibile");
                break;
        }
        return pasto;
    }*/
}
