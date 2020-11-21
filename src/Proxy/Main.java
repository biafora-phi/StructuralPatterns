package Proxy;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        new DocumentManager("src/Proxy/test.txt", "/shared/image.png");
    }
}
