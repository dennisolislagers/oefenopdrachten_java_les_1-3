package nl.novi.opdrachten.whilelussen;

public class EvenTeller {
    public static void main(String[] even) {
        /*
        Maak een while-lus.
        Deze while-lus moet net zo lang lopen tot en met de teller op 10 staat.
        Print alleen de even getallen uit!
         */
        int teller = 0;
//        De loop maken die tot 10 telt.
        while(teller <= 10){
//            Om te controleren of een nummer even is gebruiken we de modulo.
            if(teller % 2 == 0){
                System.out.println(teller);
            }
            teller++;
        }
    }
}
