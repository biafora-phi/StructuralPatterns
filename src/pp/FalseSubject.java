package pp;

import java.util.ArrayList;

public class FalseSubject extends Subject {

    ArrayList<Integer> c;

    public FalseSubject(){
        c = new ArrayList<>();
        for(int i = 0; i < 100000; i++)
            c.add(10);
    }

    @Override
    void stampa() {
        //for(int i = 0; i < c.size(); i++){
            //System.out.println(c.get(i));

    }
}
