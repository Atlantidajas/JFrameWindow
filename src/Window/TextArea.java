/* 
 * @Jorge Herrán
 * V1
 * 
 */



package Window;

import javax.swing.JTextArea;

public class TextArea {

	private JTextArea  jTextArea;
	
	public TextArea( String text, int rows, int columns, int x, int y, int width, int height ) {
		
		this.jTextArea = new JTextArea( text, rows, columns );
		this.jTextArea.setBounds(x, y, width, height);
		
	}

	public void setjTextArea(JTextArea jTextArea) {
		this.jTextArea = jTextArea;
	}
	
	public JTextArea getjTextArea() {
		return jTextArea;
	}
}
