package src;
import java .util.ArrayList;
import java.util.Scanner;
public class caluclator {
    public static void main(String[] args) {

        ArrayList n = new ArrayList();
        ArrayList<String> s = new ArrayList();
        int a = 3;

        for(int i=0;i<a;i++){
            System.out.println("Enter " + i +"th number:");
            Scanner x = new Scanner(System.in);
            n.add(x.nextInt());
            if (i <= a-2){
                System.out.println("Enter +/- :");
                Scanner y = new Scanner(System.in);
                s.add(y.next());
            }
        }

        for (int i = 0; i < a-1 ;i++){
            System.out.print(n.get(i)+" "+s.get(i)+" ");
        }
        System.out.println(n.get(a-1)+" =");

        int sum = (int) n.get(0);
        for(int i = 0; i < a-1; i++){
            switch (s.get(i)){
                case "+" :
                    sum = sum +(int) n.get(i+1);
                    break;
                case "-" :
                    sum = sum -(int) n.get(i+1);
                    break;
                default :
                    sum = sum;
                    break;
            }
        }
        System.out.println(sum);

    }
}