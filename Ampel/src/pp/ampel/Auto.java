package pp.ampel;

public class Auto extends Thread
{
    private Ampel[] ampeln;
    
    public Auto(Ampel[] ampeln)
    {
        this.ampeln = ampeln;
        start();
    }
    
    /**
     * The car passes the traffic lights in an infinite loop.
     */
    public void run()
    {
        int i = 0;
        while(i < ampeln.length)
        {
            ampeln[i].passieren();
            System.out.println("Auto passiert Ampel" + i);
            i++;
            if(i == ampeln.length)
            {
                i = 0;
            }
        } 
    }
}
