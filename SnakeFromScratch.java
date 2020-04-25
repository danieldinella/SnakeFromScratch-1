import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SnakeFromScratch 
{
	
	static JFrame finestraTop;

	private static  void createAndShowGUI() 
	{		finestraTop= new JFrame();
		
		{	//Setting up the window settings	
			finestraTop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			finestraTop.setTitle("SnakeFromScratch");
			finestraTop.setSize(300,300);
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
	
	public static void main(String[] args) 
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
		          
	do 
	{   // gioca una partita 
		
		Partita partita = new Partita();
		partita.gioca();
				
	}
	while // vuoi giocare ancora
		( utenteVuoleGiocareAncora() ) ;
	
	//TODO : fare in modo che venga chiusa l'applicazione
	finestraTop.dispose();
	};
	
}
