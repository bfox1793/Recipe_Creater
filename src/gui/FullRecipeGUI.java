package gui;

import gui.basic_components.SpacingFactory;
import gui.large_components.IngredientsBar;
import gui.large_components.OptionsMenu;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FullRecipeGUI extends JFrame {

	private static final String ADD_INGREDIENT_CONSTANT = "Add Ingredient";
	private static final Dimension PANEL_SPACING_SIZE_CONSTANT = new Dimension(0,10);
	private static final int SPACING_HEIGHT_CONSTANT = 10;
	private static final int SPACING_WIDTH_CONSTANT = 0;
	private static final Dimension MINIMUM_SIZE_CONSTANT = new Dimension(600,300);
	private List<IngredientsBar> myBars;
	private JButton myIngredientButton;

	/**
	 * Main window that holds together all of the GUI components of the recipe
	 * GUI.
	 */
	public FullRecipeGUI() {
		myBars = new ArrayList<IngredientsBar>();
		setDefaultSettings();
		initialize();
	}

	private void setDefaultSettings() {
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setVisible(true);
		setMinimumSize(MINIMUM_SIZE_CONSTANT);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	private void initialize() {
		addIngredient();
		addIngredient();
		add(addIngredientButton());
		this.setJMenuBar(new OptionsMenu());
		validate();
	}
	
	private void addIngredient(){
		IngredientsBar currentIngredient = new IngredientsBar();
		myBars.add(currentIngredient);
		add(currentIngredient);
		add(SpacingFactory.verticalSpacerPanel(PANEL_SPACING_SIZE_CONSTANT));
	}
	
	private JButton addIngredientButton(){
		JButton button = new JButton(ADD_INGREDIENT_CONSTANT);
		
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				remove(myIngredientButton);
				addIngredient();
				add(myIngredientButton);
				revalidate();
				repaint();
			}
		});
		
		myIngredientButton = button;
		return button;
	}
	
}
