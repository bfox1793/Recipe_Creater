package gui.large_components;

import gui.FullRecipeGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class OptionsMenu extends JMenuBar{

	private static final String NEW_NAME_CONSTANT = "New";
	private static final String FILE_NAME_CONSTANT = "File";

	public OptionsMenu(){
		createMenuBar();
	}
	
	public void createMenuBar(){
		add(createFileMenu());
	}

	private JMenu createFileMenu() {
		JMenu fileMenu = new JMenu(FILE_NAME_CONSTANT);
		JMenuItem newItem = new JMenuItem(NEW_NAME_CONSTANT);
		newItem.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new FullRecipeGUI();
			}
			
		});
		
		fileMenu.add(newItem);
		return fileMenu;
	}
}
