package extras.LabFile;

class Human {
    void child1(){
        System.out.println("Human is the final stage of the evolution");
    }
}
class Man extends Human{
    void child2(){
        System.out.println("Man is the symbol of masculinity and is more matured than he used to be");
    }
}
class Boy extends Man{
    void child3(){
        System.out.println("Boy is not matured and would rather make stupid decisions.");
    }
    public static void main(String[] args){
        Boy boy = new Boy();
        boy.child1();
        boy.child2();
        boy.child3();

    }
}

