package windows;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JSplitPane;

import main.MainWindow;
public class MainGameWindow extends GeneralWindow {
	JSplitPane total_window;
	int min_menu_size = 200;
	public MainGameWindow(MainWindow main_window) {
		super(main_window,true);
		
		setLayout(new BorderLayout());
		ChatWindow chat_window = new ChatWindow(main_window);		
		GameWindow game_window = new GameWindow(main_window);
		
		JSplitPane game_chat_window = new JSplitPane(JSplitPane.VERTICAL_SPLIT, game_window.getComponent(), chat_window.getComponent());
		game_chat_window.setResizeWeight(0.9);
		add(game_chat_window);
		
		IngameMenu ingame_menu = new IngameMenu(main_window);
		ingame_menu.setMinimumSize(new Dimension(0,min_menu_size));
		
		total_window = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, game_chat_window, ingame_menu.getComponent());
		total_window.setResizeWeight(0.9);
		total_window.setVisible(true);
		total_window.setDividerLocation(min_menu_size);
		add(total_window);
	}
	@Override
	public void keyEvent(int key_code) {
		switch(key_code) {
			case 77:
				toggleInGameMenu();
				break;
		}
	}
	public void toggleInGameMenu() {
		if(total_window.getDividerLocation() > total_window.getWidth()*0.7){
			if((int)(total_window.getWidth()*0.1) < min_menu_size) {
				total_window.setDividerLocation(min_menu_size);
			}else {
				total_window.setDividerLocation((int)(total_window.getWidth()*0.1));
			}
		}else{
			if((int)(total_window.getWidth()*0.1) < min_menu_size) {
				total_window.setDividerLocation(total_window.getWidth()-min_menu_size);
			}else {
				total_window.setDividerLocation((int)(total_window.getWidth()*0.9));
			}
		}
	}
}