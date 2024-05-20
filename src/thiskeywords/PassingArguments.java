package thiskeywords;

public class PassingArguments {
	String name;
    int age;
    PassingArguments(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String get_name() { return name; }
    public void change_name(String name)
    {
        this.name = name;
    }
    public void printDetails()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println();
    }
    public static void main(String[] args)
    {
    	PassingArguments first = new PassingArguments("Rohit", 22);
    	PassingArguments second = new PassingArguments("Balaji", 26);
        first.printDetails();
        second.printDetails();
        first.change_name("Vijay");
        System.out.println("Name has been changed to: " + first.get_name());
    }
}