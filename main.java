import java.util.*;
class main{
	public static void main(String [] args){
		System.out.println("Welcome to Taylor Swift Trivia <3.");
		System.out.println("Enter your names. (This is a 4 player game)");
		int count=1;
		Vector<String> vec= new Vector<String>();
		
		//user inputs 4 names. stores them in the vector "vec"
		while(count<=4){
			Scanner S=new Scanner(System.in);
			String name=S.nextLine();
			vec.addElement(name);
			count++;
		}
		
		/* prints out the names (checking)
		Enumeration en=vec.elements();
		while(en.hasMoreElements())
			System.out.print(en.nextElement()+" ");
	*/

	}
}
