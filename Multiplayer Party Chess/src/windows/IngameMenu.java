package windows;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;

import main.MainWindow;

public class IngameMenu extends GeneralWindow{
	JButton game_button = new JButton("Go Menu");
	public IngameMenu(MainWindow mainwindow) {
		super(mainwindow,false);
		//setMaximumSize(new Dimension(Integer.MAX_VALUE,200));
		setMinimumSize(new Dimension(0,100));
		setVisible(true);
		game_button.addActionListener(_act);
		add(game_button);
	}
}