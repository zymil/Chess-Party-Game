package windows;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import main.MainWindow;

public class ChatWindow extends GeneralWindow{
	JScrollPane _chat_screen;
	public ChatWindow(MainWindow main_window) {
		super(main_window,false);
		JPanel chat_screen_panel = new JPanel();
		chat_screen_panel.setLayout(new BoxLayout(chat_screen_panel, BoxLayout.Y_AXIS));
		chat_screen_panel.add(new JLabel("chat"));
		chat_screen_panel.setVisible(true);
		
		_chat_screen = new JScrollPane(chat_screen_panel);
		_chat_screen.setVisible(true);

		_chat_screen.setMinimumSize(new Dimension(100,10));
		chat_screen_panel.setMaximumSize(new Dimension(100,300));
	}
	@Override
	public Component getComponent() {
		//JScrollPane behaves oddly, so we just send it instead of placing a JScrollPane in a JFrame in another JFrame
		return _chat_screen;
	}
	
}
