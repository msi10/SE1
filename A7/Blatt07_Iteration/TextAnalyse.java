/**
 * Diese Klasse bietet die Moeglichkeit, Texte zu analysieren.
 * Sie dient als Einstieg in Schleifenkonstrukte und zeigt in
 * der Methode istFrage beispielhaft einige Methodenaufrufe an
 * einem Objekt der Klasse String.
 * 
 * @author Fredrik Winkler
 * @author Joerg Rathlev
 * @author Petra Becker-Pechau
 * @version November 2014
 */
class TextAnalyse
{
    /**
     * Ermittelt, ob es sich bei dem uebergebenen Text um eine Frage
     * handelt. Eine Frage erkennt man am abschliessenden Fragezeichen.
     * 
     * @param text der zu analysierende Text
     * @return true, wenn es sich um eine Frage handelt, false sonst
     */
    public boolean istFrage(String text)
    {
        int anzahlZeichen = text.length();

        int letztePosition = anzahlZeichen - 1;

        char letztesZeichen = text.charAt(letztePosition);

        boolean endetAufFragezeichen = (letztesZeichen == '?');

        return endetAufFragezeichen;
    }

    /**
     * Ermittelt, ob es sich bei dem uebergebenen Text um eine Frage
     * handelt. Eine Frage erkennt man am abschliessenden Fragezeichen.
     * 
     * @param text der zu analysierende Text
     * @return true, wenn es sich um eine Frage handelt, false sonst
     */
    public boolean istFrageKompakt(String text)
    {
        return text.charAt(text.length() - 1) == '?';
    }
}
