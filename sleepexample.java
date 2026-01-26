package sweety;

public class sleepexample extends Thread {
public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args)
{
	 sleepexample t1=new  sleepexample();
	 sleepexample t2=new  sleepexample();
	
	 t1.setName("Thread-1");
	 t2.setName("Thread-2");
	 t1.start();
	 t2.start();
}
}


 