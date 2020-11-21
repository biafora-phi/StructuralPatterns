package Bridge;

public class CameriereRistorante implements Cameriere{
    @Override
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
    }
}
