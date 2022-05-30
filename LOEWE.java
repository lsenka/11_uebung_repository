public class LOEWE implements Audio
{
    int alter;
    int gewicht;
    
    LOEWE(int alterNeu, int gewichtNeu)
    {
        gewicht = gewichtNeu;
        alter = alterNeu;
    }
    
    public String lautGeben() {
        return "RRRRRooooaaaRRRR";
    }
}