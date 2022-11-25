package CollectionFramework;

public class GenericDemo<T> {

    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    public static void main(String[] args) {
        GenericDemo<String> genericDemo=new GenericDemo<>();
        genericDemo.setT("Jeevan");
        System.out.println(genericDemo.getT());

        GenericDemo<Integer> genericDemo1=new GenericDemo<>();
        genericDemo1.setT(22);
        System.out.println(genericDemo1.getT());
    }
}
