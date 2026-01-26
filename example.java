package sweety;
import java.util.ArrayList;
import java.util.List;

public class example {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Renu");
        names.add("Sai");
        names.add("Renu");
        System.out.println("Names: " + names);

        names.add(3, "Ashu");
        System.out.println("adding elements " + names);

        System.out.println("getting element " + names.get(2));

        names.remove("Renu");
        System.out.println("remove one element " + names);

        System.out.println(" size of the list " + names.size());

        System.out.println("the name is present in the list or not " + names.contains("Sai"));

        System.out.println(" finding index " + names.indexOf("Sai"));
    }
}
