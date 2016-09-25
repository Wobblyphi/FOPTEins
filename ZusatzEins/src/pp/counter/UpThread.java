package pp.counter;

public class UpThread extends Thread
{
    private BoundedCounter counter;
    private int n;
    
    public UpThread(BoundedCounter bc, int n)
    {
        counter = bc;
        this.n = n;
    }
    
    public void run()
    {
        for (int i = 0; i < n; i++)
        {
            counter.down();
        }
    }
    
}
