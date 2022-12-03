package java8;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) throws Exception {

        Student student=new Student(1,null,"Pune");

        if(student.name!=null)
        {
            System.out.println(student.name.toUpperCase());
        }
        else {
            System.out.println("Name is not present");
        }

//        Optional<String > s1=Optional.empty();
//        System.out.println(s1);

//        Optional<String> s2=Optional.of(student.name);
//        System.out.println(s2);

//        Optional<String > s3=Optional.ofNullable(student.name);
//        if(s3.isPresent()) {
//            System.out.println(s3.get());
//        }

        Optional<String > s4=Optional.ofNullable(student.name);
        System.out.println(s4.orElseGet(()->"Student is null"));

        Optional<String > s5=Optional.ofNullable(student.name);
//        System.out.println(s5.orElseThrow(()->new RuntimeException("Exception")));
        System.out.println(s5.orElseThrow(()->new Exception("Exception")));


    }
}

class Student{

    int id;
    String name;
    String Address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        Address = address;
    }
}