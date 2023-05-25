package practicaUF3PersistenciaDades;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PersistenciaDeDadesPracticaUF3 {

    public static final String carpeta = "dades/";
    public static final String fitxer = "dades.dat";

    public static void escriureDades(String[] equips, int[][] puntsGols) {

        try (FileOutputStream fos = new FileOutputStream(carpeta + fitxer, false);
                DataOutputStream dos = new DataOutputStream(fos)) {

            for (int i = 0; i < equips.length; i++) {
                if (equips[i] != null) {
                    dos.writeUTF(equips[i]);
                    dos.writeInt(puntsGols[i][0]);
                    dos.writeInt(puntsGols[i][1]);
                    dos.writeInt(puntsGols[i][2]);
                    dos.writeInt(puntsGols[i][3]);
                    dos.writeInt(puntsGols[i][4]);
                    dos.writeInt(puntsGols[i][5]);
                    dos.writeInt(puntsGols[i][6]);
                    dos.writeInt(puntsGols[i][7]);
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Fitxer no trobat: " + fitxer);
        } catch (IOException ex) {
            System.out.println("Error en el fitxer: " + fitxer);
        }

    }

    public static void llegirDades(String[] equips, int[][] puntsGols) {

        try (FileInputStream fis = new FileInputStream(carpeta + fitxer);
                DataInputStream dis = new DataInputStream(fis)) {

            for (int i = 0; i < equips.length; i++) {
                equips[i] = dis.readUTF();
                puntsGols[i][0] = dis.readInt();
                puntsGols[i][1] = dis.readInt();
                puntsGols[i][2] = dis.readInt();
                puntsGols[i][3] = dis.readInt();
                puntsGols[i][4] = dis.readInt();
                puntsGols[i][5] = dis.readInt();
                puntsGols[i][6] = dis.readInt();
                puntsGols[i][7] = dis.readInt();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Fitxer no trobat " + fitxer);
            System.out.println("L'aplicació funciona però no té dades dins del fitxer.");
            System.out.println("Ubicació incorrecta de l'arxiu:" + carpeta + fitxer);
        } catch (EOFException ex) {
            System.out.println("\n\tFitxer " + fitxer + " llegit correctament.");
        } catch (IOException ex) {
            System.out.println("Error en el fitxer " + fitxer);
        }
    }

}
