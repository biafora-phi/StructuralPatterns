package Decorator;

public class Main {

    public static void main(String[] args) {
        AutomobileInVendita auto = new AutomobileInVendita();
        Radio2Din radio = new Radio2Din(auto);
        InterniFibbraDiCarbonio i = new InterniFibbraDiCarbonio(radio);
        i.stampa();

    }
}
