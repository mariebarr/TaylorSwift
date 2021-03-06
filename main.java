import java.util.*;
class main{
	public static void main(String [] args){
		System.out.println("\nWelcome to Taylor Swift Trivia <3.");
		System.out.println("\nEnter your names. (This is a 4 player game)");
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
		String r="Random"; 

		list.addLast(t);
		list.addLast(m);
		list.addLast(l);
		list.addLast(r); 

		//subcategories

		//trivia
		LL<String> trivia=new LL<String>();
		String gamma="1. What is Taylor's middle name?";
		String alpha="2. What kind of farm did Taylor grow up on?";
		String beta="3. How tall is Taylor?";

		trivia.addLast(gamma);
		trivia.addLast(alpha);
		trivia.addLast(beta);


		//music
		LL<String> music=new LL<String>();
		String a="1. Taylor's family heard: \"All the lonely Starbucks lovers\" in this song.";
		String b="2. \"I'm laughing with my _ _ _ _ _, making forts under covers\".";
		String c="3. What kind of ad was Taylor Swift accused of copying for her music video \"Delicate\"?";

		//add questions last always,thus they will be in order.
		music.addLast(a);
		music.addLast(b);
		music.addLast(c);


		//love life
		LL<String> lovelife=new LL<String>();
		String delta="1. He broke up with Taylor over a 27-second phone call, inspiring \"Forever and Always\"";
		String phi="2. He co-starred with Taylor in \"Valentine's Day.\"";
		String epsilon="3. He wrote \"Paper Doll\" about Taylor, singing: \"You’re like twenty-two girls in one\"";

		lovelife.addLast(delta);
		lovelife.addLast(phi);
		lovelife.addLast(epsilon);

		//random 
		LL<String> random=new LL<String>(); 
		String theta = "1. What is Taylor's first cat's name?"; //Meredith
		String d = "2. Finish the lyric: \"It feels like a perfect night to dress up like _ _ _ _ _ _ _ _.\" "; //hipsters
		String omega = "3. He pretty obviously inspired Taylor's song \"Style\"."; //Harry Styles

		random.addLast(theta); 
		random.addLast(d);
		random.addLast(omega); 



		for(int i = 0; i < 4; i++){
			System.out.println("\n" + vec.elementAt(i).name + "'s turn!");
			for(int j = 0; j < 3; j++){
				//use A for scanners
				//ans for answers
				if(list.GetCount()==0)
					break;

				System.out.println("\n");
				list.iterateForward();
				System.out.println("\nChoose a category:");
				System.out.println("\n");
				Scanner A=new Scanner(System.in);
				String ans=A.nextLine();


				if(ans.equals(r)) {
					random.iterateForward();
					System.out.println("\nWhich riddle would you like to solve?");

					A=new Scanner(System.in);
					int num =A.nextInt();

					if(num==1){
						System.out.println("Enter your answer:");
						A=new Scanner(System.in);
						ans=A.nextLine();

						if(ans.equals("Meredith")){
							System.out.println("Correct!");
							vec.elementAt(i).score++;
						}
						else {
							System.out.println("Wrong it's Meredith! Get your TS game together!");
						}
						if(theta.equals(random.GetNth(0))){
							random.removeFirst();
						}
						else if(theta.equals(random.GetNth(1))){
							if(random.GetCount()==3){
								random.removeMid(random.GetNth(1));
							}
							else random.removeLast();
						}
						else if(theta.equals(random.GetNth(2))){
							random.removeLast();
						}
					}
					else if(num == 2){
						System.out.println("Enter your answer:");
						A=new Scanner(System.in);
						ans = A.nextLine();

						if(ans.equals("hipsters")){
							System.out.println("Good job, god your a hipster");
							vec.elementAt(i).score++;
						}
						else {
							System.out.println("God your answer is so last year, nice try");
						}
						if(d.equals(random.GetNth(0))){
							random.removeFirst();
						}
						else if(d.equals(random.GetNth(1))){
							if(random.GetCount()==3){
								random.removeMid(random.GetNth(1));
							}
							else random.removeLast();
						}
						else if(d.equals(random.GetNth(2))){
							random.removeLast();
						}
					}
					else if(num==3){
						System.out.println("Enter your answer:");
						A=new Scanner(System.in);
						ans = A.nextLine();

						if(ans.equals("Harry Styles")){
							System.out.println("Wow, you really know your one direction");
							vec.elementAt(i).score++;
						}
						else{
							System.out.println("Wrong it was Harry Styles, you must be a Jonas Brother's Fan");
						}
						if(omega.equals(random.GetNth(0))){
							random.removeFirst();
						}
						else if(omega.equals(random.GetNth(1))){
							if(random.GetCount()==3){
								random.removeMid(random.GetNth(1));
							}
							else random.removeLast();
						}
						else if(omega.equals(random.GetNth(2))){
							random.removeLast();
						}
					}
					if(random.GetCount()==0){
						if(r.equals(list.GetNth(0)))
							list.removeFirst();
						else if(r.equals(list.GetNth(1))){
							if(list.GetCount()==3){
								list.removeMid(list.GetNth(1));
							}
							else
								list.removeLast();
						}
						else if(r.equals(list.GetNth(2)))
							list.removeLast();

					}
					continue;

				}



				//TRIVIA
				if(ans.equals(t)){
					trivia.iterateForward();
					System.out.println("\nWhich riddle would you like to solve?");

					//have them choose
					A=new Scanner(System.in);
					int num=A.nextInt();

					if(num==1){
						System.out.println("Enter your answer:");
						A=new Scanner(System.in);
						ans=A.nextLine();

						//java uses .equals() to check for equality of STRINGS 
						if(ans.equals("Alison")){
							System.out.println("Correct!");
							//MEGAN: ADD POINTS
							vec.elementAt(i).score++;

						}
						else //System.out.println("Sorry, pass the play to the next player");
						{	
							System.out.println("no. It's Alison.");
						}
						if(gamma.equals(trivia.GetNth(0))){
							trivia.removeFirst();
						}
						else if(gamma.equals(trivia.GetNth(1))){
							if(trivia.GetCount()==3){
								trivia.removeMid(trivia.GetNth(1));
							}

							else 
								trivia.removeLast();

						}
						else if(beta.equals(music.GetNth(2)))
							trivia.removeLast();
					}
					if(num==2){
						System.out.println("Enter your answer:");
						A=new Scanner(System.in);
						ans=A.nextLine();
						if(ans.equals("Christmas Tree")){
							System.out.println("Correcto.");
							//MEGAN: ADD POINTS
							vec.elementAt(i).score++;	
						}
						else{
							System.out.println("noo. T'was a Christmas Tree farm.");
						}
						if(alpha.equals(trivia.GetNth(0))){
							trivia.removeFirst();
						}
						else if(alpha.equals(trivia.GetNth(1))){
							if(trivia.GetCount()==3)
								trivia.removeMid(trivia.GetNth(1));
							else trivia.removeLast();
						}
						else if(beta.equals(music.GetNth(2))){
							trivia.removeLast();

						}
					}
					if(num==3){
						System.out.println("Enter your answer as follows: 9' 5\" for 9 feet 5 inches.");
						A=new Scanner(System.in);
						ans=A.nextLine();
						if(ans.equals("5' 10\"")){
							System.out.println("Yup. That's kind of creepy you know so much about her..");
							//MEGAN: ADD POINTS
							vec.elementAt(i).score++;
						}
						else{
							System.out.println("Didn't expect you to get that right. She's 9' 5.");
						}
						if(beta.equals(trivia.GetNth(0))){
							trivia.removeFirst();
						}
						else if(beta.equals(trivia.GetNth(1))){
							if(trivia.GetCount()==3)
								trivia.removeMid(trivia.GetNth(1));
							else trivia.removeLast();
						}
						else if(beta.equals(trivia.GetNth(2)))
							trivia.removeLast();


					}

					if(trivia.GetCount()==0){
						if(t.equals(list.GetNth(0)))
							list.removeFirst();
						else if(t.equals(list.GetNth(1))){
							if(list.GetCount()==3){
								list.removeMid(list.GetNth(1));
							}
							else
								list.removeLast();
						}
						else if(t.equals(list.GetNth(2)))
							list.removeLast();

					}
					continue;

				}

				//MUSIC
				if(ans.equals(m)){
					music.iterateForward();
					System.out.println("\nWhich riddle would you like to solve?");

					A=new Scanner(System.in);
					int num=A.nextInt();

					if(num==1){
						//have user enter answer
						System.out.println("Enter your answer:");
						A=new Scanner(System.in);
						ans=A.nextLine();
						if(ans.equals("Blank Space")){

							System.out.println("Correct!");
							//MEGAN: ADD POINTS
							vec.elementAt(i).score++;
						}
						else{
							System.out.println("Nope. Taylor won't be writing your name in her Blank Space.");
						}
						if(a.equals(music.GetNth(0))){
							music.removeFirst();
						}
						else if(a.equals(music.GetNth(1))){

							if(music.GetCount()==3)

								music.removeMid(music.GetNth(1));

							else
								music.removeLast();
						}
						else if(c.equals(music.GetNth(2)))
							music.removeLast();
					}
					if(num==2){
						System.out.println("Enter your answer:");
						A=new Scanner(System.in);
						ans=A.nextLine();
						if(ans.equals("lover")){
							System.out.println("Correct.");
							//MEGAN: ADD POINTS
							vec.elementAt(i).score++;

						}
						else{
							System.out.println("no. It was 'lover'. Not that you'd know.");
						}
						if(b.equals(music.GetNth(0))){
							music.removeFirst();
						}
						else if(b.equals(music.GetNth(1))){
							if(music.GetCount()==2)
								music.removeLast();
							else
								music.removeMid(music.GetNth(1));
						}
						else if(c.equals(music.GetNth(2)))
							music.removeLast();

					}
					if(num==3){
						System.out.println("Enter your answer:");
						A=new Scanner(System.in);
						ans=A.nextLine();
						if(ans.equals("perfume")){
							System.out.println("Correct.");
							//MEGAN: ADD POINTS
							vec.elementAt(i).score++;
						}
						else{
							System.out.println("No. The answer was perfume!");
						}
						if(c.equals(music.GetNth(0))){
							music.removeFirst();
						}
						else if(c.equals(music.GetNth(1))){
							if(music.GetCount()==3){
								music.removeMid(music.GetNth(1));
							}
							else
								music.removeLast();
						}
						else if(c.equals(music.GetNth(2))){
							music.removeLast();
						}

					}
					if(music.GetCount()==0){
						if(m.equals(list.GetNth(0)))
							list.removeFirst();
						else if(m.equals(list.GetNth(1))){
							if(list.GetCount()==3){
								list.removeMid(list.GetNth(1));
							}
							else
								list.removeLast();
						}
						else if(m.equals(list.GetNth(2)))
							list.removeLast();
					}
					continue;
				}

				//LOVELIFE
				if(ans.equals(l)){
					lovelife.iterateForward();
					System.out.println("\nWhich riddle would you like to solve?");

					A=new Scanner(System.in);
					int num=A.nextInt();

					if(num==1){
						//have user enter answer
						System.out.println("Enter your answer:");
						A=new Scanner(System.in);
						ans=A.nextLine();
						if(ans.equals("Joe Jonas")){
							System.out.println("Correct");
							//MEGAN: ADD POINTS
							vec.elementAt(i).score++;
						}
						else{
							System.out.println("No. Joe Jonas must be regretting his decisions.");
						}
						if(delta.equals(lovelife.GetNth(0))){
							lovelife.removeFirst();
						}
						else if(delta.equals(lovelife.GetNth(1))){
							if(lovelife.GetCount()==3){
								lovelife.removeMid(lovelife.GetNth(1));
							}
							else
								lovelife.removeLast();
						}
						else if(epsilon.equals(lovelife.GetNth(2)))
							lovelife.removeLast();

					}
					if(num==2){
						System.out.println("Enter your answer:");
						A=new Scanner(System.in);
						ans=A.nextLine();
						if(ans.equals("Taylor Lautner")){
							System.out.println("Correct");
							//MEGAN: ADD POINTS
							vec.elementAt(i).score++;
						}
						else{
							System.out.println("No. Poor Taylor Lautner...sadly got snuffed in Twilight as well.");
						}
						if(phi.equals(lovelife.GetNth(0))){
							lovelife.removeFirst();
						}
						else if(phi.equals(lovelife.GetNth(1))){
							if(lovelife.GetCount()==3){
								lovelife.removeMid(lovelife.GetNth(1));
							}


							else lovelife.removeLast();
						}
						else if(epsilon.equals(lovelife.GetNth(2))){
							lovelife.removeLast();
						}

					}
					if(num==3){
						System.out.println("Enter your answer:");
						A=new Scanner(System.in);
						ans=A.nextLine();
						if(ans.equals("John Mayer")){
							System.out.println("Correct");
							//MEGAN: ADD POINTS
							vec.elementAt(i).score++;
						}
						else{
							System.out.println("No. Dear John.. Mayer.");
						}
						//handles if it's the first term in any list
						if(epsilon.equals(lovelife.GetNth(0))){
							lovelife.removeFirst();
						}
						//handles if it's the second term in a list of three
						else if(epsilon.equals(lovelife.GetNth(1))){
							if(lovelife.GetCount()==3){
								lovelife.removeMid(lovelife.GetNth(1));
							}
							//removes last element in list of 2
							else lovelife.removeLast();
						}
						//deletes third element from list of 3	
						else if(epsilon.equals(lovelife.GetNth(2))){
							lovelife.removeLast();
						}

					}

					if(lovelife.GetCount()==0){
						if(l.equals(list.GetNth(0)))
							list.removeFirst();
						else if(l.equals(list.GetNth(1))){
							if(list.GetCount()==3){
								list.removeMid(list.GetNth(1));
							}
							else
								list.removeLast();
						}
						else if(l.equals(list.GetNth(2)))
							list.removeLast();
					}
					continue;
				}
			}//end of for loop of 3
		}//end of for for loop of 4
		Hash H = new Hash();
		vec.copyInto(H.table1);
		Player wins = new Player();
		wins = H.first_place();
		System.out.println(wins.name);
	}//end of main
}//end of class (file)

