package utils.arrays;

public class ArrayEnter {

    public static int max(int valor[]) {

        int max = valor[0];

        for (int i = 0; i < valor.length; i++) {

            if (valor[i] > max) {

                max = valor[i];

            }
        }

        return max;

    }

    public static int min(int valor[]) {

        int min = valor[0];

        for (int j = 0; j < valor.length; j++) {

            if (valor[j] < min) {

                min = valor[j];

            }

        }

        return min;

    }

    public static int mit(int valor[]) {

        int suma = 0;

        for (int i = 0; i < valor.length; i++) {

            suma += valor[i];

        }

        int mit = suma / valor.length;

        return mit;

    }

    public static int posmax(int valor[]) {

        int pos = 0;
        int max = valor[0];

        for (int i = 0; i < valor.length; i++) {

            if (valor[i] > max) {
                max = valor[i];
                pos = i;

            }
        }

        return pos;

    }

    public static int posmin(int valor[]) {

        int pos = 0;
        int min = valor[0];

        for (int i = 0; i < valor.length; i++) {

            if (valor[i] < min) {
                min = valor[i];
                pos = i;

            }
        }

        return pos;

    }

    public static void visualitzarArray(int valor[]) {

        for (int i = 0; i < valor.length; i++) {

            System.out.println(valor[i]);

        }

    }

    public static int fatorial(int valor) {

        int sumatotal = valor;

        for (int i = valor - 1; i > 0; i--) {

            sumatotal *= i;

        }

        return sumatotal;

    }

    public static void visualitzarArrayBidimensional(int valor[][], String noms[]) {

        for (int i = 0; i < noms.length && noms[i] != null; i++) {
            System.out.printf("\n%15s", noms[i]);
            for (int j = 0; j < valor[i].length; j++) {
                System.out.printf("%10d", valor[i][j]);
            }

        }
    }

    public static void MaxMin(int punts[][], String[] equips) {

        int maxPunts = punts[0][4],
                indMax = 0;

        int minPunts = punts[0][4],
                indMin = 0;

        for (int j = 0; j < punts.length && equips[j] != null; j++) {
            if (punts[j][4] < minPunts) {
                minPunts = punts[j][4];
                indMin = j;
            }
            if (punts[j][4] > maxPunts) {
                maxPunts = punts[j][4];
                indMax = j;
            }
        }
        lider(punts, equips, indMax);
        cuer(punts, equips, indMin);

    }

    public static void lider(int punts[][], String[] equips, int indMax) {

        System.out.printf("\nLIDER %15s", equips[indMax]);
        for (int j = 0; j < punts[indMax].length; j++) {
            System.out.printf("%10d", punts[indMax][j]);
        }

    }

    public static void cuer(int punts[][], String[] equips, int indMin) {

        System.out.printf("\nCUER  %15s", equips[indMin]);
        for (int j = 0; j < punts[indMin].length; j++) {
            System.out.printf("%10d", punts[indMin][j]);
        }
    }

}
