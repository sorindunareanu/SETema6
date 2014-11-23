package SE.Dunareanu.Tema6; /**
 * Created by Sorin on 11/23/2014.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeatherController {
        private WheatherView theView;
        private WheatherModel theModel;

        public WeatherController(WheatherView theView, WheatherModel theModel) {
            this.theView = theView;
            this.theModel = theModel;

            this.theView.addListener(new WeatherListener());
        }

        class WeatherListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                theModel.setDegrees();
                theModel.setSpeed();

                theView.setTemp(theModel.GetTemperature());
                theView.setSpeed(theModel.GetWindSpeed());
            }
        }
}
