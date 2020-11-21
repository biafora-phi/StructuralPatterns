package pp;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //RealSubject r = new RealSubject();
        Proxy p = new Proxy("pp.Proxy");
        p.stampa();

        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}
