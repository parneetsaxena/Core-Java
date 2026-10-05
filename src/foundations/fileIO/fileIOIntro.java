package foundations.fileIO;

import java.io.*;

public class fileIOIntro {
    public static void main(String[] args) throws IOException {
        File f = new File("demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Hello There");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();

        System.out.println(str);
    }
}
