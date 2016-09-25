package pp.counter;

public class DownThread extends Thread
{
    private BoundedCounter counter;
    private int m;

    public DownThread(BoundedCounter bc, int m)
    {
        counter = bc;
        this.m = m;
    }

    public void run()
    {
        for (int i = 0; i < m; i++)
        {
            counter.down();
        }
    }
}
