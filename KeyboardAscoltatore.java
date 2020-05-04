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
 		 
 		
 		     if (( keycode==40) && ! serpente.staAndandoNord() )
				{
					serpente.vaiVersoSud(); 
				}
		else if (( keycode==38) && ! serpente.staAndandoSud() )
				{
					serpente.vaiVersoNord();
				}
		else if ((keycode==37) && ! serpente.staAndandoEst() )
				{
					serpente.vaiVersoOvest();
				}
		else if ((keycode==39) && ! serpente.staAndandoOvest() )
				{
					serpente.vaiVersoEst();
				}
 		}
} 
