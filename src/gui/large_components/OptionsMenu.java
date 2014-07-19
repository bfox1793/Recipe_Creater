package gui.large_components;

import gui.FullRecipeGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * JMenuBar for the Recipe Creator. Houses all of the options bar that exists at
 * the top of the component.
 * 
 * @author bfox1793
 * 
 */
public class OptionsMenu extends JMenuBar {

	private static final String NEW_NAME_CONSTANT = "New";
	private static final String FILE_NAME_CONSTANT = "File";

	private FullRecipeGUI myFullRecipeGUI;
	public OptionsMenu(FullRecipeGUI gui) {
		myFullRecipeGUI = gui;
		createMenuBar();
	}

	public void createMenuBar() {
		add(createFileMenu());
	}

	private JMenu createFileMenu() {
		JMenu fileMenu = new JMenu(FILE_NAME_CONSTANT);
		JMenuItem newItem = new JMenuItem(NEW_NAME_CONSTANT);
		newItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FullRecipeGUI();
			}

		});
		
		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int closeDecision = JOptionPane.showConfirmDialog(myFullRecipeGUI, "Are you sure you want to close?");
				if (closeDecision == JOptionPane.YES_OPTION){
					myFullRecipeGUI.dispose();
				}
			}
			
		});

		fileMenu.add(newItem);
		fileMenu.add(exitItem);
		return fileMenu;
	}
	
}
