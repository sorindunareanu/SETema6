package SE.Dunareanu.Tema6; /**
 * Created by Sorin on 11/23/2014.
 */
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;

public class WheatherView extends JFrame{
	JButton generate = new JButton("Generate");
	JLabel temperatureLabel = new JLabel("Temperature");
	JLabel windSpeedLabel = new JLabel("Wind Speed");
	JLabel tempLabel = new JLabel("C");
	JLabel speedLabel = new JLabel("m/s");

	Font labelFont = new Font("Serif", Font.BOLD, 35);
	Font valueFont = new Font("Serif", Font.BOLD, 29);
	Font cityFont = new Font("Serif", Font.BOLD, 20);

    public WheatherView() {
    		JPanel weatherPanel = new JPanel();

    		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    		this.setBounds(300, 100, 600, 600);

    		weatherPanel.setLayout(null);

    		generate.setBounds(250, 350, 100, 40);
    		temperatureLabel.setBounds(50, 50, 200, 40);
    		temperatureLabel.setFont(labelFont);
    		windSpeedLabel.setBounds(350, 50, 2000, 40);
    		windSpeedLabel.setFont(labelFont);
    		tempLabel.setBounds(120, 120, 100, 100);
    		tempLabel.setFont(valueFont);
    		speedLabel.setBounds(410, 120, 100, 100);
    		speedLabel.setFont(valueFont);

    		weatherPanel.setBounds(800, 800, 200, 100);

    		weatherPanel.add(generate);
    		weatherPanel.add(temperatureLabel);
    		weatherPanel.add(windSpeedLabel);
    		weatherPanel.add(tempLabel);
    		weatherPanel.add(speedLabel);

    		this.add(weatherPanel);
    }

    public void setTemp(int d) {
        tempLabel.setText(d + "C");
    }

    public void setSpeed(int s) {
        speedLabel.setText(s + "m/s");
    }

    public void addListener(ActionListener listenButton){
        generate.addActionListener(listenButton);
    }

}
