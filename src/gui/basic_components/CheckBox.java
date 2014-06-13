package gui.basic_components;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class CheckBox extends GuiObject{
	

	private static final int VERTICAL_LAYOUT_CONSTANT = -1;

	public CheckBox(String label){
		super(label,new JCheckBox());
		//setObjectLayout(VERTICAL_LAYOUT_CONSTANT);
	}

	@Override
	protected void createListener() {		
	}
	
	
}
