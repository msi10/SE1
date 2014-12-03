
/**
 * Write a description of class Ueberweisungsmanager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ueberweisungsmanager
{
    //Die Methode zum überweisen von einem QuellKonto in ein ZielKonto.
    public void ueberweisen (Konto quellKonto, Konto zielKonto, int betrag)
    {
        if (quellKonto != null && zielKonto !=null) //Damit Konto nicht NULL gesetzt werden kann
        {
        quellKonto.hebeAb(betrag);  //es wird die Methode zum abheben, definiert in der Klasse Konto, aufgerufen 
        zielKonto.zahleEin(betrag); //es wird die Methode zum einzahlen, definiert in der Klasse Konto, aufgerufen
        }
    }

}

