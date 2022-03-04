package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die twee Integers ontvangt.
 * De eerste parameter heet 'number', de tweede 'divisible'
 *
 * Het is de bedoeling dat je checkt of 'number' deelbaar is door 'divisible'
 *
 * Wanneer het deelbaar is, return het volgende:
 * Het getal: %HIER GETAL% is deelbaar door %HIER DIVISIBLE%.
 * Wanneer het niet deelbaar is:
 * Het getal: %HIER GETAL% is niet deelbaar door %HIER DIVISIBLE%. Verlaag of verhoog het getal
 * %HET GETAL WAARMEE HET VERHOOGT OF VERLAAGD MOET WORDEN%
 *
 * VOORBEELD:
 *
 * De methode ontvangt de getallen 13 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 13 is niet deelbaar door 3. Verlaag het getal met 1.
 *
 * VOORBEELD 2:
 * De methode ontvangt de getallen 14 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 14 is niet deelbaar door 3. Verhoog het getal met 1.
 *
 */

public class DeelbaarDoorX {
    public static void main(String[] args) {
//        We maken de variabelen aan die later in de methode worden aangeroepen.
        System.out.println(isDivisible(23, 8));
        System.out.println(isDivisible(31, 7));
        System.out.println(isDivisible(12, 6));
        System.out.println(isDivisible(11, 4));
        System.out.println(isDivisible(19, 5));
    }
//      We maken vervolgens de methode aan die de twee variabelen gaat "bewerken".
public static String isDivisible (int number, int divisible) {
//        Om te bepalen of een getal deelbaar is gebruiken we modulo.
    if(number % divisible == 0){
        return number + " is deelbaar door "  + divisible;
       }
//    Met een Stringbuilder maken we een nieuwe string.
    StringBuilder stringBuilder = new StringBuilder();
//    Met append 'plakken' we 'iets' in de nieuwe string.
    stringBuilder.append("Het getal ").append(number).append(" is niet deelbaar door ").append(divisible)
//    Met de volgende regel stoppen we de Stringbuider.
            .append(".\r\n");

//    We maken een nieuwe variable aan die de restwaarde aangeeft na modulo.
    int restNumber = number % divisible;
//    We maken weer een nieuwe variabele aan die de restwaarde deelt door de deler.
    double deling = (double) restNumber/divisible;
// De vergelijking die ervoor zorgt dat de waarde weergeeft waar het getal mee verhoogt/verlaagd moet worden.
    if(deling < 0.50) {
        stringBuilder.append("Verlaag het getal met ").append(restNumber);
    } else {
        stringBuilder.append("Verhoog het getal met ").append(divisible-restNumber);
    }
//    De nieuwe string weergeven
    return stringBuilder.toString();
    }
}
