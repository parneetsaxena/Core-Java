package oop.classes;

public class PassByValue {
    public static void decrease(int n1,int n2){
        n1--;
        n2 = n2-2;
        System.out.println(n1 + ":"+ n2);
    }
    public static int makeTwice(int val){
        return val*2;
    }

    public static void main(String[] args) {
        int p = 20;
        int q = 25;
        decrease(p,q);
        System.out.println(p+":"+q);
        int value = 20;
        makeTwice(value);
        System.out.println(value);
    }
}
