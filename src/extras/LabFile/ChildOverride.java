package extras.LabFile;

class ChildOverride extends MethodOverriding {
    void Display() {
        System.out.println("This is from the child class");
    }

    public static void main(String[] args) {
        ChildOverride co = new ChildOverride();
        co.Display();
    }
}