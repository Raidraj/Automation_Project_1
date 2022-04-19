package Java_coding;

public class Constructors {

	String name;
	// This is a default Constructor
	/*Constructors(){
	System.out.println("No-Argument Constructor called");// It has an argument or code	
	}*/
	
	Constructors (String name){// string name is our parameter bwcause we have created inside the method{}
		this.name = name;// this is the name parameter which is our container.
	}
	
	public static void main(String[] args) {
	Constructors C= new Constructors("Raid");/* we can change the value(name )// we have instantiated our object of class  whic is C, 
	and using the constructor we are manipulating date */	
	System.out.println(C.name);
	}
}
 