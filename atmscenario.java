package sweety;
import java.util.InputMismatchException;
import java.util.Scanner;

public class atmscenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int orgPin = 1234;
		try {		
			System.out.println("Enter your Pin :");
			int pin = sc.nextInt();
		  if(pin == orgPin) {		  
			  System.out.println("Pin Got Matched ");
		  }else {
			  System.out.println("Wrong Pin ");		  
		  }
		}catch(InputMismatchException e) {
			System.out.println("Input should be Integer " + e);
		}
		finally{
			System.out.println("Logged Completed");
			
		}
	 

	}

}
