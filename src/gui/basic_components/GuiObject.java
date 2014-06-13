package gui.basic_components;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author bfox1793
 * 
 */
public abstract class GuiObject extends JPanel {

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
	 *            Label that names the JComponent.
	 * @param component
	 *            JComonent that accompanies the label.
	 */
	public GuiObject(String label, JComponent component) {
		myLabel = new JLabel(label);
		myComponent = component;
		setDefaultSettings();
		initialize();
	}

	private void initialize() {
		add(myLabel);
		add(myComponent);
	}

	private void setDefaultSettings() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setVisible(true);
	}

	/**
	 * Returns the label of this GuiObject.
	 * 
	 * @return Label of the object.
	 */
	public String getLabel() {
		return myLabel.getName();
	}

	/**
	 * Returns the component of this GuiObject.
	 * 
	 * @return JComponent of this object
	 */
	public JComponent getComponent() {
		return myComponent;
	}

	/**
	 * Sets the layout of this component. It takes an integer, which corresponds
	 * to the layout choice. 1 is horizontal, -1 is vertical.
	 * 
	 * @param layoutType
	 */

	public void setObjectLayout(int layoutType){
		if (layoutType > 0){
			setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		}
		else {
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		}
	}

	protected abstract void createListener();

}
