package pp.counter;

public class Counting
{
    public static void main(String[] args)
    {
        int min = 0;
        int max = 10;
        int numOfCounts = 3;
        BoundedCounter counter = new BoundedCounter(min,max);
        
        UpThread tUp = new UpThread(counter, numOfCounts);
        DownThread tDown = new DownThread(counter, numOfCounts);
        tUp.start();
        tDown.start();
    }

}
