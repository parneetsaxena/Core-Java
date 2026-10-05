package foundations.fileIO;

import java.io.*;

public class ObjectSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Demo demo = new Demo();
        demo.name = "Project America";
        demo.number = 6;
        File file = new File("MyFile.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(demo);


        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Demo d2 = (Demo)ois.readObject();
        System.out.println(d2.name);
    }

}

class Demo implements Serializable{
    int number;
    String name;
}