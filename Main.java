import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Sea bienvenido/a al conversor de moneda");
        EXTERNA:
        while (true) {
            System.out.println("****************************************");
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1 - Dólar =>> Pesos Argentinos\n"
                    + "2 - Pesos Argentinos =>> Dólar\n"
                    + "3 - Dólar =>> Real Brasileño\n"
                    + "4 - Real Brasileño =>> Dólar\n"
                    + "5 - Dólar =>> Peso Colombiano\n"
                    + "6 - Peso Colombiano =>> Dólar\n"
                    + "7 - Salir");
            System.out.println("Ingrese una Opción:\n ");
            System.out.println("****************************************");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);

            switch (opcion) {
                case '1':
                    convierte(872.26, "dolares");
                    break;
                case '2':
                    convertir(872.26, "Pesos Argentinos");
                    break;
                case '3':
                    convierte(5.17, "dolares");
                    break;
                case '4':
                    convertir(5.17, "Real Brasileño");
                    break;
                case '5':
                    convierte(3851.90, "dolares");
                    break;
                case '6':
                    convertir(3851.90, "Peso Colombiano");
                    break;
                case '7':
                    System.out.println("Cerrando Programa");
                    break EXTERNA;
                default:
                    System.out.println("Elija una Opción valida");
            }
        }
    }

    static void convertir(double valorDolar, String pais) {
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s :", pais);
        double cantidadMoneda = leer.nextDouble();

        double dolares = cantidadMoneda / valorDolar;

        dolares = (double) Math.round(dolares * 100d) / 100;
        ;

        System.out.println("---------------------------------------");
        System.out.println("|     tienes $" + dolares + " Dolar    |");
        System.out.println("---------------------------------------");
    }

    static void convierte(double valorMoneda, String dolares) {
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s :", dolares);
        double cantidadMoneda = leer.nextDouble();

        double moneda = cantidadMoneda * valorMoneda;

        double Moneda = (double) Math.round(moneda * 100d) / 100;
        ;

        System.out.println("---------------------------------------");
        System.out.println("|     tienes $" + moneda );
        System.out.println("---------------------------------------");

    }

}



