
/* 
 * @Jorge Herrán
 * V1
 * 
 */

package Window;

import java.awt.Color;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
			
		Window windowPrueba = new Window( "Título de la ventana", 400, 350, true );
		
			Message message = new Message( "Primer mensaje", 150, 20, 200, 30 );
			TextArea texArea = new TextArea( "Probando TexArea", 0, 0, 6, 70, 370, 110 );
			InputText inputText = new InputText( 60, 6, 200, 370, 30, Color.yellow, null );
			Button buton = new Button( 140, 250, 100, 30, Color.RED, "Pulsar Uno" );
			
			ArrayList<Object> componentWinddows = new ArrayList<Object>();
				
				componentWinddows.add( 0, message.getjLabel() );
				componentWinddows.add( 1, texArea.getjTextArea() );
				componentWinddows.add( 2, inputText.getjTextField() );
				componentWinddows.add( 3, buton.getJButton() );

		
		windowPrueba.createWindowUniversal( componentWinddows );
		
	//windowPrueba.createWindowAlert("Hola", "Pulsar" );
	
		
			

	}

}
