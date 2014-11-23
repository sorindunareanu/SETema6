import SE.Dunareanu.Tema6.WeatherController;
import SE.Dunareanu.Tema6.WheatherModel;
import SE.Dunareanu.Tema6.WheatherView;

/**
 * Created by Sorin on 11/23/2014.
 */
public class Main {
    public static void main(String[] args) {

        WheatherView theView = new WheatherView();
        WheatherModel theModel = new WheatherModel();

        WeatherController theController = new WeatherController(theView, theModel);

        theView.setVisible(true);
    }
}
