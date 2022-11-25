package string;

public class StringReverse {

    public static void main(String[] args) {
        String str = "Welcome";
        String reverse = "";

        String string="Saigaon";

        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse.concat(String.valueOf(str.charAt(i)));
        }

//        for(int i=str.length()-1;i>=0;i--)
//        {
//            System.out.print(str.charAt(i));
//        }

//        System.out.println(reverse);
//
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());


        StringBuffer stringBuffer1=new StringBuffer(string);
        System.out.println(stringBuffer1.reverse());
    }
}
