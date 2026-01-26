package sweety;
import java.util.HashMap;
import java.util.Map;

public class onlineexamsystem {
	public static void main(String[] args) {
		Map<String,Integer>scores = new HashMap<>();
		//Autoboxing
		scores.put("Maths", 90); 
		scores.put("English", 85);
		scores.put("Science", 88);
		 
		int total = 0;
		//unboxing
		for(Integer score : scores.values()) {
			total+=score;
		}
		//calculate average
		double average = (double)total/scores.size();
		//display scores
		System.out.println("Subject-wise Scores:");
		for(Map.Entry<String,Integer>entry:scores.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("Total Score:"+total);
		System.out.println("Average Score:"+average);
		
		
	}
}

