/**
 * Die Klasse SPIELFIGUR ist eine Oberklasse für die Akteure 
 * in einem Videospiel.
 * 
 * @author (Peter Brichzin) 
 * @version (Version 2 Herbst 2017)
 */
public abstract class SPIELFIGUR
{
    private int geschicklichkeit;
    private int geschwindigkeit;
    private int staerke;

    /**
     * Konstruktor für Objekte der Klasse SPIELFIGUR
     * @param Staerke
     * @param Geschicklichkeit
     * @param Geschwindigkeit
     */
    public SPIELFIGUR(int geschicklichkeitNeu, int geschwindigkeitNeu, int staerkeNeu)
    {
        if (staerkeNeu<=20)
        {
            staerke = staerkeNeu;
        }
        else
        {
            staerke=0;
        }
        if (geschicklichkeitNeu<=20)
        {
            geschicklichkeit = geschicklichkeitNeu;
        }
        else
        {
            geschicklichkeit=0;
        }
        if (geschwindigkeitNeu<=20)
        {
            geschwindigkeit = geschwindigkeitNeu;
        }
        else
        {
            geschwindigkeit=0;
        }
       
        
        if(staerke + geschicklichkeit + geschwindigkeit >40)
        {
            staerke=0;
            geschicklichkeit=0;
            geschwindigkeit=0;
        }
      }

    /**
     * Gibt die Geschicklichkeit zurück.
     * 
     * @return        staerke
     */
    public int GeschicklichkeitGeben()
    {
        return geschicklichkeit;
    }
    
    /**
     * Gibt die Geschwindigkeit zurück.
     * 
     * @return        staerke
     */
    public int GeschwindigkeitGeben()
    {
        return geschwindigkeit;
    }
    
    /**
     * Gibt die Staerke zurück.
     * 
     * @return        staerke
     */
    public int StaerkeGeben()
    {
        return staerke;
    }
    
   
    /**
     * Methode zur Rueckgabe einer Charakterbeschreibung
     * Implementierung der abstracten Methode der Oberklasse
     * Mit Charakterbeschreibung ist ein einpraegsamer Satz oder Slogan gemeint, 
     * mit dem die Spielfigur vorgestellt wird
     * 
     * @return Charakterbeschreibung 
     */
    abstract String CharakterbeschreibungAlsZeichenketteGeben();
    
    /**
     * Spielfigur
     * 
     * @return Charakterbeschreibung 
     */
    void EigenschaftenAusGeben()
    {
        System.out.println("Methode EigenschaftenAusGeben wurde in der Unterklasse noch nicht implementiert!");
    }
    
    
    
}