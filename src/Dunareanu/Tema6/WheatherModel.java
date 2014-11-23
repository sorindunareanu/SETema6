package SE.Dunareanu.Tema6; /**
 * Created by Sorin on 11/23/2014.
 */
import java.util.Random;

public class WheatherModel {

    private int degrees;
    private int speed;

    private final int min = -30;
    private final int max = 45;

    public int random(){
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public void setDegrees(){
        degrees = random();
    }

    public void setSpeed(){
        speed=random();
    }

    public int GetTemperature() {
        return degrees;
    }

    public int GetWindSpeed() {
            return speed;
    }
}
