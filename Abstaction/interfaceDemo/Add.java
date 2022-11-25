package Abstaction.interfaceDemo;

public interface Add extends sub {
    int add(int i,int j); //Declaration of method...
}


//Interface have main 3 Types:

// 1-> Functional interface:
//              if interface contain only one method
// Name :
//  1: Runnable,Action listner, comparable


//for Example:

//public interface Add {
//    int add(int i,int j); //Declaration of method...
//}


// 2-> Normal interface:
//               if interface contain more than one method

//Name of Normal interface:
//    list, queu,dequeu,

//for Example:

//public interface Add {
//    int add(int i,int j); //Declaration of method...
//    int sub(int i,int j);
//}


// 3-> Marker interface:
//               if interface contain no any method
//Names:
//  1: Remode, clonable,serialisation
//for Example:

//public interface Add {

//}

//HomeWork:
//functional interface off java