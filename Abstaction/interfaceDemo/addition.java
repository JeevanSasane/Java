package Abstaction.interfaceDemo;


public class addition implements Add,sub{
    @Override
    public int add(int i, int j) {
        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i/j);
        System.out.println(i*j);
        System.out.println(i%j);
        return 0;

    }

    public static void main(String[] args) {
        addition a=new addition();
        a.add(2,6);
        a.sub(5,6);


    }

    public int sub(int i,int j)
    {
        System.out.println(i-j);
        return 0;
    }

    @Override
    public int substract(int a, int b) {
//        System.out.println(a-b);
        return 0;
    }
}
