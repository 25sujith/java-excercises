import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Serialization {
    public static void main(String args[]){
        try{
            Student s1 =new Student(211,"sujith");
            FileOutputStream fout=new FileOutputStream("/C://Microsoft//javademo//SUJITH//src//sujith@.txt/");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }catch(Exception e){System.out.println(e);}
    }
}

