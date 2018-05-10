import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class song{
	public static void main(String[] args){
String bip = "ts.mp3";
Media hit = new Media(new File(bip).toURI().toString());
MediaPlayer mediaPlayer = new MediaPlayer(hit);
mediaPlayer.play();
	}
}
