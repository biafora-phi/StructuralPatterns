package Bridge;

public class Main {
    public static void main(String[] args) {
        Cameriere c1 = new CamerierePizzeria();
        Cameriere c2 = new CameriereRistorante();
        Pasto p1 = c1.getPasto("Pizza Diavola");
        Pasto p2 = c2.getPasto("Lasagna");
        System.out.println(p1);
        System.out.println(p2);
    }
}
