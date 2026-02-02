package LabFile;

public class Polymorphism {
    public static void main(String[] args){
        Animal Herbivores = new Herbivores();
        Animal Carnivores = new Carnivores();
        Herbivores.Food();
        Carnivores.Food();
    }
}

class Animal{
    void Food(){
        System.out.println("Animal Eats");
    }
}
class Herbivores extends Animal{
    void Food(){
        System.out.println("Herbivores eat plants");
    }
}
class Carnivores extends Animal{
    void Food(){
        System.out.println("Carnivores eat meat");
    }
}
