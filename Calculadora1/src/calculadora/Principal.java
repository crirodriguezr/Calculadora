package calculadora;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();
        int e, o;
        Scanner myScanner = new Scanner(System.in);
        e = myScanner.nextInt();
        miCalculadora.setX(e);
        o = myScanner.nextInt();
        miCalculadora.setY(o);

        miCalculadora.sumar();
        
       
        
        System.out.println(miCalculadora.getR());
        
        
    }
}
