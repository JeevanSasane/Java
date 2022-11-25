package operators;

//Notes :-

//Operators in java:
//1: Unary ->  a++,++a,a--,--a
//2: assignment-> =,==,!=
//3: arithmetic -> +,-,*,/,%
//4: relational -> <,>,<=,>=
//5: shift -> <<,>>
//6: logical -> &&,||
//7: bitwise -> &,|
//8: ternary -> ?,:

public class OperatorsDemo {
    public static void main(String[] args) {

        int i=10;

//        System.out.println(i++); //10  i=i+1
//        System.out.println(++i); //12  i+1=i
//        System.out.println(i--); //12  i=i-1
//        System.out.println(--i); //10  i-1=i


//        Shift Operator
//        System.out.println(i<<2); // i=i*2^2 = 40
//        System.out.println(i>>2); // i=i/2^2 = 2.5

//      Logical Operators

        int a=15;
        int b=8;

        System.out.println(a&b);
        System.out.println(a|b);

    }
}
