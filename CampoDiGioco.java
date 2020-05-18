import javax.swing.JPanel;
import java.awt.GridLayout;

public class CampoDiGioco extends JPanel
{
	private Quadratino[][] matrice = new Quadratino [20][20];
	
	public  CampoDiGioco ( )
	{
		super(new GridLayout (20,20) );
		for (int r =0 ; r<20; r++ ) 
			for (int c = 0 ; c<20; c++ ) 
			{  
				matrice[r][c]= new Quadratino( )  ;
				this.add(matrice[r][c]).setLocation(r, c) ;

			} ;
		
	}
	
	public void inizializzaTuttoPrato()
	{					
		for (int r =0 ; r<20; r++ ) 
			for (int c = 0 ; c<20; c++ ) 
			{  
				matrice[r][c].setToPrato();
				
			} ;
			
			
			
    }	;
  	
	public Quadratino getQuadratino( PuntoDelCampo punto )
	{
		return (matrice[punto.getR()][punto.getC()]) ;
	}	

	public Quadratino getQuadratino( int r, int c )
	{
		return (matrice[r][c]) ;
	}	
}
