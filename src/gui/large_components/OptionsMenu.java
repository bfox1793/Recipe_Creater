package gui.large_components;

import gui.FullRecipeGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
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

	private static final String CLOSE_DECISION_QUESTION = "Are you sure you want to close?";
	private static final String EXIT_MENU_ITEM_NAME = "Exit";
	private static final String NEW_MENU_ITEM_NAME = "New";
	private static final String FILE_NAME_CONSTANT = "File";

	private JFrame myFullRecipeGUI;

	/**
	 * JMenuBar for Recipe Creator. It houses all of the options bars that exist
	 * at the top of the component.
	 * 
	 * @param gui
	 *            GUI that this bar exists in
	 */
	public OptionsMenu(JFrame gui) {
		myFullRecipeGUI = gui;
		createMenuBar();
	}

	private void createMenuBar() {
		add(createFileMenu());
	}

	private JMenu createFileMenu() {
		JMenu fileMenu = new JMenu(FILE_NAME_CONSTANT);
		JMenuItem newItem = new JMenuItem(NEW_MENU_ITEM_NAME);
		newItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FullRecipeGUI();
			}

		});

		JMenuItem exitItem = new JMenuItem(EXIT_MENU_ITEM_NAME);
		exitItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int closeDecision = JOptionPane.showConfirmDialog(
						myFullRecipeGUI, CLOSE_DECISION_QUESTION);
				if (closeDecision == JOptionPane.YES_OPTION) {
					myFullRecipeGUI.dispose();
				}
			}

		});

		fileMenu.add(newItem);
		fileMenu.add(exitItem);
		return fileMenu;
	}

}
