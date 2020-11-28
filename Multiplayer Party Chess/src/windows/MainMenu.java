package windows;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import main.MainWindow;
public class MainMenu extends GeneralWindow{
	JButton game_button = new JButton("Go to the game");
	public MainMenu(MainWindow main_window) {
		super(main_window,false);
		setBackground(Color.RED);
		game_button.addActionListener(_act);
		add(game_button);
	}
}
