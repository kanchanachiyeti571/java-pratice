package sweety;
import java.util.LinkedList;
public class HospitalQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>patients=new LinkedList<>();
		patients.add("Ravi");
		patients.add("Sita");
		patients.add("Aman");
		System.out.println("Initial Queue:"+patients);
		//Emergency patient
		patients.addFirst("Emergency - John");
		System.out.println("After Emergency Case:"+patients);
		//remove
		String treated=patients.removeFirst();
		System.out.println("Treated patient:"+treated);
		//all patients
		System.out.println("Current Queue:"+patients);
		//first and last
		System.out.println("First patient:"+patients.getFirst());
		System.out.println("Last patient:"+patients.getLast());

	}

}
