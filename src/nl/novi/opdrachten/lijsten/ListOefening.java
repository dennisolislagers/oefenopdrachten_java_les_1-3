package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.List;

public class ListOefening {

    public static void main(String[] uitlegList) {

//          We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
//          Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

//          De lijst van clubNames wordt meegegeven aan de methode door een variable te maken.
        printList(clubNames);
//          De variabele die de naam van een club toevoegt aan de lijst.
        addClub("MVV", clubNames);
        addClub("RKSV Heer", clubNames);
        positionInList("mvv", clubNames);



        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen.
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");

        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");


    }
//          Vraag 1: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
//          Bovenstaande list zou dan dit zijn:
//          0 - Ajax
//          1 - PSv
//          etc...

//          Er moet een methode worden gemaakt om de lijst uit te printen, de methode zal een lijst van strings uitprinten.
    public static void printList(List<String> lijst){
//          Je gaat kijken of er iets in de lijst staat door eroverheen te loopen.
       for (String names : lijst){
           System.out.println(names);
      }
//          Nu gaan we weer loopen over de lijst en geven we de positie van de club weer.
        for (int i = 0; i<lijst.size(); i++){
//          Om de namen uit de lijst te halen gebruiken we lijst.get
            System.out.println(i + " - " + lijst.get(i));
        }
    }
//          Vraag 2: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.

//          In de methode hebben we twee variabelen omdat we met twee variabelen gaan werken, de naam van de club en de lijst van clubnamen.

    public static void addClub(String club, List<String> newClubList){
//          We gaan checken of de club in de lijst staat door eroverheen te loopen en als hij niet in de lijst voorkomt toevoegen aan de lijst.
        if(!newClubList.contains(club)){
            newClubList.add(club);
            System.out.println(newClubList);
        }
    }
//          Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.

//          Er moet iets uit de methode worden teruggegeven dus gebruiken we geen void.
//          Wederom hebben we twee variabelen nodig namelijk de naam van de club en de positie van de club in de lijst.
    public static int positionInList(String club, List<String> positionOfClub) {
//          We maken eerst een lege variabele aan die we kunnen vullen na het loopen
        int number = 0;
//          We gaan over de lijst loopen om te kijken of de club in de lijst staat.
            for (int i = 0; i < positionOfClub.size(); i++) {
//          Als de club in de lijst staat gaan we de positie van de club returnen:
//          We gebruiken ignorecase zodat de invoer niet hoofdlettergevoelig is.
                if (club.equalsIgnoreCase(positionOfClub.get(i))) {
//          Computertaal begint bij nul, dus om een goede positie te geven doen we +1
                    number = i + 1;
                    System.out.println(number);
                }
            }
        return number;
    }
}
