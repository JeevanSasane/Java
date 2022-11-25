package CollectionFramework;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

class Student2
{
    int id;
    String name;
    String address;
    Student2(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
}
public class Student {

    public static void main(String[] args) {

        List<Student2> list=new ArrayList<>();

        Student student=new Student();
        Student2 s1=new Student2(1,"Jeevan","Satara");
    }


}

