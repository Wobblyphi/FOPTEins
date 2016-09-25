package pp.ampel;

public class Driving
{
    public static void main(String[] args)
    {
        // Initialising an array of traffic lights.
        int numOfLights = 10;
        Ampel[] trafficLights = new Ampel[numOfLights];
        for(int i = 0; i < numOfLights; i++)
        {
            trafficLights[i] = new Ampel();
        }
        
        // Controlling the traffic lights.
        for(int i = 0; i < numOfLights; i++)
        {
            ControlOfTrafficLight schaltung = new ControlOfTrafficLight(trafficLights[i]);
            schaltung.start();
        }
        
        // Initialising a car. Eventually I'd like to have several cars
        // passing several lights. But for now, I'd be happy with one
        // car passing.
        Auto auto = new Auto(trafficLights);
        auto.start();
    }

}
