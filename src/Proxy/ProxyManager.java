package Proxy;

public class ProxyManager implements InterfacciaFile {

    private GestioneFile gf;
    private String file;

    public ProxyManager(String f){
        System.out.println("proxufile manager");
        this.file = f;
    }


    @Override
    public void display() {
        System.out.println("Proxy display--------->");
        if(gf == null)
            gf = new GestioneFile(file);
        gf.display();
    }
}
