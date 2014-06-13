package gui;

import gui.basic_components.SpacingFactory;
import gui.large_components.HorizontalBar;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class FullRecipeGUI extends JFrame {

	private static final Dimension PANEL_SPACING_SIZE_CONSTANT = new Dimension(0,10);
	private static final int SPACING_HEIGHT_CONSTANT = 10;
	private static final int SPACING_WIDTH_CONSTANT = 0;
	private static final Dimension MINIMUM_SIZE_CONSTANT = new Dimension(600,300);
	private List<HorizontalBar> myBars;

	public static void main(String[] args) {
		new FullRecipeGUI();
	}

	/**
	 * Main window that holds together all of the GUI components of the recipe
	 * GUI.
	 */
	public FullRecipeGUI() {
		myBars = new ArrayList<HorizontalBar>();
		setDefaultSettings();
		initialize();
	}

	private void setDefaultSettings() {
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setVisible(true);
		setMinimumSize(MINIMUM_SIZE_CONSTANT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void initialize() {
		add(new HorizontalBar());
		add(SpacingFactory.verticalSpacerPanel(PANEL_SPACING_SIZE_CONSTANT));
		add(new HorizontalBar());
		add(SpacingFactory.verticalSpacerPanel(PANEL_SPACING_SIZE_CONSTANT));
		validate();
	}
}
