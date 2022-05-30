import java.util.Random; 
/**
 * Die Klasse SPIELER enthaehlt ein Feld mit Referenzen auf verschiedene Spielfiguren.
 * Die Spielfiguren koennen gegeneinander antreten.
 * 
 * @author (Peter Brichzin) 
 * @version (19.10.2015)
 */
public class SPIEL
{
    private SPIELFIGUR[] spielfiguren;
    private Random zufallsgenerator;

    /**
     * Konstruktor für Objekte der Klasse SPIELER
     */
    public SPIEL()
    {
        spielfiguren = new SPIELFIGUR[2];
        spielfiguren[0] = new FLUFFI();
        spielfiguren[1] = new BATMAN();
         
       
        zufallsgenerator = new Random();
    }

    /**
     * SpielfigurenVorstellen stellt die beteiligten Spielfiguren 
     * ueber eine Ausgabe an der Standardkonsole vor.
     */
    public void SpielfigurenVorstellen()
    {
        for(int i=0; i<spielfiguren.length; i= i+1)
        {
            System.out.println("We present our " + (i+1) + ". Character: ");

            System.out.println(spielfiguren[i].CharakterbeschreibungAlsZeichenketteGeben());
            //System.out.println("Geschicklichkeit:" + spielfiguren[i].GeschicklichkeitGeben());
            //System.out.println("Geschwindigkeit:" + spielfiguren[i].StaerkeGeben());
            //System.out.println("Staerke:" + spielfiguren[i].GeschicklichkeitGeben());
            spielfiguren[i].EigenschaftenAusGeben();
            System.out.println("----------------------------------------");

        }

    }

    /**
     * Beim Austragen des Wettkamps messen sich jeweils zwei Spielfiguren 
     * in Staerke, Geschwindigkeit oder GEschicklichkeit. Der Verlierer scheidet aus.
     */
    public void WettkampfAustragen()
    {
        //temporaeres Attribut, um zu speichern, welche Spielfiuren schon verloren haben
        boolean[] verloren;
        verloren = new boolean[spielfiguren.length];
        for(int i=0; i<verloren.length; i= i +1)
        {
            verloren[i]=false;
        }

        //temporaere Attribute, um die Indizes der beiden wettkaempfer zu speichern
        int wettkaempfer, gegner;
        wettkaempfer = 0;
        // gegner wird nicht initialisiert, sondern auf Basis des Wettkaempfer-Index berechnet

        //zyklisches Antreten gegeneinander, wobei zufaellig ausgewaehlt wird
        // ob Staerke, Geschwindigkeit oder Geschick verglichen wird.
        for(int j=1; j<spielfiguren.length; j= j+1)
        {
            // Bestimmung der Wettkampfdisziplin ueber eine zufallszahl
            int disziplin = zufallsgenerator.nextInt(3);
            if (disziplin == 0)
            {
                wettkaempfer = WettkaempferErmitteln(wettkaempfer, verloren);
                gegner =WettkaempferErmitteln(wettkaempfer+1, verloren);
                if(spielfiguren[wettkaempfer].StaerkeGeben()>spielfiguren[gegner].StaerkeGeben())
                {
                    verloren[gegner] = true;
                    System.out.println("Leider draussen wegen zu geringer Staerke ist: " );
                    System.out.println(spielfiguren[gegner].CharakterbeschreibungAlsZeichenketteGeben());

                }
                else
                {
                    verloren[wettkaempfer] = true;
                    System.out.println("Leider draussen wegen zu geringer Staerke ist: " );
                    System.out.println(spielfiguren[wettkaempfer].CharakterbeschreibungAlsZeichenketteGeben());

                }
                wettkaempfer = (gegner +1);
            }
            else if (disziplin == 1)
            {
                wettkaempfer = WettkaempferErmitteln(wettkaempfer, verloren);
                gegner =WettkaempferErmitteln(wettkaempfer+1, verloren);
                if(spielfiguren[wettkaempfer].GeschwindigkeitGeben()>spielfiguren[gegner].GeschwindigkeitGeben())
                {
                    verloren[gegner] = true;
                    System.out.println("Leider draussen wegen zu geringer Geschwindigkeit ist: "); 
                    System.out.println(spielfiguren[gegner].CharakterbeschreibungAlsZeichenketteGeben());

                }
                else
                {
                    verloren[wettkaempfer] = true;
                    System.out.println("Leider draussen wegen zu geringer Geschicklichkeit ist: "); 
                    System.out.println(spielfiguren[wettkaempfer].CharakterbeschreibungAlsZeichenketteGeben());

                }
                wettkaempfer = (gegner +1);
            }
            else if (disziplin == 2)
            {
                wettkaempfer = WettkaempferErmitteln(wettkaempfer, verloren);
                gegner =WettkaempferErmitteln(wettkaempfer+1, verloren);
                if(spielfiguren[wettkaempfer].GeschicklichkeitGeben()>spielfiguren[gegner].GeschicklichkeitGeben())
                {
                    verloren[gegner] = true;
                    System.out.println("Leider draussen wegen zu geringer Staerke ist: "); 
                    System.out.println(spielfiguren[gegner].CharakterbeschreibungAlsZeichenketteGeben());

                }
                else
                {
                    verloren[wettkaempfer] = true;
                    System.out.println("Leider draussen wegen zu geringer Staerke ist: "); 
                    System.out.println(spielfiguren[wettkaempfer].CharakterbeschreibungAlsZeichenketteGeben());

                }
                wettkaempfer = (gegner +1);
            }
        }

        System.out.println();
        System.out.println("************************************************* "); 
        System.out.println("And the winner is: " 
            + spielfiguren[GewinnerErmitteln(verloren)].CharakterbeschreibungAlsZeichenketteGeben());
        System.out.println("************************************************* "); 

    }

    private int GewinnerErmitteln(boolean[] verloren)
    {
        int gewinnerIndex;
        gewinnerIndex = 0;
        for(int i=0; i<verloren.length; i= i +1)
        {
            if(verloren[i]==false)
            {
                gewinnerIndex = i;
            }
        }

        return gewinnerIndex;

    }

    /**
     * Beim Austragen des Wettkamps messen sich jeweils zwei Spielfiguren 
     * in Staerke, Geschwindigkeit oder GEschicklichkeit. Der Verlierer scheidet aus.
     */
    private int WettkaempferErmitteln(int index, boolean[] verloren)
    {
        index= index%spielfiguren.length;
        while(verloren[index] == true)
        {
            index = (index +1)%spielfiguren.length;
        }

        return index;

    }

}