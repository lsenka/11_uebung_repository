/**
 * FLUFFIs sind niedliche kleine Tiere aus einem fernen Land.
 * 
 * @author (Peter Brichzin) 
 * @version (VErsion 1)
 */
public class FLUFFI extends SPIELFIGUR
{
    private String farbe;
    private String fell;
    private String unsichtbar;

    /**
     * Konstruktor fuer Objekte der Klasse FLUFFI
     */
    public FLUFFI()
    {
        super(15, 10, 5); 
        farbe = "Das Fluffi hat verschiedene Gruenschattierungen wie ein Stein, auf dem verschiedene Moosarten wachsen.";         
        fell = "Das Fell ist wahnsinnig kuschelig!";
        unsichtbar = "Ein Fluffi kann sich durch Luftanhalten fuer ca. 2 Minuten unsichtbar machen.";         
    }

    /**
    /**
     * Methode zur Rueckgabe einer Charakterbeschreibung
     * Implementierung der abstracten Methode der Oberklasse
     * 
     * @return Charakterbeschreibung 
     */
    public String CharakterbeschreibungAlsZeichenketteGeben()
    {
        return "Kuschel ein Fluffi und du wirst es nie wieder los!";
        
    }
    
    
    
}