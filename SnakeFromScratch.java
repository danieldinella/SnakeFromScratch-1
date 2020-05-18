import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SnakeFromScratch 
{
	static JFrame finestraTop;
	static Partita partita;
	

	private static void createAndShowGUI ()
	{
		finestraTop = new JFrame();

		{ // Setting up the window settings
			finestraTop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			finestraTop.setTitle("SnakeFromScratch");
			finestraTop.setSize(300, 300);
			finestraTop.setVisible(true);
		}

	}
    
	private  static  boolean utenteVuoleGiocareAncora() 
	{ int scelta= JOptionPane.showConfirmDialog(finestraTop,
												"Vuoi giocare ancora ?", 
												"Game Over", 
												JOptionPane.YES_NO_OPTION);
		return (scelta == JOptionPane.OK_OPTION ) ;  
	} 
	
	public static void main ( String[] args )
	{
		// TODO: #1 riprendere in seguito
		//javax.swing.SwingUtilities.invokeLater(new Runnable()
		//{
		//	public void run ()
		//	{
			createAndShowGUI();	
		
       do
		{ // gioca una partita
			
			partita = new Partita();
			finestraTop.add(partita);
			
			finestraTop.setVisible(true);


			partita.gioca();

		} while // vuoi giocare ancora
		(utenteVuoleGiocareAncora());
        finestraTop.dispose();
        
        //	}
		//}); //TODO: #1 riprendere in seguito

	}


}
