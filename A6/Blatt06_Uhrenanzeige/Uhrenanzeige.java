
/**
 * Write a description of class Uhrenanzeige here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uhrenanzeige
{
    public Nummernanzeige stunden;
    public Nummernanzeige minuten;
    private String zeitanzeige;
    
    public Uhrenanzeige()
    {
        stunden = new Nummernanzeige(24);
        minuten = new Nummernanzeige (60);
        anzeigeAktualisieren();
    }
    
    public Uhrenanzeige(int stunde, int minute)
    {
        stunden = new Nummernanzeige(24);
        minuten = new Nummernanzeige(60);
        setzeUhrzeit(stunde, minute);
    }
    
    public void taktsignalGeben()
    {
        minuten.erhoehen();
        if(minuten.gibWert() == 0)
        {
            stunden.erhoehen();
        }
        anzeigeAktualisieren();
    }
    
    public void setzeUhrzeit(int stunde, int minute)
    {
        stunden.setzeWert(stunde);
        minuten.setzeWert(minute);
        anzeigeAktualisieren();
    }
    
    public String gibUhrzeit()
    {
        return zeitanzeige;
    }
    
    private void anzeigeAktualisieren()
    {
        zeitanzeige = stunden.gibAnzeigewert() + ":" + minuten.gibAnzeigewert();
    }
}
