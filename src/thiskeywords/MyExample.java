package thiskeywords;

public class MyExample {

    int age;
    MyExample(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        MyExample obj = new MyExample(8);
        System.out.println("obj.age = " + obj.age);
    }
}