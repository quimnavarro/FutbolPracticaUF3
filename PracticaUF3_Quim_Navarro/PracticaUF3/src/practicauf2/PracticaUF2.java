package practicauf2;

import static primerNivellDescomposiscio.PrimerNivellDescomposisció.*;
import static practicaUF3PersistenciaDades.PersistenciaDeDadesPracticaUF3.llegirDades;
import utils.arrays.ArrayString;

/**
 * Aquesta classe conte el progrma de la lliga, la qual ens permet visualitzar,ordenar,buscar,modificar i afegir equips.
 * @author Quim Navarro Clares
 */

public class PracticaUF2 {

    /**
     * Cridarem al metode copia de dos arrays per copiar les arrays de equipCodi i punsCodi a equips i punts.
     * Cridarem al metode menu crida que ens permetra ejecutar la nostra aplicacio
     * @param args 
     */
    public static void main(String[] args) {
  
        ArrayString.copiaDeDosArray(equips, equipsCodi, punts, puntsCodi);
        llegirDades(equips,punts);
        for (int i = 20; i < equips.length; i++){
            if (equips[i] != null){
                ++numEquips;
            }
        }
        menuCrida();
        
    }
    
}
