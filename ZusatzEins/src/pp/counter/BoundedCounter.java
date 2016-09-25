package pp.counter;

public class BoundedCounter
{
    private int min;
    private int max;
    private int counter;
    
    public BoundedCounter(int min, int max)
    {
        if (min >= max)
        {
            throw new IllegalArgumentException();
        }
        this.min = min;
        this.max = max;
        counter = min;
    }
    
    public synchronized void up()
    {
        while (counter == max)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
            }
        }
        counter++;
        System.out.println("new counter = " + counter);
    }
 
    public synchronized void down()
    {
        while (counter == min)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
            }
        }
        counter--;
        System.out.println("new counter = " + counter);
    }
    
    public int getCounter()
    {
        return counter;
    }
}