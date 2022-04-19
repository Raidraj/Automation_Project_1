package Sprint1;

public class Veriable {
int num1 = 6;// that is global variable
double num3 = 12;
void add() {// instance method
	System.out.println("practice "+num1 + num3);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Veriable variable1= new Veriable();
variable1.add();// calling the instance method by using the object(veriable1)
System.out.println("The value of the number is " + (variable1.num3+variable1.num1));// calling the global bariable by using the object(variable1)
System.out.println("The value of the number is " + (variable1.num3-variable1.num1));	
	}

}
