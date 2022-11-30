package java8;

public class CapitalFirstLatter {

    public static String firstLatterCapital(String str){
        return str.replace(str.substring(0,1),new String(String.valueOf(str.charAt(0))).toUpperCase());
    }
    public static void main(String[] args) {
        Myinterface8 myinterface8=CapitalFirstLatter::firstLatterCapital;
        System.out.println(myinterface8.capital("jeevan"));

    }
}

interface Myinterface8{

    String capital(String str);
}