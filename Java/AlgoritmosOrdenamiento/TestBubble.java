package AlgoritmosOrdenamiento;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBubble {
    public static void menu() {
        System.out.println("1.- Ingresar elemento");
        System.out.println("2.- Ordenar");
    }

    public static void agregarElementos(ArrayList<Integer> array) {
        boolean terminar = false;
        while (!terminar) {
            menu();
            Scanner entrada = new Scanner(System.in);
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Agregar elemento");
                    entrada = new Scanner(System.in);
                    array.add(entrada.nextInt());
                    break;
                case 2:
                    System.out.println("Ordenando los elmentos");
                    terminar = true;
                    break;

                default:
                System.out.println("Ingresa una opcion valida");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Burbuja b = new Burbuja();
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Lista desordenada:\n" + array);
        agregarElementos(array);
        array = b.ordenar(array);
        System.out.println("Lista ordenada:\n" + array);

    }
}
