package gui.basic_components;

import java.awt.Dimension;

import javax.swing.JPanel;

public class SpacingFactory {

	/**
	 * Creates a spacer panel to help space Swing components on a GUI properly.
	 * Takes a width and a height as arguments.
	 * 
	 * @param width
	 * 			Width of the spacer.
	 * @param height
	 * 			Height of the spacer.
	 * @return
	 * 			Blank spacing JPanel.
	 */
	public static JPanel verticalSpacerPanel(int width, int height) {
		JPanel spacer = new JPanel();
		spacer.setMaximumSize(new Dimension(width, height));
		spacer.setMinimumSize(new Dimension(width, height));
		return spacer;
	}
	
	/**
	 * Creates a spacer panel to help space Swing components on a GUI properly.
	 * Takes a width and a height as arguments.
	 * 
	 * @param size
	 * 			Size of the desired spacing.
	 * @return
	 * 			Blank spacing JPanel.
	 */
	public static JPanel verticalSpacerPanel(Dimension size) {
		JPanel spacer = new JPanel();
		spacer.setMaximumSize(size);
		spacer.setMinimumSize(size);
		return spacer;
	}
	
	

}
