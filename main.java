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
		//	Player player1= vec.elementAt(0);
		//	Player player2= vec.elementAt(1);
		//	Player player3= vec.elementAt(2);
		//	Player player4= vec.elementAt(3);



		//System.out.println(player1.get_name());

		LL<String> list=new LL<String>();

		//categories
		String t="Trivia";
		String m="Music";
		String l="Love Life";

		list.addLast(t);
		list.addLast(m);
		list.addLast(l);

		//subcategories

		//trivia
		LL<String> trivia=new LL<String>();
		String gamma="1. What is Taylor's middle name?";
		String alpha="2. What kind of farm did Taylor grow up on?";

		trivia.addLast(gamma);
		trivia.addLast(alpha);


		//music
		LL<String> music=new LL<String>();
		String a="1. Taylor's family heard: \"All the lonely Starbucks lovers\" in this song.";
		String b="2. \"I'm laughing with my _ _ _ _ _, making forts under covers\".";

		//add questions last always,thus they will be in order.
		music.addLast(a);
		music.addLast(b);

		int count=0;

		//print out categories
		list.iterateForward();

		while(true){
			count++;
			//use A for scanners
			//ans for answers
			System.out.println("Which category would you like?");
			Scanner A=new Scanner(System.in);
			String ans=A.nextLine();
			if(ans.equals(t)){

				trivia.iterateForward();
				System.out.println("Which riddle would you like to solve?");
				//have them choose
				A=new Scanner(System.in);
				ans=A.nextLine();
				//java uses .equals() to check for equality of STRINGS 
				if(ans.equals("Blank Space")){
					//megan: add points
					System.out.println("Correct!");
					//count++;
					continue;
				}
				else //System.out.println("Sorry, pass the play to the next player");
				{	//count++;
					continue;
				}

			}
			if(ans.equals(m)){
				music.iterateForward();
				System.out.println("Which riddle would you like to solve?");

				A=new Scanner(System.in);
				int num=A.nextInt();

				if(num==1){
					//have user enter answer
					A=new Scanner(System.in);
					ans=A.nextLine();
					if(ans.equals("Blank Space")){

						System.out.println("Correct!");
						//add points
					}
					else{
						System.out.println("Nope.");
					}
				}

			}
		}


	}
}

