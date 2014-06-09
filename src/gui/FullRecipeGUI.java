package gui;

import gui.large_components.HorizontalBar;

import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class FullRecipeGUI extends JFrame{
	
	private List<HorizontalBar> myBars;

	public static void main(String[] args){
		new FullRecipeGUI();
	}
	public FullRecipeGUI(){
		myBars = new ArrayList<HorizontalBar>();
		setDefaultSettings();
		initialize();
	}
	
	private void setDefaultSettings(){
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setVisible(true);
	}
	
	private void initialize(){
		add(new HorizontalBar());
		add(new HorizontalBar());
	}
}
