package Proxy;

import java.io.*;
import java.util.ArrayList;

public class CaricamentoFile {
    public ArrayList<String> load(String a){
        ArrayList<String> file = null;
        try{
            BufferedReader is = new BufferedReader(new FileReader(a));
            while(is.readLine() != null){
                file.add(is.readLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }
}
