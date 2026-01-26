package sweety;
 
public class multiplecatch {
public static void main(String[] args)
{
try {
	int arr[]= new int[5];
	int a = 20;
	int b = 0;
	int result = a / b;
	
	System.out.println(result);
	
	}
	 catch(ArithmeticException e)
	{
	System.out.println("cannot divide by zero");
	}
 
	catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("Array index out of range");
}
catch (Exception e)
{
		System.out.println("some other Exception occurred");
}
}
}