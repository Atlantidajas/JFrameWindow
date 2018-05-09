/* 
 * @Jorge Herrán
 * V1
 * 
 */




package Window;


import javax.swing.JLabel;

public class Message extends JLabel{

	private static final long serialVersionUID = 1L;
	
	private JLabel jLabel = new JLabel();

	public Message() {
		this.jLabel = new JLabel();
	}
    public Message( String messageJLabel, int xJLabel, int yJLabel, int widthJLabel, int heightJLabel ) {
        super();
        
        this.jLabel.setText(messageJLabel);
        jLabel.setBounds( xJLabel, yJLabel, widthJLabel, heightJLabel );
      
    }
    
	public void setjLabel(JLabel jLabel) {
		this.jLabel = jLabel;
	}
    
    public JLabel getjLabel() {
		return jLabel;
	}
    
}
