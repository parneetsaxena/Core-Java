package foundations.problems;

public class GenericPair<K,V> {
    K key;
    V value;
//    GenericPair(K key, V value){
//        this.key = key;
//        this.value = value;
//    }
    public void setValues(K key, V value){
        this.key = key;
        this.value = value;
    }
    public void getValues(){
        System.out.println("Key: "+key + ". Value: "+ value);
    }

    public static void main(String[] args) {
        GenericPair<String, Integer> info = new GenericPair<>();
        info.setValues("Ravi",23);
        info.getValues();

        GenericPair<Double, Integer> bodyinfo = new GenericPair<>();
        bodyinfo.setValues(68.3,170);
        bodyinfo.getValues();

        GenericPair<Integer, Boolean> poverty = new GenericPair<>();
        poverty.setValues(200000,true);
        poverty.getValues();
    }
}
