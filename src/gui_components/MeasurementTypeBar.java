package gui_components;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class MeasurementTypeBar extends JFrame {
	
	public static void main(String[] args){
		new MeasurementTypeBar();
	}

	/**
	 * Bar that lists the type of measurements that the user wants. This is used
	 * to have the user select the type of measurement that they would like to
	 * select for the ingredient they are creating.
	 */
	public MeasurementTypeBar() {
		setDefaultSettings();
		initialize();
	}
	
	private void setDefaultSettings(){
		setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
	}
	
	private void initialize(){
		add(new CheckBox("Test One"));
		add(new CheckBox("Test Two"));
		add(new CheckBox("Test Three"));
		setVisible(true);
		pack();
	}
}
