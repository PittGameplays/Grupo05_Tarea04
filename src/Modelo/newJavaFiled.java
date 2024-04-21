package Modelo;

import java.util.Arrays;

public class newJavaFiled {

    static int[] arreglo = {-3, 17, 89, -42, 56, 7, -1, 34, 23, 0, 66, -58, 29, 71, -24, 45, 88, -77, 12, 5};

    public static void main(String args[]) {
        imprimir();
        mergesort();
        imprimir();
    }

    public static void imprimir() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }

    public static void mergesort() {
        arreglo = mergesort1(arreglo);
    }

    public static int[] mergesort1(int[] array) {
        if (array.length == 1) {
            return array;
        }

        int[] arregloA = new int[array.length / 2];
        int[] arregloB;
        if (array.length % 2 == 0) {
            arregloB = new int[array.length / 2];
        } else {
            arregloB = new int[array.length / 2 + 1];
        }

        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                arregloA[i] = array[i];
            } else {
                arregloB[i - (array.length / 2)] = array[i];
            }
        }
        
        arregloA = mergesort1(arregloA);
        arregloB = mergesort1(arregloB);
        

        return mergesort2(arregloA, arregloB);
    }

    public static int[] mergesort2(int[] array1, int[] array2) {
        int cont1 = 0, cont2 = 0, i = 0;
        int[] arregloFinal = new int[array1.length + array2.length];

        while (cont1 < array1.length && cont2 < array2.length) {
            if (array1[cont1] > array2[cont2]) {
                arregloFinal[i] = array2[cont2];
                i++;
                cont2++;
            } else {
                arregloFinal[i] = array1[cont1];
                i++;
                cont1++;
            }

        }

        while (cont1 < array1.length) {
            arregloFinal[i] = array1[cont1];
            i++;
            cont1++;
        }
        while (cont2 < array2.length) {
            arregloFinal[i] = array2[cont2];
            i++;
            cont2++;
        }

        return arregloFinal;
    }
}
