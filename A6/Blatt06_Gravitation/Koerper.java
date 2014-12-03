/**
 * Diese Klasse modelliert einen physikalischen Koerper im zweidimensionalen Raum.
 * Jeder Koerper hat eine festgelegte Masse, die sich nicht aendert.
 * Weiterhin hat ein Koerper eine momentane Position und Geschwindigkeit.
 * 
 * Fuer die Aenderung der Geschwindigkeit wird eine Beschleunigung verwendet.
 * 
 * ACHTUNG: Da die Beschleunigung von der Position abhaengt, ist es wichtig,
 * dass zunaechst fuer alle beteiligten Koerper die Beschleunigung angepasst wird,
 * und erst anschliessend fuer alle beteiligten Koerper die Geschwindigkeit und Position!
 * 
 * @author Fredrik Winkler
 * @version November 2014
 */
class Koerper
{
    private final double _masse;
    
    private Vektor _position;
    private Vektor _geschwindigkeit;

    private double _beschleunigungX;
    private double _beschleunigungY;
    
    /**
     * Initialisiert einen Koerper auf die angegebene Masse, Position und Geschwindigkeit.
     */
    public Koerper(double masse, Vektor position, Vektor geschwindigkeit)
    {
        _masse = masse;
        _position = position;
        _geschwindigkeit = geschwindigkeit;

        _beschleunigungX = 0;
        _beschleunigungY = 0;
    }

    /**
     * Liefert die Position.
     */
    public Vektor gibPosition()
    {
        return _position;
    }

    /**
     * Passt die Beschleunigung gemaess Abstand und Masse des uebergebenen Koerpers an.
     * Diese Methode sollte im ersten Schritt fuer alle beteiligten Koerper aufgerufen werden.
     */
    public void spuereDenEinflussVon(Koerper einfluss)
    {
        Vektor abstand = einfluss._position.abstandZu(_position);
        double w = einfluss._masse * Math.pow(abstand.betragQuadrat(), -1.5);
        
        _beschleunigungX += w * abstand.x();
        _beschleunigungY += w * abstand.y();
    }
    
    /**
     * Passt die Geschwindigkeit und die Position gemaess der Beschleunigung an.
     * Diese Methode sollte im zweiten Schritt fuer alle beteiligten Koerper aufgerufen werden.
     */
    public void beruecksichtigeAlleEinfluesse()
    {
        _geschwindigkeit.addiere(_beschleunigungX, _beschleunigungY);
        _position.addiere(_geschwindigkeit);
        
        _beschleunigungX = 0;
        _beschleunigungY = 0;
    }
}
