public class Player{

	public String name;
	public int score=0;
	public void set_name(String new_name){
		name=new_name;
	}
	public void set_score(int new_score){
		score=new_score;
	}
	public String get_name(){
		return name;
	}
	public int get_score(){
		return score;
	}
}
