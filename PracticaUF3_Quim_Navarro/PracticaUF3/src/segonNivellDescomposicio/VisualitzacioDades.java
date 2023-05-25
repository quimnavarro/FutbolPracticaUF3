package segonNivellDescomposicio;

import static primerNivellDescomposiscio.PrimerNivellDescomposisció.equips;
import static primerNivellDescomposiscio.PrimerNivellDescomposisció.punts;
import utils.arrays.ArrayEnter;

import utils.cosola.LectorConsola;

/**
 * Aquesta classe servira per visualitzar totes les capçaleres i valors deñ
 * programa
 *
 * @author Quim Navarro Clares
 */
public class VisualitzacioDades {

    /**
     * Visualtiza el println per continuar i fa una neteja del intrp
     */
    public static void continuarMenu() {

        System.out.println("\n\nPrem RETURN per continuar...");
        LectorConsola.netejarteclat();

    }

    /**
     * Visualitza la capçelera de les estadistiques dels equips
     */
    public static void futbolCapçalera() {

        System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "PUNTS   ", "G.Favor", "G.Contra  ", "Diferencia");

    }

    /**
     * Visualitza les estadistiques dels euips amb la seva capçalera corresponent
     */
    public static void visualitzarEstadistiques() {

        futbolCapçalera();

        ArrayEnter.visualitzarArrayBidimensional(punts, equips);

    }

    /**
     * Visualitzar la capçalera del case 2
     */
    public static void capeçeleraOrdenat() {

        System.out.println("\n_______________ NOMS DELS EQUIPS ORDENATS ALFABÈTICAMENT _______________\n");

    }

    /**
     * Visualitza el println del case 3
     */
    public static void cercaEquip() {

        System.out.println("Introdueix el nom d'equip del que vols visualitzar les puntuacions: ");

    }

    /**
     * Visualitza la capçelera del case 4
     */
    public static void capçeleraLiderCuer() {

        System.out.printf("\n       \033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "PUNTS   ", "G.Favor", "G.Contra  ", "Diferencia");

    }

}
