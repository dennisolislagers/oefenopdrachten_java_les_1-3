package nl.novi.opdrachten.whilelussen;

/**
 * Bekijk onderstaande while-lus.
 * Zorg ervoor dat de while-lus stopt op regel 22.
 */

public class StopTwentyTwo {
    public static void main(String[] tt) {
        int teller = 1;
        while(teller < 100) { // Deze regel mag niet aangepast worden.
            System.out.println("Getal: " + teller);
//            Door een if statement te plaatsen in de while loop met een break stop je de lus
            if (teller == 22){
                break;
            }
//            Computertaal begint bij 0, dus doen we de uitkomst +1.
            teller = teller + 1;
        }
    }
}
