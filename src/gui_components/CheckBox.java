package gui_components;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class CheckBox extends GuiObject{
	

	public CheckBox(String label){
		super(label,new JCheckBox());
	}
}
