package LabFile;

    public class Interfaces implements Milkha{
        public void Run(){
            System.out.println("Bhaag Milkha Bhaag");
        }
        public void Stop(){
            System.out.println("Ruk ja Milkha");
        }
        public static void main(String[] args){
            Interfaces interface1 = new Interfaces();
            interface1.Run();
            interface1.Stop();
        }
    }


