package Bridge;

public class CamerierePizzeria implements Cameriere{
    @Override
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
    }
}
