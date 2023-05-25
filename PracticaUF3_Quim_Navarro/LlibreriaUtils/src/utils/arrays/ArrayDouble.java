package utils.arrays;

public class ArrayDouble {

    public static double max(double valor[]) {

        double max = valor[0];

        for (int i = 0; i < valor.length; i++) {

            if (valor[i] > max) {

                max = valor[i];

            }
        }

        return max;

    }

    public static double min(double valor[]) {

        double min = valor[0];

        for (int j = 0; j < valor.length; j++) {

            if (valor[j] < min) {

                min = valor[j];

            }

        }

        return min;

    }

    public static double mit(double valor[]) {

        double suma = 0;

        for (int i = 0; i < valor.length; i++) {

            suma += valor[i];

        }

        double mit = suma / valor.length;

        return mit;

    }

    public static int posmax(double valor[]) {

        int pos = 0;
        double max = valor[0];

        for (int i = 0; i < valor.length; i++) {

            if (valor[i] > max) {
                max = valor[i];
                pos = i;

            }
        }

        return pos;

    }

    public static int posmin(double valor[]) {

        int pos = 0;
        double min = valor[0];

        for (int i = 0; i < valor.length; i++) {

            if (valor[i] < min) {
                min = valor[i];
                pos = i;

            }
        }

        return pos;

    }

    public static void visualitzarArray(double valor[]) {

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

    public static int posicioArray(int[] array, int numero) {

        int i = 0;

        while (i < array.length) {

            if (array[i] == numero) {
                i = numero;
            } else {
                numero = -1;
            }
            i++;
        }
        return numero;
    }

    public static int posiscioArray(double[] num, int posicio) {

        for (int i = 0; i < num.length; i++) {

            if (posicio == i) {
                return posicio;

            } else {

                System.out.println("-1");
            }

        }

        return posicio;

    }

    public static void OrdenarArray(double[] num) {

        double numeros;
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                //Comparem els noms dels equips per ordenarlos alfabeticament
                if (num[i] > num[j]) {
                     numeros = num[i];
                    num[i] = num[j];
                    num[j] = numeros;
                }
            }

        }

    }

}
