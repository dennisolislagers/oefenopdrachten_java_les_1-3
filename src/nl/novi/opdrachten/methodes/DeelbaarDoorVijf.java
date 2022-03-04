package nl.novi.opdrachten.methodes;

import org.w3c.dom.ls.LSOutput;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {

    public static void main(String[] sammieKijkOmhoog){
        int chosenNumber = 44;
//        Om te bepalen dat een getal deelbaar is door een ander getal gebruiken we de modulo (%), er blijft een restwaarde over indien niet deelbaar
        if(chosenNumber % 5 == 0){
            System.out.println("Het getal is deelbaar door 5!!");
        }
        else{
            System.out.println("Het getal is niet deelbaar door 5!!!");
        }
    }
}
