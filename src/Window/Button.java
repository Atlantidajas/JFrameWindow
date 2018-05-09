/* 
 * @Jorge Herrán
 * V1
 * 
 */



package Window;



import javax.swing.JButton;

public class Button extends JButton{
	
	private static final long serialVersionUID = 1L;
	
	private JButton jButton = new JButton();
	

	public Button() {
		this.jButton = new JButton();
	}
	
	public Button( int xJButton, int yJButton, int widthJButton, int heightJButton, java.awt.Color color, String valueButtonJButton) {
		super();
		
		this.jButton.setText( valueButtonJButton );                                   
		this.jButton.setBounds( xJButton, yJButton, widthJButton, heightJButton );
		this.jButton.setBackground( color );
	   // this.jButton.addActionListener((ActionListener) this);                     
	}

	public void setJButton(JButton jButton) {
		this.jButton = jButton;
	}
	
	public JButton getJButton() {
		return jButton;
	}
	
}
