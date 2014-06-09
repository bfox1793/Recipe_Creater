package gui.large_components;

import gui.basic_components.CheckBox;
import gui.basic_components.GuiObject;

import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HorizontalBar extends JPanel {
	
	private List<GuiObject> componentList;
	
	//public static void main(String[] args){
	//	new HorizontalBar();
	//}

	/**
	 * Bar that lists the type of measurements that the user wants. This is used
	 * to have the user select the type of measurement that they would like to
	 * select for the ingredient they are creating.
	 */
	public HorizontalBar() {
		componentList = new ArrayList<GuiObject>();
		setDefaultSettings();
		initialize();
	}
	
	private void setDefaultSettings(){
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
	}
	
	private void initialize(){
		addCheckBox("Test One");
		addCheckBox("Test Two");
		addCheckBox("Test Three");
		setVisible(true);
	}
	
	/**
	 * Adds a CheckBox to this bar.
	 * @param s
	 * 			Name of the checkbox added.
	 */
	private void addCheckBox(String s){
		CheckBox checkbox = new CheckBox(s);
		componentList.add(checkbox);
		this.add(checkbox);
	}
}
