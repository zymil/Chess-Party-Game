package main;
import java.awt.CardLayout;
import java.awt.KeyboardFocusManager;
import javax.swing.*;

import windows.MainGameWindow;
import windows.MainMenu;

public class MainWindow extends JFrame{
	private static final long serialVersionUID = 1L;
	MainMenu _main_menu;
	MainGameWindow _game_window;
	public MainWindow() {
		setLayout(new CardLayout());
		setTitle("Chess :-)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		_main_menu = new MainMenu(this);
		_game_window = new MainGameWindow(this);
		
		add(_main_menu.getComponent());
		add(_game_window.getComponent());
		
		_main_menu.setVisible(false);
		_game_window.setVisible(true);
		
		setVisible(true);
		System.out.println(KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner());
		
	}
	public void switchPanel() {
		//System.out.println(KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner());
		if(_main_menu.getActive()) {
			_main_menu.setVisible(false);
			_game_window.setVisible(true);
		}else {
			_game_window.setVisible(false);
			_main_menu.setVisible(true);
		}
	}
}
