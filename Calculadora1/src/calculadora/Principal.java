package calculadora;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int j;

        Calculadora miCalculadora = new Calculadora();
        CalculadoraTrigonometrica miCalculadoraTrigonometrica = new CalculadoraTrigonometrica();
        int e;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Seleccione la operacion que deseas ejecutar");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Coseno");
        j = myScanner.nextInt();

        System.out.println(miCalculadora.getR());

        switch (j) {
            case 1:
                 e = myScanner.nextInt();
                 miCalculadora.setX(e);
                 e = myScanner.nextInt();
                 miCalculadora.setY(e);
                 miCalculadora.sumar();
                    System.out.println(miCalculadora.getR());
                break;
                case 2:
                 e = myScanner.nextInt();
                 miCalculadora.setX(e);
                 e = myScanner.nextInt();
                 miCalculadora.setY(e);
                 miCalculadora.restar();
                    System.out.println(miCalculadora.getR());
                 break;
                case 3:
                 e = myScanner.nextInt();
                 miCalculadora.setX(e);
                 e = myScanner.nextInt();
                 miCalculadora.setY(e);
                 miCalculadora.multiplicar();
                    System.out.println(miCalculadora.getR());
                 break;
                case 4:
                 e = myScanner.nextInt();
                 miCalculadoraTrigonometrica.setX(e);
                miCalculadoraTrigonometrica.coseno();
                 System.out.println(miCalculadoraTrigonometrica.coseno());
                  break;
                default:
                    break;
            
            
        }
    }
}
