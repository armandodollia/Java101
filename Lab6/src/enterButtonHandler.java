import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;



public class enterButtonHandler implements KeyListener{
	private JButton clickableButton = null;
	
	public enterButtonHandler(JButton clickableButton){
		this.clickableButton = clickableButton;
		}
	
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			clickableButton.doClick();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
