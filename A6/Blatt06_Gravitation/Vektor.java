/**
 * Diese Klasse modelliert veraenderbare Punkte im zweidimensionalen Raum.
 * 
 * @author Fredrik Winkler
 * @version November 2014
 */
class Vektor
{
    private double _x;
    private double _y;
    
    /**
     * Initialisiert den Vektor auf den Koordinatenursprung.
     */
    public Vektor()
    {
    }

    /**
     * Initialisiert den Vektor auf die angegebenen Werte.
     */
    public Vektor(double x, double y)
    {
        _x = x;
        _y = y;
    }

    /**
     * Liefert die x-Koordinate.
     */
    public double x()
    {
        return _x;
    }
    
    /**
     * Liefert die y-Koordinate.
     */
    public double y()
    {
        return _y;
    }

    /**
     * Addiert die Koordinaten des uebergebenen Vektors auf die eigenen Koordinaten drauf.
     */
    public void addiere(Vektor summand)
    {
        _x += summand._x;
        _y += summand._y;
    }
    
    /**
     * Addiert die uebergebenen Koordinaten auf die eigenen Koordinaten drauf.
     */
    public void addiere(double summandX, double summandY)
    {
        _x += summandX;
        _y += summandY;
    }

    /**
     * Liefert einen neuen Vektor, der den Abstand zum uebergebenen Vektor darstellt.
     */
    public Vektor abstandZu(Vektor minuend)
    {
        return new Vektor(_x - minuend._x, _y - minuend._y);
    }
    
    /**
     * Liefert das Quadrat des Betrags des Vektors.
     */
    public double betragQuadrat()
    {
        return _x * _x + _y * _y;
    }
}
