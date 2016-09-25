package pp.ampel;

/**
 * This class must be extended from Thread. In the constructor a 
 * reference to an array of traffic lights must be committed (?given?). 
 * This reference is saved in an attribute of the class Auto (car). In the
 * run-method, all traffic lights of the array are passed in an infinite loop,
 * i.e. after passing the last traffic light, the first traffic light
 * is passed again. *
 */

public class ControlOfTrafficLight extends Thread
{
    private Ampel trafficLight;
    
    public ControlOfTrafficLight(Ampel ampel)
    {
        this.trafficLight = ampel;
    }
    
    public void run()
    {
        ControlOfTrafficLight control = new ControlOfTrafficLight(trafficLight);
        synchronized(control)
        {
        while(true)
        {
            trafficLight.schalteRot();
            try
            {
                control.wait(1);
            }
            catch(InterruptedException e)
            {
            }
            trafficLight.schalteGruen();
            try
            {
                control.wait((long) 0.5);
            }
            catch(InterruptedException e)
            {
            }    
        }  
        }
    }
}
