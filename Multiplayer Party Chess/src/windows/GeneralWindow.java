package windows;


import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import main.MainWindow;


abstract public class GeneralWindow extends JPanel{
	private static final long serialVersionUID = 1L;
	boolean _active;
	MainWindow _main_window;
	ActionListener _act;
	public GeneralWindow(MainWindow main_window,Boolean keylistener) {
		_main_window = main_window;
		_act = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	changeBetweenGameAndMenu();
            }
        };
        setFocusable(true);
        if(keylistener) {
	        addKeyListener(new KeyListener() {
	            @Override
	            public void keyPressed(KeyEvent e) {
	        		keyEvent(e.getKeyCode());
	            }
	            @Override
	            public void keyTyped(KeyEvent e) {}
	            @Override
	            public void keyReleased(KeyEvent e) {}
	        });
        }
        setVisible(true);
	}
	public boolean getActive() {
		return _active;
	}
	public void changeBetweenGameAndMenu() {
		_main_window.switchPanel();
	}
	public Component getComponent() {
		return this;
	}
	@Override
	public void setVisible(boolean active) {
		_active = active;
		super.setVisible(active);
		requestFocusInWindow();
	}
	public void keyEvent(int key_code) {
	}
}
