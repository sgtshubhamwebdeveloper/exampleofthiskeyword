package thiskeywords;

public class Displayvalue {
    int a;
    int b;
    Displayvalue()
    {
        a = 10;
        b = 20;
    }
    void Displayvalue(Displayvalue obj)
    {
        System.out.println("a = " + obj.a + "  b = " + obj.b);
    }
    void get() 
    { 
    	Displayvalue(this); 
    }
    public static void main(String[] args)
    {
    	Displayvalue object = new Displayvalue();
        object.get();
    }
}