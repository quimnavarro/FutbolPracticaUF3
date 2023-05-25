/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils.arrays;

public class ArrayString {

    public static void OrdenarArray(String[] noms, int valors) {

        String tmp;
        for (int i = 0; i < valors - 1; i++) {
            // des de l'últim fins al següent de la i
            for (int j = valors - 1; j > i; j--) {

                if (noms[j] != null) {
                    if (noms[j].compareToIgnoreCase(noms[j - 1]) < 0) {
                        tmp = noms[j];
                        noms[j] = noms[j - 1];
                        noms[j - 1] = tmp;

                    }
                }

            }
        }

    }

    public static void Visualitzar(String[] noms, String[] noms2) {

        for (int i = 0; i < noms.length && noms2[i] != null; i++) {
            System.out.println(noms[i]);
        }

    }

    public static void copiaDeUnaArray(String[] noms, String[] nomsordenats, int valors) {

        for (int i = 0; i < valors; i++) {
            nomsordenats[i] = noms[i];
        }

    }

    public static void copiaDeDosArray(String[] noms, String[] noms2, int[][] valors, int[][] valors2) {

        for (int i = 0; i < noms2.length; i++) {
            noms[i] = noms2[i];
            for (int j = 0; j < valors2[i].length; j++) {
                valors[i][j] = valors2[i][j];

            }
        }

    }

    public static void busquedaEquip(String[] noms, String nom, int[][] valors) {

        boolean trobat = false;
        //cerquem el nom d'equip a l'array de noms
        int i = 0;
        for (i = 0; i < noms.length && noms[i] != null; i++) {
            if (nom.equalsIgnoreCase(noms[i])) {
                trobat = true;
                break;
            }
        }
        if (trobat) {
            System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "PUNTS   ", "G.Favor", "G.Contra  ", "Diferencia");
            System.out.printf("\n%15s", noms[i]);
            for (int j = 0; j < valors[i].length; j++) {
                System.out.printf("%10d", valors[i][j]);
            }
        } else {
            System.out.println("No s'ha trobat aquest nom d'equip");
        }

    }

    public static void quicksorts(String A[], int izq, int der) {

        String pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der - 1;         // j realiza la búsqueda de derecha a izquierda
        String aux;

        
        
        while (i < j) {                          // mientras no se crucen las búsquedas                                   
            while (A[i].compareTo(pivote) <= 0 && i < j){
                i++;
            }
            while (A[j].compareTo(pivote) > 0){
                j-- ;
            }
           
            if (i < j) {                        // si no se han cruzado                      
                aux = A[i];                      // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }

        
        A[izq] = A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        A[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1) {
            quicksorts(A, izq, j);          // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksorts(A, j + 1, der);          // ordenamos subarray derecho
        }
    }

}
