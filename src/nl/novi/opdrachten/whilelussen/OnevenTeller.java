package nl.novi.opdrachten.whilelussen;

public class OnevenTeller {
    public static void main(String[] oneven) {
        /*
        Maak een while-lus.
        Deze while-lus moet net zo lang lopen tot en met de teller op 10 staat.
        Print alleen de oneven getallen uit!
         */
        int teller = 0;
//         De teller maken die tot 10 telt.
        while (teller <= 10){
//            Om te controleren of een getal oneven is gebruiken we de modulo (geeft restwaarde 1 als het getal niet deelbaar is door 2).
            if (teller % 2 == 1){
                System.out.println(teller);
            }
            teller++;
        }
    }
}
