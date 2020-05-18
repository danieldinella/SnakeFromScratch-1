import java.awt.Color;
import javax.swing.JPanel;

public class Quadratino extends JPanel
{
	public int tipo;


	public Quadratino( int t )
	{
		setToTipo( t );

    }

	public Quadratino(  )
	{
		setToTipo( Quadratino.PRATO );

    }



	public boolean isPrato ( ) 
	{ 
		return (this.tipo==PRATO);
	}
	
	public boolean isCibo ( ) 
	{ 
		return (this.tipo==CIBO);
	}
	
	
	
	private void setToTipo ( int t )
	{
				
		switch (t) 
		{
            case PRATO:
					 this.setBackground(Color.GREEN);
                     this.tipo = PRATO;
                     break;
            case SERPENTE: 
 					 this.setBackground(Color.YELLOW);
                     this.tipo = SERPENTE;
                     break;
            case CIBO: 
 					 this.setBackground(Color.RED );
                     this.tipo = CIBO;
                     break;
            default: // TODO : motivare ...........
					 this.setBackground(Color.WHITE);
                     this.tipo = PRATO;
                     break;
                     
            
		};
		//this.validate();
        this.repaint();
	}



	public void setToPrato( ) 
	{
			setToTipo( PRATO );
			
	}
	
	public void setToSerpente( ) 
	{ 
			setToTipo( SERPENTE );
			
	}
	
	public void setToCibo( ) 
	{
			setToTipo( CIBO );
			
	}
		  
    public static final int PRATO       = 0 ;
	public static final int SERPENTE    = 2 ;
	public static final int CIBO        = 1 ;

	
}
