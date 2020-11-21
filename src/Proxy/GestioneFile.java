package Proxy;

import java.util.ArrayList;

public class GestioneFile implements InterfacciaFile {

    private ArrayList<String> image;

    public GestioneFile(String nomeFile){
        System.out.println("FileManager -->");
        image = load(nomeFile);
    }

    private ArrayList<String> load(String s){
        System.out.println("FileManager.load(): loading file " + s);
        return new CaricamentoFile().load(s);
    }


    @Override
    public void display() {
        System.out.print("FileManager.display(): display file ");
        for(int i = 0; i< image.size() && i<10; i++) {
            System.out.print( Integer.toHexString(Integer.parseInt(image.get(i))) + " ");
        }
        System.out.println("...");
    }
}
