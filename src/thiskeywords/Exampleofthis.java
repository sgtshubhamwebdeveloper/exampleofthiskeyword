package thiskeywords;

public class Exampleofthis {

    private int a, b;
    private  Exampleofthis( int i, int j ) {
        this.a = i;
        this.b = j;
    }
    private  Exampleofthis(int i) {
        this(i, i); 
    }
    private Exampleofthis() {
        
        this(0);
    }

    @Override
    public String toString() {
        return this.a + " + " + this.b + "i";
    }
    public static void main( String[] args ) {
    	 Exampleofthis c1 = new  Exampleofthis(2,3); 
    	 Exampleofthis c2 = new  Exampleofthis(3);
    	 Exampleofthis c3 = new  Exampleofthis();
    	 System.out.println(c1);
    	 System.out.println(c2);
         System.out.println(c3);
    }
}