package pp.ampel;

/**
 * This class Ampel (traffic light) has got two methods (schalteRot and schalteGruen - turnRed and turnGreen) 
 * to turn the traffic light red or green  * (yellow not necessary. 
 * A third method "passieren" (passing) simulates the passing of
 * a car at the traffic light.
 * If the light is red, the calling Thread waits until the light
 * turns green. 
 * If the light is green, the Thread returns from the method without
 * changing the state of the traffic light. 
 * The class must have a public constructor without parameters.
 */
public class Ampel
{
    private String stateOfTrafficLight;
    
    public Ampel()
    {
        stateOfTrafficLight = "red";
    }
    
    /**
     * Turns traffic light red.
     */
    public void schalteRot()
    {
        stateOfTrafficLight = "red";
    }
    
    /**
     * Turns traffic light green.
     */
    public void schalteGruen()
    {
        stateOfTrafficLight = "green";
    }
    
    public synchronized void passieren()
    {
        while(stateOfTrafficLight.equals("red"))
        {  
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                
            }
        } 
        notifyAll();
    }
    
    public String getStateOfTrafficLight()
    {
        return stateOfTrafficLight;
    }
}
