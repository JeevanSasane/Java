package CollectionFramework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


//set dosent maintain the insertion order
//set dosent store duplicate values
public class SetDemo {

    int id;
    String name;
    String address;

     SetDemo(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetDemo setDemo = (SetDemo) o;
        return id == setDemo.id && Objects.equals(name, setDemo.name) && Objects.equals(address, setDemo.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {

        SetDemo setDemo=new SetDemo(1,"G1","Satara");
        SetDemo setDemo1=new SetDemo(1,"G1","Satara");
        SetDemo setDemo2=new SetDemo(2,"Amit","Satara");
        Set<SetDemo> set=new HashSet<>();

        set.add(setDemo);
        set.add(setDemo1);
        set.add(setDemo2);

        set.forEach(setDemo3 ->{
            System.out.println("Id:" + setDemo3.id + " Name:" + setDemo3.name + " Address:" + setDemo3.address);
        } );

    }
}

//What is Hash Map
