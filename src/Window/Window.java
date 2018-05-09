/* 
 * @Jorge Herrán
 * V1
 * 
 */



package Window;


import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Window {

	private JFrame jFrame;

	public Window( String title, int width, int height, boolean resizable  ) {
		
		this.jFrame = new JFrame( title );
        this.jFrame.setSize( width, height  );                  
        this.jFrame.setLocationRelativeTo( null );                     // Centrado de la ventana en pantalla
        this.jFrame.setLayout(null);                                   // Ningun layout, solo asi podremos dar posiciones a los componentes
        this.jFrame.setResizable(resizable);                           // Que la ventana no sea redimiensionable
        this.jFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );    // Cuando se cierre la ventana termina todo proceso
	}

	public void createWindowUniversal( ArrayList<Object> obj ) {
		
		
		
		for (Object values : obj ) {
			this.jFrame.add( (java.awt.Component) values );
		} 
		

		this.jFrame.setVisible( true );
		
	}
	
	public void createWindowAlert( String message, String valueButton ) {
		
		Message mesg = new Message( message, 50, 50, 340, 40 );
		Button butm = new Button( 110, 110, 100, 30, null, valueButton );
		
		this.jFrame.add( mesg.getjLabel() );
		this.jFrame.add( butm.getJButton() );
		this.jFrame.setVisible( true );
		
		
		
	
		
		
	}
	
	public JLabel getJLabel() {
		Message mesg = new Message();
		return mesg.getjLabel();
	}
	
	
	

	
}
