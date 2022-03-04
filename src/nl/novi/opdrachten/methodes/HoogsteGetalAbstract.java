package nl.novi.opdrachten.methodes;

// De twee utilities van java moeten worden geïmporteerd om later gebruikt te kunnen worden.

import java.util.Arrays;
import java.util.List;

///**
// * Schrijf een methode  die een List<Integer> ontvangt.
// *
// * Wanneer er twee getallen of meer in zijn:
// * Return het volgende:
// * "Het hoogste getal van de gegeven getallen is: %GETAL%"
// *
// * Je mag hier geen Collections.sort of java.streams gebruiken.
// *
// */
//public class HoogsteGetalAbstract {
////    We maken eerst de methode met de lijst van nummers.
//    public static void main(String[] args) {
//        highestNumber (Arrays.asList(1,2,6,88,999,3345));
//    }
////  Vervolgens maken we de methode die de variabele highestNumber gaat bewerken.
//    public static String highestNumber (List<Integer> numbers) {
////        We maken een variabele aan waar we de getallen uit de loop gaan inzetten.
//        int numberIsTheHighest = 0;
////        Nu gaan we loopen over lijst van nummers en als het nummer in de lijst groter is dan in de variable wordt het nummer in de variabele vervangen.
//        for(int number : numbers) {
//            if(number > numberIsTheHighest) {
//                numberIsTheHighest = number;
//            }
//        }
////        Nu returnen we de uitkomst.
//        return "Het hoogste getal in de lijst is: " + numberIsTheHighest;
//    }
//}

public class HoogsteGetalAbstract {

    public static void main(String[] args) {
        highestNumber(Arrays.asList(1,2,3,4,5,6,22,333,555,7777));
    }

    public static String highestNumber(List<Integer> numbers) {
        int hoogsteGetal = 0;
        for(int number : numbers) {
            if(number > hoogsteGetal) {
                hoogsteGetal = number;
            }
        }
        return "Het hoogste getal van de gegeven getallen is: " + hoogsteGetal;
    }

}


