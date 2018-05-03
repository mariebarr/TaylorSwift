import java.util.*;
class main{
	public static void main(String [] args){
		System.out.println("Welcome to Taylor Swift Trivia <3.");
		System.out.println("Enter your names. (This is a 4 player game)");
		Vector<Player> vec=new Vector<Player>();

		//have players input their names. They will be stored into a vector of Players with all scores initialized to zero.
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
		LL<String> list=new LL<String>();
		//add questions last always,thus they will be in order.
		String a="1. Taylor's family heard: \"All the lonely Starbucks lovers\" in this song.";
		String b="2. \"I'm laughing with my _ _ _ _ _, making forts under covers\".";
		list.addLast(a);
		list.addLast(b);
		list.iterateForward();
		System.out.println("Which riddle would you like to solve?");
		Scanner A=new Scanner(System.in);
		int num=A.nextInt();

		if(list.GetNth(num-1)==a){
			System.out.println(a);
			Scanner B=new Scanner(System.in);
			String ans=B.nextLine();
			//java uses .equals() to check for equality of STRINGS 
			if(ans.equals("Blank Space")){
				//megan: add points
				System.out.println("heyyy.");
			}
			else System.out.println("no");

		}
		if(list.GetNth(num-1)==b){
			System.out.println(b);
			System.out.println("Choose a letter");
			Scanner C=new Scanner(System.in);
			char c=C.next().charAt(0);
			while(C.hasNext()){
		//		c=C.next().charAt(0);
				if(c=='l'){
					System.out.println("\"I'm laughing with my l _ _ _ _, making forts under covers\".");
					continue;
				}
				if(c=='o'){
					System.out.println("\"I'm laughing with my l o _ _ _,\" .");
					continue;
				}
				C=new Scanner(System.in);
				c=C.next().charAt(0);
			}
		}
	}
}

