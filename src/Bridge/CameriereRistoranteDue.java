package Bridge;

public class CameriereRistoranteDue extends Cameriere {
    @Override
    public Pasto getPasto(Pasto p) {
        if(p instanceof PizzaDiavola){
            ((PizzaDiavola) p).setTipo("Pizza Diavola Ristorante Due");
            ((PizzaDiavola) p).setNumeroIngredienti(8);
            ((PizzaDiavola) p).setPrezzo(10.7);
        }
        if(p instanceof PizzaMargherita){
            ((PizzaMargherita) p).setTipo("Pizza Margherita Ristorante Due");
            ((PizzaMargherita) p).setPrezzo(2);
            ((PizzaMargherita) p).setNumeroIngredienti(4);
        }
        return p;
    }


   /* @Override
    public Pasto getPasto(String p) {
        Pasto pasto = null;
        switch (p){
            case "Lasagna":
                pasto = new Lasagna();
                break;
            case "Carbonara":
                pasto = new Carbonara();
                break;
            default:
                System.out.println("Pasta non disponibile");
                break;
        }
        return pasto;
    }*/
}
