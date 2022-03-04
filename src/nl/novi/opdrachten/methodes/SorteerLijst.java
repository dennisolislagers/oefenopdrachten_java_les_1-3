package nl.novi.opdrachten.methodes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Om de nummers van positie te ruilen hebben we straks de swap methode nodig uit de java.collections
import java.util.Collections;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Check in de methode of deze list 3 entries heeft.
 *
 * Wanneer dit niet zo is: return de foutmelding: "Er zijn te veel of te weinig getallen in de lijst."
 * BONUS: Kun je een foutmelding voor te veel en een foutmelding voor te weinig maken?
 *
 * Wanneer er wel drie getallen in zijn:
 * Return het volgende:
 * Een list met getallen gesorteerd van laag naar hoog.
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class SorteerLijst {

    public static void main(String[] argeblabla) {

        List<Integer> wrongList = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8));
        List<Integer> correctList1 = new ArrayList<>(Arrays.asList(88, 888, 909909));
//        We maken nog drie extra variabele lijsten aan om de methode te controleren.
        List<Integer> correctList2 = new ArrayList<>(Arrays.asList(888, 88, 909909));
        List<Integer> correctList3 = new ArrayList<>(Arrays.asList(88, 909909, 888));
        List<Integer> correctList4 = new ArrayList<>(Arrays.asList(909909, 888, 88));

//        Van de variabelen moet een nieuwe variabel worden aangesproken om later in de methode te kunnen bewerken.
        System.out.println(sortList(wrongList));
        System.out.println(sortList(correctList1));
        System.out.println(sortList(correctList2));
        System.out.println(sortList(correctList3));
        System.out.println(sortList(correctList4));
    }
//    Er is de nieuwe variable sortList aangemaakt die we in de volgende methode gaan bewerken.
public static String sortList(List<Integer> numbers) {
//        We maken de vergelijking dat als er een andere hoeveelheid nummers als 3 in de verzameling staat er een melding komt.
    if(numbers.size() != 3) {
        return "Er zijn te veel of te weinig getallen in de lijst.";
    }
//    We gaan de nummers uit de lijst halen en met elkaar vergelijken en als ze aan de voorwaarde voldoen omwisselen.
    if(numbers.get(0) > numbers.get(1)) {
        Collections.swap(numbers, 0, 1);
    }
    if(numbers.get(1) > numbers.get(2)) {
        Collections.swap(numbers, 1, 2);
        if(numbers.get(0) > numbers.get(1)) {
            Collections.swap(numbers, 0, 1);
        }
    }
//    Om een nieuwe string te maken wordt Stringbuilder gebruikt, dit heb ik ook uit de oplossingen.
    StringBuilder stringBuilder = new StringBuilder();
    for (Integer i : numbers) {
        stringBuilder.append(i).append(" ");
    }
    return stringBuilder.toString();
}
}
