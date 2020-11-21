package Proxy;

public class DocumentManager {
    public DocumentManager(String s, String f){
        loadText(s);
        loadImage(f);
    }

    private void loadImage(String f) {
        System.out.println("Load image");
        new GestioneFile(f).display();
    }

    private void loadText(String s) {
        System.out.println("Load text");
        new GestioneFile(s).display();
    }

}
