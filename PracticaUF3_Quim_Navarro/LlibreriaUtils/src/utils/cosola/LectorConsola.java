package utils.cosola;

import java.util.Scanner;

public class LectorConsola {

    public static Scanner teclat = new Scanner(System.in);

    public static boolean llegintBolea() {

        boolean ok = false;
        boolean bolea = false;

        do {

            if (teclat.hasNextBoolean()) {

                bolea = teclat.hasNextBoolean();
                ok = true;

            } else {

                System.out.println("Introdueix un enter");
                teclat.nextLine();

            }

        } while (!ok);

        return bolea;

    }

    public static byte llegintByte() {

        boolean ok = false;
        byte bits = 0;

        do {

            if (teclat.hasNextByte()) {

                bits = teclat.nextByte();
                ok = true;

            } else {

                System.out.println("Introdueix un enter");
                teclat.nextLine();

            }

        } while (!ok);

        return bits;

    }

    public static int llegintEnter() {

        boolean ok = false;
        int enter = 0;

        do {

            if (teclat.hasNextInt()) {

                enter = teclat.nextInt();
                ok = true;

            } else {

                System.out.println("Introdueix un enter");
                teclat.nextLine();

            }

        } while (!ok);

        return enter;

    }

    public static double llegintFloat() {

        boolean ok = false;
        float decimal = 0;

        do {

            if (teclat.hasNextFloat()) {

                decimal = teclat.nextFloat();
                ok = true;

            } else {

                System.out.println("Introdueix un enter");
                teclat.nextLine();

            }

        } while (!ok);

        return decimal;

    }

    public static double llegintDouble() {

        boolean ok = false;
        double decimal = 0;

        do {

            if (teclat.hasNextDouble()) {

                decimal = teclat.nextDouble();
                ok = true;

            } else {

                System.out.println("Introdueix un enter");
                teclat.nextLine();

            }

        } while (!ok);

        return decimal;

    }

    public static String llegintString() {

        teclat.nextLine();
        
        return teclat.nextLine(); 
    }

    public static long llegintLong() {

        boolean ok = false;
        long num = 0;

        do {

            if (teclat.hasNextLong()) {

                num = teclat.nextLong();
                ok = true;

            } else {

                System.out.println("Introdueix un enter");
                teclat.nextLine();

            }

        } while (!ok);

        return num;

    }

    public static short llegintShort() {

        boolean ok = false;
        short num = 0;

        do {

            if (teclat.hasNextShort()) {

                num = teclat.nextShort();
                ok = true;

            } else {

                System.out.println("Introdueix un enter");
                teclat.nextLine();

            }

        } while (!ok);

        return num;

    }
    
    public static void netejarteclat(){
    
    teclat.nextLine();
    teclat.nextLine();

    }
    

}
