import javax.swing.JPanel;

public class Partita extends JPanel 
{
	private CampoDiGioco campo ;
	
	private Serpente serpente ;
	
	private Cibo cibo ; 
	

	public  Partita ( )
	{	
		this.campo = new CampoDiGioco() ; 
		campo.inizializzaTuttoPrato();
		
		this.add( this.campo);
	
		serpente=new Serpente(this);
        
        KeyboardAscoltatore ka = new KeyboardAscoltatore(serpente);
	    this.addKeyListener(ka);
	    
	    cibo = new Cibo(this );
	    	    
	    requestFocusInWindow();
	}
	
	public void gioca()
	{   
		requestFocusInWindow();      
		
		serpente.start();
    
		try
		{
			serpente.join();  
		}
		catch(Exception e){System.out.println(e);}  
    
    
    }
	public CampoDiGioco getCampoDiGioco()
    {
        return campo;
    }
    

}

