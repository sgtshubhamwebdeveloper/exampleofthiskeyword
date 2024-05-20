package thiskeywords;

public class DisplayStringName {
	   String name;

	   void setName( String name ) {
	       this.name = name;
	   }
	   String getName(){
	       return this.name;
	   }
	   public static void main( String[] args ) {
		   DisplayStringName obj = new DisplayStringName();
	       obj.setName("Shree Gajanan");
	       System.out.println("obj.name: "+obj.getName());
	   }
	}