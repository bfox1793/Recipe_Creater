package gui_components;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author bfox1793
 *
 */
public class GuiObject extends JPanel {

	private static final long serialVersionUID = 4221116023170762073L;
	
	protected JComponent myComponent;
	protected JLabel myLabel;

	/**
	 * Generic GuiObject for recipe. Each of these will include one JComponent
	 * with a label. It places the components in a horizontal layout next to
	 * each other, and provides methods to obtain the information in both the
	 * component and the label, if needed.
	 * 
	 * @param label
	 * 			Label that names the JComponent.
	 * @param component
	 * 			JComonent that accompanies the label.
	 */
	public GuiObject(String label, JComponent component) {
		myLabel = new JLabel(label);
		myComponent = component;
		setDefaultSettings();
		initialize();
	}
	
	private void initialize(){
		add(myLabel);
		add(myComponent);
	}
	
	private void setDefaultSettings(){
		this.setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		setVisible(true);
	}
	
	/**
	 * Returns the label of this GuiObject.
	 * @return	Label of the object.
	 */
	public String getLabel(){
		return myLabel.getName();
	}
	
	/**
	 * Returns the component of this GuiObject.
	 * @return	JComponent of this object
	 */
	public JComponent getComponent(){
		return myComponent;
	}
	
}
