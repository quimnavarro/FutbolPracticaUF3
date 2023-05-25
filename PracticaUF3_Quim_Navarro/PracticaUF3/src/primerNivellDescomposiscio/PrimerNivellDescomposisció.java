package primerNivellDescomposiscio;

import segonNivellDescomposicio.ActualitzacióDades;
import segonNivellDescomposicio.VisualitzacioDades;
import static segonNivellDescomposicio.VisualitzacioDades.continuarMenu;
import static practicaUF3PersistenciaDades.PersistenciaDeDadesPracticaUF3.escriureDades;
import static practicaUF3PersistenciaDades.PersistenciaDeDadesPracticaUF3.llegirDades;
import utils.arrays.ArrayEnter;
import utils.arrays.ArrayString;
import utils.cosola.LectorConsola;

/**
 * Aquesta clase es la que conte el primer nivell de descomposicio de
 * l'aplicació.
 *
 * @author Quim Navarro Clares
 *
 *
 */
public class PrimerNivellDescomposisció {

    public static final int NUMERO_EQUIPS = 40;

    // creem els arrays amb uns valors inicials, per tenir dades introduïdes quan executem el programa
    public static String[] equipsCodi = {"Barcelona", "Real Madrid", "Real Sociedad", "Athletic", "Atletico Madrid", "Real Betis", "Osasuna CF", "Rayo Vallecano", "Villareal", "Valencia", "Mallorca", "Valladolid", "Girona CF", "Almeria CF", "Getafe CF", "Espanyol", "Cela de Vigo", "Sevilla CF", "Cadiz CF", "Elche CF"};

    // En aquest array bidimensional, s'emmagatzema les puntuacions dels equips de la lliga. 
    // Cada fila emmagatzema les puntuacions de l'equip situat en la mateixa posició que la fila
    // Cada columna d'aquest array guarda la següent informació:
    // Columna 0: partits jugats
    // Columna 1: partits guanyats
    // Columna 2: partits empatats
    // Columna 3: partits perduts
    // Columna 4: punts totals
    // Columna 5: gols a favor
    // Columna 6: gols en contra
    // Columna 7: diferència de gols
    public static int[][] puntsCodi = {{14, 12, 1, 1, 37, 33, 5, 28},
    //Real Madrid
    {14, 11, 2, 1, 35, 33, 14, 19},
    //Real Sociedad
    {14, 8, 2, 4, 26, 19, 17, 2},
    //Athletic Club
    {14, 7, 3, 4, 24, 24, 14, 10},
    //Atlético de Madrid
    {14, 7, 3, 4, 24, 21, 14, 10},
    //Betis
    {14, 7, 3, 4, 24, 17, 12, 5},
    //Osasuna
    {14, 7, 2, 5, 23, 16, 14, 2},
    //Rayo Vallecano
    {14, 6, 4, 4, 22, 20, 16, 4},
    //Villarreal
    {14, 6, 3, 5, 21, 15, 10, 5},
    //Valencia
    {14, 5, 4, 5, 19, 22, 15, 7},
    //Mallorca
    {14, 5, 4, 5, 19, 13, 13, 0},
    //Valladolid
    {14, 5, 2, 7, 17, 13, 21, -8},
    //Girona    
    {14, 4, 4, 6, 16, 20, 22, -2},
    //Almería
    {14, 5, 5, 8, 16, 16, 22, -6},
    //Getafe
    {14, 3, 5, 6, 14, 12, 20, -8},
    //Espanyol
    {14, 2, 6, 6, 12, 16, 22, -6},
    //Celta de Vigo
    {14, 3, 3, 8, 12, 14, 26, -12},
    //Sevilla
    {14, 2, 5, 7, 11, 13, 22, -9},
    //Cadiz
    {14, 2, 5, 7, 11, 9, 26, -17},
    //Elche
    {14, 0, 4, 10, 4, 10, 31, -21}};

    // en la variable numEquips es tindrà en tot moment el numero d'equips que es tenen emmagatzemats
    //aquesta variable ens limitarà el final del recorregut dels arrays, el limit ara no serà 
    // només la longitud de l'array
    public static int numEquips = 20;

    // Declarem arrays amb més posicions per poder afegir equips a la nostra lliga
    public static String[] equips = new String[NUMERO_EQUIPS]; // inicialitza per defecte a null
    public static int[][] punts = new int[NUMERO_EQUIPS][8];  // inicialitza per defecte a zero

    /**
     * Aquest metode contindra el menu de l'aplicacio on veurem les opcions que
     * podrem triar.
     *
     */
    public static void menuCrida() {

        int opcio;

        do {

            System.out.println("\nGESTIÓ PUNTUACIONS EQUIPS LLIGA");
            System.out.println("___________________________________________________________");

            System.out.println("\nOpcions que pots triar: \n");
            System.out.println("1. Visualitza les dades dels equips");
            System.out.println("2. Visualitza els noms dels equips ordenats");
            System.out.println("3. Visualitza les dades d'un equip, per nom equip");
            System.out.println("4. Visualitza les dades de l'equip lider i de l'equip cuer");
            System.out.println("5. Introdueix dades de nou equip");
            System.out.println("6. Modificar dades d'un equip");
            System.out.println("7. Sortir");
            System.out.println("\nTria una opció: ");
            System.out.println("____________________________________________________________");

            opcio = LectorConsola.llegintEnter();

            SwitchCrida(opcio);

        } while (opcio != 7);

    }

    /**
     * En aquest metode tindrem un switch el cual tincra uns case els quals
     * tindran cridats uns metodes que faran una funcio. case 1 Visualitza les
     * dades dels equips case 2 Visualitza els noms dels equips ordenats case 3
     * Visualitza les dades d'un equip, per nom equip case 4 Visualitza les
     * dades de l'equip lider i de l'equip cuer" case 5 Introdueix dades de nou
     * equip case 6 Modificar dades d'un equip case 7 Sortir
     *
     * @param opcio Recollira la dada que li pasa l'usuari per a triar una opcio
     * al switch
     */
    public static void SwitchCrida(int opcio) {

        switch (opcio) {

            case 1:

                VisualitzacioDades.visualitzarEstadistiques();

                break;
            case 2:
                int num = 0;
                String[] equipsOrd = new String[numEquips];
                ArrayString.copiaDeUnaArray(equips, equipsOrd, numEquips);
                ArrayString.quicksorts(equipsOrd, num, numEquips);
                VisualitzacioDades.capeçeleraOrdenat();
                ArrayString.Visualitzar(equipsOrd, equips);

                break;
            case 3:

                VisualitzacioDades.cercaEquip();
                String equip = LectorConsola.llegintString();
                ArrayString.busquedaEquip(equips, equip, punts);

                break;
            case 4:

                VisualitzacioDades.capçeleraLiderCuer();
                ArrayEnter.MaxMin(punts, equips);

                break;

            case 5:

                ActualitzacióDades.introduccioDades();
          
  
                break;
            case 6:

                ActualitzacióDades.modificarDades();
                
                break;
            case 7:
                // opció de sortir del programa
                escriureDades(equips, punts);
                System.out.println("ADEU");
                break;
            default:
                // quan l'usuari prem una opció no contemplada en el menu
                System.out.println("Opció no correcta");

        }

        continuarMenu();
    }

}
