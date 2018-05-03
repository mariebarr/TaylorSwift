import java.util.*;
class main{
	public static void main(String [] args){
		System.out.println("Welcome to Taylor Swift Trivia <3.");
		System.out.println("Enter your names. (This is a 4 player game)");
		Vector<Player> vec=new Vector<Player>();
		for(int i=0;i<4;i++){
			Scanner S=new Scanner(System.in);
			String name=S.nextLine();
			Player p=new Player();
			p.set_name(name);
			p.set_score(0);
			vec.addElement(p);		
		}
		/*output names and scores with dis
		for(int i=0;i<vec.size();i++){
			System.out.println(vec.elementAt(i).get_name());
			System.out.println(vec.elementAt(i).get_score());
		}
	*/
	}
}
