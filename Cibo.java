import  java.util.Random ;

public class Cibo
{
	
	private PuntoDelCampo posizione;
	private Partita partita;
	private CampoDiGioco campo;
    public  Cibo ( Partita p)
	{
		partita = p;
		campo = partita.getCampoDiGioco();
		
		posizione= new PuntoDelCampo(5,5);
		
		campo.getQuadratino(posizione).setToCibo( ) ;

    }

	public void genera()
    { Random random = new Random();
		int r; int c ;
        do 
        { 
		    r  = random.nextInt(19);
            c  = random.nextInt(19);
        }
        while ( ! campo.getQuadratino( r  , c ).isPrato() ) ;
        
        posizione = new PuntoDelCampo(r,c);
        campo.getQuadratino(posizione).setToCibo();

    }




}
