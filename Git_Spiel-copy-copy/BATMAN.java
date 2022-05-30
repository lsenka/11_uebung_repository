 /** Beschreiben Sie hier die Klasse BATMAN.
 * 
 * @author (Peter Brichzin) 
 * @version (Herbst 2017 )
 */
public class BATMAN extends SPIELFIGUR
{
    private String wahrerName;
    private boolean batmanKleidungAn;
    

    /**
     * Konstruktor fÃ¼r Objekte der Klasse BATMAN
     */
    public BATMAN()
    {
        super(12, 10, 10);
        wahrerName = "Bruce Wayne";
        batmanKleidungAn = false;
        
    }

    /**
     * Methode zur Rueckgabe einer Charakterbeschreibung
     * 
     * @return Charakterbeschreibung 
     */
    public String CharakterbeschreibungAlsZeichenketteGeben()
    {
        return "Batman gibt dem Verbrechen keine Chance!";
    }
    
    void EigenschaftenAusGeben()
    {
        System.out.println("Meinen wahren Namen verrate ich nicht!");
        System.out.println("Bin ich gerade in Action? " + batmanKleidungAn);
    }
    
}
