package advanced.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOExceptions {
    public static void readFile() throws FileNotFoundException {
        FileReader reader = new FileReader("data.txt");
    }
    public static void main(String[] args){
    try{
    readFile();
    }catch (IOException e){
        System.out.println(e.getMessage());
    }


    }
}
