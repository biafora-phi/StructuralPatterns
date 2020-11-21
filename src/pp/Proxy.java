package pp;

import java.lang.reflect.InvocationTargetException;

public class Proxy extends Subject{

    Subject s;
    String tipoClasse;

    public Proxy(String s){
        this.tipoClasse = s;
    }

    @Override
    public void stampa() {
        try {
            s = (Subject) Class.forName(tipoClasse).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        s.stampa();
    }
}
