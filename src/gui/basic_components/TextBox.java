package gui.basic_components;

import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JTextField;

public class TextBox extends GuiObject {
	
	private static final Dimension TEXTBOX_MAXIMUM_SIZE = new Dimension(200,20);

	/**
	 * Textbox component. Used for creating a text field and having a label next
	 * to it.
	 * 
	 * @param label
	 * 			Label on the text box
	 * @param component
	 * 			
	 */
	public TextBox(String label) {
		super(label, new JTextField());
		setDefaultSettings();
	}
	
	private void setDefaultSettings(){
		this.setMaximumSize(TEXTBOX_MAXIMUM_SIZE);
	}

	@Override
	protected void createListener() {
		// TODO Auto-generated method stub

	}


}
