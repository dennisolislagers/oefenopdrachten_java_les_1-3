package nl.novi.opdrachten.whilelussen;

public class Snoepjes {

    public static void main (String[] snoepjes) {
        int aantalSnoepjes = 22;
//          De loop maken die telt zo lang het aantal snoepjes groter is dan 0.
        while(aantalSnoepjes > 0) {
            System.out.println("Er zijn nog " + aantalSnoepjes + " snoepjes over. Tijd om er nog een op te eten.");
//           Bij elke stap wordt het aantal snoepjes kleiner.
            aantalSnoepjes--;
        }
//        Als de loop klaar is wordt het volgende uitgeprint.
        System.out.println("De snoepjes zijn op.");
    }
}
