/* 
 * @Jorge Herrán
 * V1
 * 
 */



package Window;

import javax.swing.JTextField;



public class InputText{
	
	private JTextField jTextField;

	public InputText(int maxleng, int x, int y,int width,int height, java.awt.Color color, String value) {
		this.jTextField = new JTextField(maxleng);
		this.jTextField.setBounds(x, y, width, height);
		this.jTextField.setBackground(color);
		this.jTextField.setText( value );

	
	}
	
	public void setjTextField(JTextField jTextField) {
		this.jTextField = jTextField;
	}

	public JTextField getjTextField() {
		return jTextField;
	}



}
