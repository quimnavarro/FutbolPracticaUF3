package segonNivellDescomposicio;

import java.util.Scanner;
import static primerNivellDescomposiscio.PrimerNivellDescomposisció.equips;
import static primerNivellDescomposiscio.PrimerNivellDescomposisció.numEquips;
import static primerNivellDescomposiscio.PrimerNivellDescomposisció.punts;
import static practicaUF3PersistenciaDades.PersistenciaDeDadesPracticaUF3.escriureDades;

import utils.cosola.LectorConsola;

/**
 * Aquesta clase en servira per a la actualitzacio de dades del case 5 i 6
 * case 5. Introdueix dades de nou equip
 * case 6. Modificar dades d'un equip
 * @author Quim Navarro Clares
 */

public class ActualitzacióDades {

    static Scanner teclat = new Scanner(System.in);

    /**
     * Aquest metode consisteix en que l'usiari d'oni dalta un equip nou i que li pugui anat introduint els seus valors.
     * En el principi del codi veiem que afegim el nom del nou equips
     * Seguidament despre de introduir el nom ens demanara les dades del nou equip
     */
    
    public static void introduccioDades() {

        System.out.println("_______________ ALTA D'EQUIP NOU _______________");
        int indTrobat = 0;
        if (numEquips == equips.length) {
            // Comprova si ha arribat al final de l'array, no hi ha més espai
            System.out.println("\nNO es poden donar d'alta més equips, no hi ha més espai...");
        } else {

            System.out.print("\nIntrodueix el nom del nou equip: ");
            String equipNou = teclat.nextLine();

            boolean trobat = false;

            int i = 0;
            //cerca el nom d'equip a l'array de noms
            for (i = 0; i < equips.length && !trobat; i++) {
                if (equipNou.equalsIgnoreCase(equips[i])) {
                    trobat = true;
                    indTrobat = i;
                }
            }

            if (trobat) {

                System.out.println("HO SENTIM, aquest equip ja existeix!!!, no el pots donar d'alta");
                System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "PUNTS   ", "G.Favor", "G.Contra  ", "Diferencia");
                System.out.printf("\n%15s", equips[i]);

                for (int j = 0; j < punts[i].length; j++) {
                    System.out.printf("%10d", punts[i][j]);
                }

            } else { //donem d'alta el nou equip, doncs no existeix i hi ha espai

                // si no troba el nom de l'equip vol dir que no existeix en l'array i el podem donar d'alta
                // assigna a l'array de noms d'equip el nom d'equip introduït per l'usuari
                equips[numEquips] = equipNou;

                System.out.print("\nPartits GUANYATS: ");
                punts[numEquips][1] = LectorConsola.llegintEnter();
                System.out.print("\nPartits EMPATATS: ");
                punts[numEquips][2] = LectorConsola.llegintEnter();
                System.out.print("\nPartits PERDUTS: ");
                punts[numEquips][3] = LectorConsola.llegintEnter();
                System.out.print("\nGols A FAVOR: ");
                punts[numEquips][5] = LectorConsola.llegintEnter();
                System.out.print("\nGols EN CONTRA: ");
                punts[numEquips][6] = LectorConsola.llegintEnter();

                // Calcula el numero de partits jugats a partir dels partits guanyats, empatats i perduts
                punts[numEquips][0] = punts[numEquips][1] + punts[numEquips][2] + punts[numEquips][3];

                // Calcula el numero de punts totals de l'equip a partir dels partits guanyats, empatats i perduts
                punts[numEquips][4] = (punts[numEquips][1] * 3) + punts[numEquips][2];

                // Calcula la diferència de gols
                punts[numEquips][7] = punts[numEquips][5] - punts[numEquips][6];

                System.out.println("\n Equip donat d'ALTA correctament!!");

                System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "PUNTS   ", "G.Favor", "G.Contra  ", "Diferencia");
                System.out.printf("\n%15s", equips[numEquips]);
                for (int j = 0; j < punts[numEquips].length; j++) {
                    System.out.printf("%10d", punts[numEquips][j]);
                }

                // incrementa la variable que porta compter del numero d'equips introduïts
                numEquips++;

            }
            
        }
        // Espera que l'usuari premi return per continuar
        
        //Rtornar el valor numero

    }
    
    /**
     * Aquest metode consisteix en que l'usiari modifiqui el nom i les dades de un equip.
     * En el principi del codi veiem que afegim el nom del quip que volem modificar.
     * Seguidament despre de introduir el nom ens demanara d'actualitzar les dades de l'equip que hem triat per modificar les dades.
     */

    public static void modificarDades() {

        System.out.println("\n_______________ MODIFICACIÓ DE DADES D'UN EQUIP _______________");
        System.out.println("\nIntrodueix el nom de l'equip que vols modificar:");
        String nom = teclat.nextLine();

        boolean trobat = false;
        numEquips = 0;
        //cerca el nom d'equip a l'array de noms

        int i = 0;

        for (i = 0; i < equips.length && (!trobat); i++) {
            if (nom.equalsIgnoreCase(equips[i])) {
                trobat = true;
                numEquips = i;
                System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "PUNTS   ", "G.Favor", "G.Contra  ", "Diferencia");
                System.out.printf("\n%15s", equips[i]);

                for (int j = 0; j < punts[i].length; j++) {
                    System.out.printf("%10d", punts[i][j]);
                }
            }

        }
        if (!trobat) {
            // No troba l'equip, per tant, no es pot modificar
            System.out.println("No s'ha trobat aquest equip");
        } else {
            // S'ha trobat l'equip, es demana a l'usuari quina informació vol modificar.
            System.out.println("\nVols modificar el NOM equip? " + equips[numEquips] + " (s/n)");
            char mod = teclat.nextLine().charAt(0);
            if (mod == 's' || mod == 'S') {
                System.out.print("Nom d'equip: ");
                equips[numEquips] = teclat.nextLine();
            }

            System.out.println("Vols modificar partits GUANYATs? " + punts[numEquips][1] + " (s/n)");
            mod = teclat.nextLine().charAt(0);
            if (mod == 's' || mod == 'S') {
                System.out.print("Partits guanyats:  ");
                punts[numEquips][1] = LectorConsola.llegintEnter();
                teclat.nextLine();
            }

            System.out.println("Vols modificar partits EMPATATS? " + punts[numEquips][2] + " (s/n)");
            mod = teclat.nextLine().charAt(0);
            if (mod == 's' || mod == 'S') {
                System.out.print("Partits empatats:  ");
                punts[numEquips][2] = LectorConsola.llegintEnter();
                teclat.nextLine();
            }

            System.out.println("Vols modificar partits PERDUTS? " + punts[numEquips][3] + " (s/n)");
            mod = teclat.nextLine().charAt(0);
            if (mod == 's' || mod == 'S') {
                System.out.print("Partits perduts:  ");
                punts[numEquips][3] = LectorConsola.llegintEnter();
                teclat.nextLine();
            }

            System.out.println("Vols modificar gols A FAVOR? " + punts[numEquips][5] + "  (s/n)");
            mod = teclat.nextLine().charAt(0);
            if (mod == 's' || mod == 'S') {
                System.out.print("Gols a favor:  ");
                punts[numEquips][5] = LectorConsola.llegintEnter();
                teclat.nextLine();
            }

            System.out.println("Vols modificar gols EN CONTRA? " + punts[numEquips][6] + "  (s/n)");
            mod = teclat.nextLine().charAt(0);
            if (mod == 's' || mod == 'S') {
                System.out.print("Gols en contra:  ");
                punts[numEquips][6] = LectorConsola.llegintEnter();
                teclat.nextLine();
            }

            // Calcula el numero de partits jugats a partir dels partits guanyats, empatats i perduts
            punts[numEquips][0] = punts[numEquips][1] + punts[numEquips][2] + punts[numEquips][3];

            // Calcula el numero de punts totals de l'equip a partir dels partits guanyats, empatats i perduts
            punts[numEquips][4] = (punts[numEquips][1] * 3) + punts[numEquips][2];

            // Calcula la diferència de gols
            punts[numEquips][7] = punts[numEquips][5] - punts[numEquips][6];

            System.out.println("\n Equip MODIFICAT correctament!!");

            // tornem a visualitzar les dades actualitzades 
            System.out.printf("\n\033[31m%15s %10s %10s %10s %10s %10s %-8s %-8s %10s", "Equip", "Jugats", "Guanyats", "Empatats", "Perduts", "PUNTS   ", "G.Favor", "G.Contra  ", "Diferencia");
            System.out.printf("\n%15s", equips[numEquips]);
            for (int j = 0; j < punts[numEquips].length; j++) {
                System.out.printf("%10d", punts[numEquips][j]);
            }
            

        }

    }

}
