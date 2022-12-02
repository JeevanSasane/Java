package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmpDemo {

    int id;
    String name;
    Double salary;

    public EmpDemo(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmpDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {


        EmpDemo empDemo1=new EmpDemo(1,"J",10000.0);
        EmpDemo empDemo2=new EmpDemo(2,"A",20000.0);
        EmpDemo empDemo3=new EmpDemo(3,"C",25000.0);

        List<EmpDemo>list =new ArrayList<>();
        list.add(empDemo1);
        list.add(empDemo2);
        list.add(empDemo3);

        Predicate<EmpDemo> predicate = empDemo -> empDemo.salary>10000;
        list.stream().filter(predicate).forEach(System.out::println);
    }

}
