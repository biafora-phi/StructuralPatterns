package pp;

import java.util.ArrayList;

public class RealSubject extends Subject{
    ArrayList<Character> c;

    public RealSubject(){
        c = new ArrayList<>();
        for(int i = 0; i < 10000000; i++){
            c.add('a');
        }
    }

    @Override
    public void stampa() {
       // for(int i = 0; i < c.size(); i++)
            //System.out.println(c.get(i));
    }
}
