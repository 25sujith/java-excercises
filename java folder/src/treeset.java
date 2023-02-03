import java.util.*;
public class treeset {
    public static void main(String[] args)
    {
        // Creating a Set interface with reference to
        // TreeSet
        Set<String> ts1 = new TreeSet<>();

        // Elements are added using add() method
        ts1.add("A");
        ts1.add("B");
        ts1.add("C");
        ts1.add("f");
        ts1.add("h");
        System.out.println(ts1);

        ts1.remove("A");
        ts1.remove("f");

        System.out.println(ts1);
        System.out.println((ts1.contains("S")) ? "true" : "false");
        Iterator<String> i = ts1.iterator();
        while (i.hasNext())
            System.out.println(i.next());


    }
}

