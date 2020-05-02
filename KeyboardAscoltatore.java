import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

 public class KeyboardAscoltatore extends KeyAdapter
 {
 	Serpente serpente ;
 	
 	public KeyboardAscoltatore ( Serpente  s)
 	{ this.serpente = s;}
 	
 	public void keyPressed(KeyEvent e)
 	{
		int  keycode = e.getKeyCode();
 		 
 		
 		     if (( keycode==40) && ! serpente.staAndandoSud() )
				{
					serpente.vaiVersoSud(); 
				}
		else if (( keycode==38) && ! serpente.staAndandoNord() )
				{
					serpente.vaiVersoNord();
				}
		else if ((keycode==37) && ! serpente.staAndandoOvest() )
				{
					serpente.vaiVersoOvest();
				}
		else if ((keycode==39) && ! serpente.staAndandoEst() )
				{
					serpente.vaiVersoEst();
				}
 		}
} 
