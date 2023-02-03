import java.util.*;
public class linkedlist {
    public static void main(String args[])
    {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("a");
        ll.add("b");
        ll.add("c");
        ll.add("d");
        ll.add("e");
        secondaList.addAll(ll);
        secondaList.add("Numbers");
        System.out.println("content of secondalist -"+secondaList);

        System.out.println(ll);
        for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }
        System.out.println(ll.get(3));
        System.out.println(ll.get(4));
        ll.add(6,1);
        System.out.println("update linkedlist"++ll);


    }
}

        System.out.println(ll.get(3));
        System.out.println(ll.get(4));
        ll.add(6,1);
        System.out.println("update linkedlist"++ll);
    }
}