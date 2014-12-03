import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Diese Klasse sorgt dafuer, dass man das Universum auf dem Bildschirm verfolgen kann.
 * Keine Sorge, falls Du nicht jedes Detail verstehst!
 * Grafische Oberflaechen werden ausfuehrlich in SE2 behandelt.
 * 
 * @author Fredrik Winkler
 * @version November 2014
 */
class Simulation implements ActionListener
{
    private final Universum _universum;
    private final JFrame _frame;
    
    private final JLabel _sonnensymbol;
    private final JLabel _erdsymbol;
    
    /**
     * Initialisiert die Simulation.
     */
    public Simulation()
    {
        _universum = new Universum();
        _frame = new JFrame("Eppur si muove!");
        _frame.setLayout(null);
        
        _sonnensymbol = neuesSymbol(100);
        _erdsymbol = neuesSymbol(20);
        
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.setSize(800, 600);
        _frame.setVisible(true);
        Timer timer = new Timer(20, this);
        timer.start();
    }

    /**
     * Liefert ein neues kreisrundes Zeichen, das einen Himmelskoerper darstellen soll.
     */
    private JLabel neuesSymbol(int groesse)
    {
        JLabel symbol = new JLabel("\u2609");
        symbol.setFont(new Font("Monospaced", Font.PLAIN, groesse));
        _frame.add(symbol);
        return symbol;
    }
    
    /**
     * @see ActionListener.actionPerformed
     */
    public void actionPerformed(ActionEvent ignored)
    {
        _universum.berechneEinenSchritt();
        
        setPosition(_sonnensymbol, _universum.sonneX(), _universum.sonneY());
        setPosition(_erdsymbol, _universum.erdeX(), _universum.erdeY());
    }

    /**
     * Setzt den Mittelpunkt einer Komponente auf die angegebenen Koordinaten.
     */
    private void setPosition(JComponent component, double x, double y)
    {
        Dimension size = component.getPreferredSize();
        x -= size.width * 0.5;
        y -= size.height * 0.5;
        component.setBounds((int) x, (int) y, size.width, size.height);
    }
}
